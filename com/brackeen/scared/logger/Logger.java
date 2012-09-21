package com.brackeen.scared.logger;

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
