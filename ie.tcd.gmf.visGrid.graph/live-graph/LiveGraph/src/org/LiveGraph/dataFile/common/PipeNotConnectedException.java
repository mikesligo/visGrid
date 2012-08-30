package org.LiveGraph.dataFile.common;

import java.io.IOException;

public class PipeNotConnectedException extends IOException {

public PipeNotConnectedException() {
	super();
}

public PipeNotConnectedException(String msg) {
	super(null == msg ? "" : msg);
}

}