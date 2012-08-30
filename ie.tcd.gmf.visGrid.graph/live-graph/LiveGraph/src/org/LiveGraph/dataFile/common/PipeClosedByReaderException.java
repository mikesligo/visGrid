
package org.LiveGraph.dataFile.common;

import java.io.IOException;

public class PipeClosedByReaderException extends IOException {

public PipeClosedByReaderException() {
	super();
}

public PipeClosedByReaderException(String msg) {
	super(null == msg ? "" : msg);
}

}