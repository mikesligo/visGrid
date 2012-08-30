package org.LiveGraph.dataFile.read;

import java.io.IOException;
import java.io.InputStream;

import org.LiveGraph.dataFile.common.PipeClosedByReaderException;
import org.LiveGraph.dataFile.common.PipeFullException;
import org.LiveGraph.dataFile.common.PipeNotConnectedException;
import org.LiveGraph.dataFile.write.PipedOutputStream;


/**
 * This class makes Java's own {@code PipedInputStream} fit for reading by multiple Threads as
 * required for LiveGraph.<br />
 * <p>The thread handling built into Java's {@code java.io.PipedInputStream} gives, at the very best,
 * reasons to hope for improvement. Sun seems to be aware of the problem: for instance, a Java API
 * developer writes directly in the source comments of the officially distributed JDK 1.6.0 source
 * package: &quot<em>[...] identification of the read and write sides needs to be more
 * sophisticated [...]</em>;&quot; (see the non-JavDoc comments in the source for
 * {@code java.io.PipedInputStream}, JDK 1.6.0, lines 38-41). However, to date the problem remains.</p>
 * <p>For LiveGraph specifically, the problem is that {@code PipedInputStream} remembers
 * the {@code Thread} that performed the latest read operation and checks before the following
 * receive operation from the {@code PipedOutputStream}, whether that {@code Thread} is still alive.
 * However, LiveGraph creates a new {@code Thread} for each update in order to make sure that the
 * application remians responsive even if the amount of new data is large, the old threads are
 * discarded, which causes {@code PipedInputStream} to throw an exception.<br />
 * As a second problem, {@code PipedInputStream} causes the {@code write}-call of the
 * {@code PipedOutputStream} to block indefinetly if the memory buffer is full. If the LiveGraph update
 * frequency is set to low, the buffer may fill up which would cause the data producing part of the
 * application to block. This is highly undesirable - while a short, time-limited block may be ok,
 * an exception should be thrown if the buffer remains full for a long time to indicate to the developer
 * that the chosen buffer size is not sufficiently large for the particular application.</p>
 * <p>Unfortunately, the choice of scope classifiers for several methods in
 * {@code java.io.PipedInputStream} is less than perfect. For instance, the method
 * {@code receive(byte b[], int off, int len)} has package scope and cannot be overridden to
 * resolve the above issues. In addition, the inapropriate use of package-visible variables such
 * as {@code connected} instead of getter and setter methods makes overriding attampts useless. This
 * forces LiveGraph to subclass {@code InputStream} directly to greate a better version of a piped input
 * stream and reimplement <em>all</em> of {@code java.io.PipedInputStream}'s methods, thus unnecessarily
 * replicating a lot of code. This may become unnecessary in future if the above problems are resolved
 * or if LiveGraph is adapted to use the {@code java.nio} channel-based I/O instead of the
 * traditional {@code java.io} stream-based approach (this would be a good idea anyway, if time permits
 * to make these changes at some point in the future). For now, the source code of this class is copied
 * from {@code java.io.PipedInputStream} that is dispributed in the source package for JDK 1.6.0 and
 * changed where necessary.</p>
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: PipedInputStream.java</p>
 * <p style="font-size:smaller;">Redistribution and use in source and binary forms, with or
 *    without modification, are permitted provided that the following terms and conditions are met:
 * </p>
 * <p style="font-size:smaller;">1. Redistributions of source code must retain the above
 *    acknowledgement of the LiveGraph project and its web-site, the above copyright notice,
 *    this list of conditions and the following disclaimer.<br />
 *    2. Redistributions in binary form must reproduce the above acknowledgement of the
 *    LiveGraph project and its web-site, the above copyright notice, this list of conditions
 *    and the following disclaimer in the documentation and/or other materials provided with
 *    the distribution.<br />
 *    3. All advertising materials mentioning features or use of this software or any derived
 *    software must display the following acknowledgement:<br />
 *    <em>This product includes software developed by the LiveGraph project and its
 *    contributors.<br />(http://www.live-graph.org)</em><br />
 *    4. All advertising materials distributed in form of HTML pages or any other technology
 *    permitting active hyper-links that mention features or use of this software or any
 *    derived software must display the acknowledgment specified in condition 3 of this
 *    agreement, and in addition, include a visible and working hyper-link to the LiveGraph
 *    homepage (http://www.live-graph.org).
 * </p>
 * <p style="font-size:smaller;">THIS SOFTWARE IS PROVIDED &quot;AS IS&quot;, WITHOUT WARRANTY
 *    OF ANY KIND, EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *    MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND  NONINFRINGEMENT. IN NO EVENT SHALL
 *    THE AUTHORS, CONTRIBUTORS OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM, OUT OF OR
 *    IN CONNECTION WITH THE SOFTWARE OR THE USE OR  OTHER DEALINGS IN THE SOFTWARE.
 * </p>
 * 
 * @author Greg Paperin (<a href="http://www.paperin.org" target="_blank">http://www.paperin.org</a>)
 * @version {@value org.LiveGraph.LiveGraph#version}
 * @see java.io.PipedInputStream
 */
