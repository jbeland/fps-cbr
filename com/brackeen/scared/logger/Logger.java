package com.brackeen.scared.logger;

/**
 * This class is the singleton class to be used to access the logging utility.
 * 
 * @author Jordan
 *
 */
public class Logger {

	private static Logger instance;

	private Logger() {
	}

	public static Logger getInstance() {
		if (instance == null)
			instance = new Logger();
		return instance;
	}

	public void log(String toLog) {
		Thread logger = new Thread(new LogWriter(toLog));
    	logger.start();
	}

}
