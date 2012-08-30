package org.LiveGraph.bootstrap;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.LiveGraph.settings.DataFileSettings;
import org.LiveGraph.settings.DataSeriesSettings;
import org.LiveGraph.settings.GraphSettings;

/**
 * This class represents a parser for command line arguments for a LiveGraph application.
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: CommandLineProcessor.java</p>
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
 *
 */
public class CommandLineProcessor {

/**
 * System specific new-line string.
 */
public static final String newLine = String.format("%n");

/**
 * Message specifying the correct usage of command line argumnts.
 */
public static final String correctPromptMsg =
			"Legal command line arguments are as follows: " + newLine
		  + "    > java edu.monash.LiveGraph.LiveGraph [-dfs \"{data file settings file}\"] " + newLine
		  + "                                          [-gs \"{graph settings file}\"] " + newLine
		  + "                                          [-dss \"{data series settings file}\"] " + newLine
		  + "                                          [-f \"{actual data file}\"] " + newLine
		  + "    This means the program expects either 0, 2, 4, 6 or 8 command line arguments. " + newLine
		  + "    Note: '-f' overrides any data file that may be specified within " + newLine
		  + "          a data file settings file that may be set with '-dfs'.";


/**
 * Holds any error messages occured during parsing.
 */
private List<String> errMessages = new ArrayList<String>();

/**
 * Flag set when any errors during argument parsing or validation occur.
 */
private boolean hasError = false;


/**
 * Command line arguments to parse.
 */
private String[] args = null;

/**
 * The data file settings file if such was parsed.
 */
private File file_DataFileSettings = null;

/**
 * The graph settings file if such was parsed.
 */
private File file_GraphSettings = null;

/**
 * The data series settings file if such was parsed.
 */
private File file_DataSeriesSettings = null;

/**
 * The data file if such was parsed.
 */
private File file_Data = null;


/**
 * Initialises the parser for an empty command line.
 *
 */
public CommandLineProcessor() {
	this.args = new String[0];
	processArgs();
}


/**
 * Initialises the parser for the specified command line arguments.
 * 
 * @param args Command line arguments.
 */
public CommandLineProcessor(String[] args) {
	if (null == args) {
		this.args = new String[0];
	} else {
		this.args = new String[args.length];
		for (int i = 0; i < args.length; i++)
			this.args[i] = args[i];
	}
	processArgs();
}


/**
 * Used internally to process the arguments.
 * First, parses the command line.
 * Then, tries to apply default settings for arguments not specified on the command line.
 */
private void processArgs() {
	parseArgs();
	supplementWithDefaults();
}


/**
 * If data file, graph or data series settings are not set, checks whether the
 * apropriate session.lgdfs, session.lggs and session.lgdss files are available
 * and, if so, sets the argument values appropriately. 
 */
private void supplementWithDefaults() {
	
	if (null == getFile_DataFileSettings()) {
		File f = new File("session" + DataFileSettings.preferredFileExtension);
		try {
			if (f.exists())
				setFile_DataFileSettings(f.getAbsoluteFile());
		} catch(SecurityException e) {}
	}
	
	if (null == getFile_GraphSettings()) {
		try {
			File f = new File("session" + GraphSettings.preferredFileExtension); 
			if (f.exists())
				setFile_GraphSettings(f.getAbsoluteFile());
		} catch(SecurityException e) {}
	}
	
	if (null == getFile_DataSeriesSettings()) {
		try {
			File f = new File("session" + DataSeriesSettings.preferredFileExtension); 
			if (f.exists())
				setFile_DataSeriesSettings(f.getAbsoluteFile());
		} catch(SecurityException e) {}
	}
	
	// No default for data file!
}


/**
 * Parses the command line arguments for legal settings values.
 */
private void parseArgs() {
	
	int parseIndex = 0;
	while (parseIndex < args.length) {
		
		String arg = args[parseIndex].trim();
		
		if ("-dfs".equalsIgnoreCase(arg)) {
			File f = parseArgFile2(parseIndex, "file for data file settings", getFile_DataFileSettings());
			if (null != f)
				setFile_DataFileSettings(f.getAbsoluteFile());
			parseIndex += 2;
			continue;
		}
		
		if ("-gs".equalsIgnoreCase(arg)) {
			File f = parseArgFile2(parseIndex, "file for graph settings", getFile_GraphSettings());
			if (null != f)
				setFile_GraphSettings(f.getAbsoluteFile());
			parseIndex += 2;
			continue;
		}
		
		if ("-dss".equalsIgnoreCase(arg)) {
			File f = parseArgFile2(parseIndex, "file for data series settings", getFile_DataSeriesSettings());
			if (null != f)
				setFile_DataSeriesSettings(f.getAbsoluteFile());
			parseIndex += 2;
			continue;
		}
		
		if ("-f".equalsIgnoreCase(arg)) {
			File f = parseArgFile2(parseIndex, "data file", getFile_Data());
			if (null != f)
				setFile_Data(f.getAbsoluteFile());
			parseIndex += 2;
			continue;
		}
		
		error(parseIndex, arg, "This is an illegal argument and cannot be processed. It will be ignored.");
		parseIndex += 1;
	}
}


/**
 * Validates a pair of command line arguments,
 * where the first is a flag and the second is a file path.
 *  
 * @param parseIndex The argument index of the flag, i.e. the first argument of the pair. 
 * @param argDesc A textual description of the current flag (for megsages).
 * @param currValue The current value for the setting corresponding to the flag.
 * 
 * @return A validated File object that stands for the path described by the second argument.
 */
private File parseArgFile2(int parseIndex, String argDesc, File currValue) {
	
	if (parseIndex + 1 >= args.length) {
		error(parseIndex, args[parseIndex],
			  "This argument specifies '" + argDesc + "' and must be followed by a file path.",
			  "However, this argument is not followed by anything. It will be ignored.");
		return null;
	}
	
	String fileName = args[parseIndex + 1].trim();
	
	if (null != currValue) {
		error(parseIndex, args[parseIndex],
			  "This argument specifies '" + argDesc + "' and must be unique.",
			  "However, '" + argDesc + "' is already set to '" + currValue + "'.",
			  "The repeated argument will be ignored.");
		return null;
	}
	
	File file = new File(fileName);
	
	try {
		if (!file.exists()) {
			error(parseIndex, args[parseIndex],
				  "This argument specifies '" + argDesc + "'.",
				  "However, the specified path '" + fileName + "' does not exist.",
				  "This argument will be ignored.");
			return null;
		}
		
		if (!file.canRead()) {
			error(parseIndex, args[parseIndex],
				  "This argument specifies '" + argDesc + "'.",
				  "However, the specified path '" + fileName + "' cannot be read.",
				  "This argument will be ignored.");
			return null;
		}
		
		if (file.isDirectory()) {
			error(parseIndex, args[parseIndex],
				  "This argument specifies '" + argDesc + "'.",
				  "However, the specified path '" + fileName + "' is a directory.",
				  "This argument will be ignored.");
			return null;
		}
		
		if (!file.isFile()) {
			error(parseIndex, args[parseIndex],
				  "This argument specifies '" + argDesc + "'.",
				  "However, the specified path '" + fileName + "' is not a normal file.",
				  "This argument will be ignored.");
			return null;
		}
	} catch(SecurityException e) {
		error(parseIndex, args[parseIndex],
			  "This argument specifies '" + argDesc + "'.",
			  "However, the specified path '" + fileName + "' cannot be accessed by LiveGraph.",
			  "Info: " + e.getMessage() + ".",
			  "This argument will be ignored.");
		return null;
	}
	
	return file;
}


/**
 * Logs an error message.
 * 
 * @param argIndex Index of the argument to which the error relates. 
 * @param argStr The argument to which the error relates.
 * @param messages Error messages.
 */
private void error(int argIndex, String argStr, String... messages) {
	
	StringBuffer s = new StringBuffer();
	
	s.append("Error in command line argument #");
	s.append(argIndex + 1);
	s.append(" (\"");
	s.append(argStr);
	s.append("\")");
	s.append(newLine);
	for (String msg : messages) {
		s.append("    ");
		s.append(msg);
		s.append(newLine);
	}
	
	errMessages.add(s.toString());
	hasError = true;
}


/**
 * Checks whether any errors have occured.
 * 
 * @return {@code true} if at least one error occured during parsing or validation,
 * {@code false} otherwise.
 */
public boolean hasErrors() {
	return hasError;
}


/**
 * Constructs a {@code String} from all error messages that occured during parsing or validation.
 * 
 * @return A verbose message resarding all errors that occured during parsing or validation,
 * or {@code null} if no errors have occured.
 */
public String getErrorMessages() {
	
	if (!hasErrors())
		return null;
	
	StringBuffer s = new StringBuffer();
	for (String msg : errMessages) {
		s.append(msg.trim());
		s.append(newLine);
	}
	s.append(correctPromptMsg.trim());
	s.append(newLine);
	
	return s.toString();
}


/**
 * File for data file settings - either parsed from the command line or the default session file. 
 * @return Validated {@code File} from which LiveGraph should load the data file settings
 * or {@code null} if no file was set or if the file is not present or cannot be accessed.
 */
public File getFile_DataFileSettings() {
	return file_DataFileSettings;
}


/**
 * Sets the file for data file settings - either parsed from the command line or the default session file.
 * @param f Validated {@code File} from which LiveGraph should load the data file settings.
 */
private void setFile_DataFileSettings(File f) {
	file_DataFileSettings = f;
}


/**
 * File for graph settings - either parsed from the command line or the default session file. 
 * @return Validated {@code File} from which LiveGraph should load the graph settings
 * or {@code null} if no file was set or if the file is not present or cannot be accessed.
 */
public File getFile_GraphSettings() {
	return file_GraphSettings;
}


/**
 * Sets the file for graph settings - either parsed from the command line or the default session file.
 * @param f Validated {@code File} from which LiveGraph should load the graph settings.
 */
private void setFile_GraphSettings(File f) {
	file_GraphSettings = f;
}


/**
 * File for data series settings - either parsed from the command line or the default session file. 
 * @return Validated {@code File} from which LiveGraph should load the data series settings
 * or {@code null} if no file was set or if the file is not present or cannot be accessed.
 */
public File getFile_DataSeriesSettings() {
	return file_DataSeriesSettings;
}


/**
 * Sets the file for data series settings - either parsed from the command line or the default session file.
 * @param f Validated {@code File} from which LiveGraph should load the data series settings.
 */
private void setFile_DataSeriesSettings(File f) {
	file_DataSeriesSettings = f;
}


/**
 * Data file - parsed from the command line. 
 * @return Validated {@code File} from which LiveGraph should load the data
 * or {@code null} if no file was set or if the file is not present or cannot be accessed.
 */
public File getFile_Data() {
	return file_Data;
}


/**
 * Sets the data file -parsed from the command line.
 * @param f Validated {@code File} from which LiveGraph should load the data.
 */
private void setFile_Data(File f) {
	file_Data = f;
}


} // class CommandLineProcessor
