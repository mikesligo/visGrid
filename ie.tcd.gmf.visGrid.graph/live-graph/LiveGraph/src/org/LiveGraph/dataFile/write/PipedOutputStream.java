package org.LiveGraph.dataFile.write;

import java.io.IOException;
import java.io.OutputStream;

import org.LiveGraph.dataFile.common.PipeFullException;
import org.LiveGraph.dataFile.read.PipedInputStream;


public class PipedOutputStream extends OutputStream {


private PipedInputStream sink;

/**
 * Creates a piped output stream that is not yet connected to a piped input stream.
 * It must be connected to a piped input stream, either by the receiver or the sender, before being used. 
 */
public PipedOutputStream() {
	super();
}

/**
 * Creates a piped output stream connected to the specified piped input stream.
 * Data bytes written to this stream will then be available as input from <code>snk</code>.
 * @param      snk   The piped input stream to connect to.
 * @exception  IOException  if an I/O error occurs.
 */
public PipedOutputStream(PipedInputStream snk) throws IOException {
	super();
	connect(snk);
}


/**
 * Connects this piped output stream to a receiver. If this object is already connected to some other
 * piped input stream, an <code>IOException</code> is thrown.<br />
 * If <code>snk</code> is an unconnected piped input stream and <code>src</code> is an unconnected piped
 * output stream, they may be connected by either the call:<br />
 * <pre>src.connect(snk)</pre><br />
 * or the call:<br />
 * <pre>snk.connect(src)</pre><br />
 * The two calls have the same effect.
 *
 * @param      sink   the piped input stream to connect to.
 * @exception  IOException  if an I/O error occurs.
 */
public synchronized void connect(PipedInputStream sink) throws IOException {
	
	if (null == sink)
		throw new NullPointerException("Cannot connect to a null sink");
	
	// Prevent recursive calls:
	if (sink == this.sink)
		return;
	
	if (sink.getConnected())
		throw new IOException("Sink is already connected");

	this.sink = sink;
	sink.connect(this);
}

/**
 * Writes the specified <code>byte</code> to the piped output stream. <br />
 * Implements the <code>write</code> method of <code>OutputStream</code>.
 * This method blocks for a while to wait until the byte is written to
 * the output stream, but quits the block and throws a {@code PipedInputStream.PipeFullException} if
 * the data cannot be written within a certain time period.
 *
 * @param      b   the <code>byte</code> to be written.
 * @exception IOException if the pipe is broken,
 * {@link #connect(org.LiveGraph.dataFile.read.PipedInputStream) unconnected}, closed,
 * or if an I/O error occurs; specifically, a {link {@link PipeFullException}, if the
 * receiving buffer is full and waiting times out.
 */
@Override
public void write(int b)  throws IOException {
	
    if (null == sink)
    	throw new IOException("Pipe not connected");
    
    sink.receive(b);
}

/**
 * Writes <code>len</code> bytes from the specified byte array starting at offset <code>off</code> to
 * this piped output stream. This method blocks for a while to wait until all the bytes are written to
 * the output stream, but quits the block and throws a {@code PipedInputStream.PipeFullException} if
 * the data cannot be written within a certain time period.
 *
 * @param      b     the data.
 * @param      off   the start offset in the data.
 * @param      len   the number of bytes to write.
 * @exception IOException if the pipe is broken,
 * {@link #connect(org.LiveGraph.dataFile.read.PipedInputStream) unconnected}, closed,
 * or if an I/O error occurs; specifically, a {link {@link PipeFullException}, if the
 * receiving buffer is full and waiting times out.
 */
@Override
public void write(byte b[], int off, int len) throws IOException {
	
	if (null == sink)
		throw new IOException("Pipe not connected");
		
	if (null == b )
		throw new NullPointerException("Cannot read into a new buffer");
		
	if ( (off < 0) || (off > b.length) || (len < 0) || (off + len > b.length) || (off + len < 0) )
		throw new IndexOutOfBoundsException();

	if (len == 0)
		return;

	sink.receive(b, off, len);
}

/**
 * Flushes this output stream and forces any buffered output bytes  to be written out. 
 * This will notify any readers that bytes are waiting in the pipe.
 *
 * @exception IOException if an I/O error occurs.
 */
@Override
public synchronized void flush() throws IOException {
	if (null != sink) {
		synchronized (sink) {
			sink.notifyAll();
		}
	}
}

/**
 * Closes this piped output stream and releases any system resources associated with this stream.
 * This stream may no longer be used for writing bytes.
 *
 * @exception  IOException  if an I/O error occurs.
 */
@Override
public void close() throws IOException {
	if (null == sink)
		return;
	sink.receivedLast();
}


}  // public class PipedOutputStream