public class PipedInputStream extends InputStream {


private static final int DEFAULT_PIPE_SIZE = 1024; // bytes
private static final long DEFAULT_MAX_BLOCK_DURATION = 2000; // millisseconds


private boolean closedByWriter = false;
private boolean closedByReader = false;
private boolean connected = false;

private long maxBlockDuration = DEFAULT_MAX_BLOCK_DURATION;
private long poolingPeriod = Math.min(1000L, Math.max(1L, DEFAULT_MAX_BLOCK_DURATION / 5L));


/**
 * The circular buffer into which incoming data is placed.
 */
private byte buffer[];

/**
 * The index of the position in the circular buffer at which the next byte of data will be
 * stored when received from the connected piped output stream. <code>in&lt;0</code> implies
 * the buffer is empty, <code>in==out</code> implies the buffer is full
 */
private int in = -1;

/**
 * The index of the position in the circular buffer at which the next byte of data will be
 * read by this piped input stream.
 */
private int out = 0;

/**
 * Creates a <code>PipedInputStream</code> so that it is not yet
 * {@linkplain #connect(org.LiveGraph.dataFile.write.PipedOutputStream) connected}.
 * It must be connected to a <code>PipedOutputStream</code> before being used.
 */
public PipedInputStream() {
	initPipe(DEFAULT_PIPE_SIZE);
}

/**
 * Creates a <code>PipedInputStream</code> so that it is not yet
 * {@linkplain #connect(org.LiveGraph.dataFile.write.PipedOutputStream) connected} and uses the
 * specified pipe size for the pipe's buffer.
 * It must be connected to a <code>PipedOutputStream</code> before being used.
 *
 * @param      pipeSize the size of the pipe's buffer.
 * @exception  IllegalArgumentException if <code>pipeSize <= 0</code>.
 */
public PipedInputStream(int pipeSize) {
	initPipe(pipeSize);
}

/**
 * Creates a <code>PipedInputStream</code> so that it is connected to the piped output
 * stream <code>src</code>. Data bytes written to <code>src</code> will then be available
 * as input from this stream.
 *
 * @param      src   the stream to connect to.
 * @exception  IOException  if an I/O error occurs.
 */
public PipedInputStream(PipedOutputStream src) throws IOException {
    this(src, DEFAULT_PIPE_SIZE);
}

/**
 * Creates a <code>PipedInputStream</code> so that it is connected to the piped output stream
 * <code>src</code> and uses the specified pipe size for the pipe's buffer.
 * Data bytes written to <code>src</code> will then be available as input from this stream.
 *
 * @param      src   the stream to connect to.
 * @param      pipeSize the size of the pipe's buffer.
 * @exception  IOException  if an I/O error occurs.
 * @exception  IllegalArgumentException if <code>pipeSize <= 0</code>.
 */
public PipedInputStream(PipedOutputStream src, int pipeSize) throws IOException {
	initPipe(pipeSize);
	connect(src);
}

private void initPipe(int pipeSize) {
	if (pipeSize <= 0)
    	 throw new IllegalArgumentException("Pipe Size <= 0");
     buffer = new byte[pipeSize];
}

/**
 * Causes this piped input stream to be connected to the piped output stream <code>src</code>.
 * If this object is already connected to some other piped output  stream, an <code>IOException</code>
 * is thrown.<br />
 * If <code>src</code> is an unconnected piped output stream and <code>snk</code>
 * is an unconnected piped input stream, they may be connected by either the call:<br />
 * <pre><code>snk.connect(src)</code></pre><br />
 * or the call:<br />
 * <pre><code>src.connect(snk)</code></pre><br />
 * The two calls have the same effect.
 *
 * @param      src   The piped output stream to connect to.
 * @exception  IOException  if an I/O error occurs.
 */
public void connect(PipedOutputStream src) throws IOException {
	
	if (null == src)
		throw new NullPointerException("Cannot connect to a null source");
	
	src.connect(this);
	
	this.in = -1;
	this.out = 0;
	this.setConnected(true);
}

public synchronized void setMaxBlockDuration(long v) {
	maxBlockDuration = Math.max(0L, v);
	poolingPeriod = Math.min(1000L, Math.max(1L, maxBlockDuration / 5L));
}

public synchronized long getMaxBlockDuration() {
	return maxBlockDuration;
}

protected synchronized boolean getClosedByWriter() {
	return closedByWriter;
}

protected synchronized void setClosedByWriter(boolean v) {
	closedByWriter = v;
}

protected synchronized boolean getClosedByReader() {
	return closedByReader; 
}

protected synchronized void setClosedByReader(boolean v) {
	closedByReader = v; 
}

public synchronized boolean getConnected() {
	return connected;
}

protected synchronized void setConnected(boolean v) {
	connected = v;
}

/**
 * Receives a byte of data. This method will block if no input is available.
 * @param b the byte being received
 * @exception IOException If the pipe is broken,
 * {@link #connect(org.LiveGraph.dataFile.write.PipedOutputStream) unconnected}, closed, or if an
 * I/O error occurs; specifically, a {@link PipeFullException}, if the receiving buffer is full
 * and waiting times out.
 */
public synchronized void receive(int b) throws IOException {
	
    awaitSpace();
    
    if (in < 0) {
    	in = 0;
    	out = 0;
    }
    
    buffer[in++] = (byte)(b & 0xFF);
    if (in >= buffer.length)
    	in = 0;
}

/**
 * Receives data into an array of bytes. This method will block until some input is available.
 * @param b the buffer into which the data is received
 * @param off the start offset of the data
 * @param len the maximum number of bytes received
 * @exception IOException If the pipe is broken,
 * {@link #connect(org.LiveGraph.dataFile.write.PipedOutputStream) unconnected}, closed, or if an
 * I/O error occurs; specifically, a {@link PipeFullException}, if the receiving buffer is full
 * and waiting times out.
 */
public synchronized void receive(byte b[], int off, int len)  throws IOException {
	
	int bytesToTransfer = len;
	
	while (bytesToTransfer > 0) {
		
		awaitSpace();
		
		int nextTransferAmount = 0;
		if (out < in) {
			nextTransferAmount = buffer.length - in;
		} else if (out > in) {
			if (in == -1) {
				in = out = 0;
				nextTransferAmount = buffer.length - in;
			} else {
				nextTransferAmount = out - in;
			}
		}
		
		if (nextTransferAmount > bytesToTransfer)
			nextTransferAmount = bytesToTransfer;
		
		assert(nextTransferAmount > 0);
		
		System.arraycopy(b, off, buffer, in, nextTransferAmount);
		
		bytesToTransfer -= nextTransferAmount;
		off += nextTransferAmount;
		in += nextTransferAmount;
		if (in >= buffer.length)
			in = 0;
	}
}

private void checkStateForReceive() throws IOException {
	
	if (!getConnected())
		throw new PipeNotConnectedException("Pipe not connected");
	
	if (getClosedByWriter())
		throw new PipeClosedByReaderException("Pipe closed by writer");
	
	if (getClosedByReader())
		throw new PipeClosedByReaderException("Pipe closed by reader");
	
}


private void awaitSpace() throws IOException {
	
	checkStateForReceive();
	
	if (in != out)
		return;
	
	long startedWaiting = System.currentTimeMillis();
	
	while (in == out) {
		checkStateForReceive();
		
		if (System.currentTimeMillis() - startedWaiting > maxBlockDuration)
			throw new PipeFullException("Cannot receive data: buffer full?");
		
		// kick any waiting readers and wait:
		notifyAll();
		try { wait(poolingPeriod); }
		catch (InterruptedException ex) { }
	}
}

/**
 * Notifies all waiting threads that the last byte of data has been
 * received.
 */
public synchronized void receivedLast() {
	setClosedByWriter(true);
	notifyAll();
}

/**
 * Reads the next byte of data from this piped input stream. The value byte is returned as
 * an <code>int</code> in the range <code>0</code> to <code>255</code>. This method blocks
 * until input data is available, the end of the stream is detected, or an exception is thrown.
 *
 * @return     the next byte of data, or <code>-1</code> if the end of the
 *             stream is reached.
 * @exception  IOException  if the pipe is
 * {@link #connect(org.LiveGraph.dataFile.write.PipedOutputStream) unconnected}, broken, closed, or if an
 * I/O error occurs.
 */
@Override
public synchronized int read() throws IOException {
	
	if (!getConnected()) {
		throw new PipeNotConnectedException("Pipe not connected");
	} else if (getClosedByReader()) {
		throw new PipeClosedByReaderException("Pipe closed by reader");
	}
	
	// Wait for data:
	if (in < 0) {
		while (in < 0) {
			
			// If closed by writer, return EOF
			if (getClosedByWriter())
				return -1;
			
			// Might be a writer waiting:
			notifyAll();
			try { wait(poolingPeriod); }
			catch (InterruptedException ex) { }
		}
	}
	
	int ret = buffer[out++] & 0xFF;
	if (out >= buffer.length)
		out = 0;
	
	if (in == out)
		in = -1;

	return ret;
}

/**
 * Reads up to <code>len</code> bytes of data from this piped input stream into an array of bytes.
 * Less than <code>len</code> bytes will be read if the end of the data stream is reached or if 
 * <code>len</code> exceeds the pipe's buffer size. If <code>len </code> is zero, then no bytes
 * are read and 0 is returned; otherwise, the method blocks until at least 1 byte of input is 
 * available, end of the stream has been detected, or an exception is thrown.
 *
 * @param      b     the buffer into which the data is read.
 * @param      off   the start offset in the destination array <code>b</code>
 * @param      len   the maximum number of bytes read.
 * @return     the total number of bytes read into the buffer, or <code>-1</code> if there is no
 * 			more data because the end of the stream has been reached.
 * @exception  NullPointerException If <code>b</code> is <code>null</code>.
 * @exception  IndexOutOfBoundsException If <code>off</code> is negative, 
 * <code>len</code> is negative, or <code>len</code> is greater than 
 * <code>b.length - off</code>
 * @exception  IOException if the pipe is broken,
 * {@link #connect(org.LiveGraph.dataFile.write.PipedOutputStream) unconnected}, closed, or if an
 * I/O error occurs.
 */
@Override
public synchronized int read(byte b[], int off, int len)  throws IOException {
	
	if (null == b)
		throw new NullPointerException("Cannot read into a null buffer");
		
	if (off < 0 || len < 0 || len > b.length - off)
		throw new IndexOutOfBoundsException();
		
	if (len == 0)
		return 0;

    // Possibly wait on the first character:
	int c = read();
	if (c < 0)
		return -1;

	b[off] = (byte) c;
	int rlen = 1;
	while (in >= 0 && len > 1) {
    
		int available; 

		if (in > out)
			available = Math.min((buffer.length - out), (in - out));
		else
			available = buffer.length - out;

		// A byte is read beforehand outside the loop
		if (available > (len - 1))
			available = len - 1;
	
		System.arraycopy(buffer, out, b, off + rlen, available);
		out += available;
		rlen += available; 
		len -= available;
    
		if (out >= buffer.length)
			out = 0;
		
		if (in == out)
			in = -1;
	}
	
	return rlen;
}

/**
 * Returns the number of bytes that can be read from this input stream without blocking.
 *
 * @return the number of bytes that can be read from this input stream without blocking,
 * 		   or {@code 0} if this input stream has been closed by invoking its {@link #close()} method,
 * 		   or if the pipe is {@link #connect(org.LiveGraph.dataFile.write.PipedOutputStream) unconnected},
 * 		   or broken.
 * @exception  IOException  if an I/O error occurs.
 */
@Override
public synchronized int available() throws IOException {
	
	if (in < 0)
		return 0;
	
	if (in == out)
		return buffer.length;
	
	if (in > out)
		return in - out;
	
	return in + buffer.length - out;
}

/**
 * Closes this piped input stream and releases any system resources associated with the stream.
 * @exception  IOException  if an I/O error occurs.
 */
@Override
public synchronized void close() throws IOException {
	setClosedByReader(true);
	in = -1;
}

}  // public class PipedInputStream
