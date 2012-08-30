package org.LiveGraph.dataFile.common;

import java.io.IOException;

public class PipeClosedByWriterException extends IOException {

public PipeClosedByWriterException() {
	super();
}

public PipeClosedByWriterException(String msg) {
	super(null == msg ? "" : msg);
}

}