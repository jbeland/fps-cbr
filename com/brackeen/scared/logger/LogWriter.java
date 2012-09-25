package com.brackeen.scared.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 * This class handles writing the individual logs to the log file.
 * 
 * @author Jordan
 *
 */
public class LogWriter implements Runnable {
	
	private String toLog;

	public LogWriter(String toLog){
		this.toLog = toLog;		
	}
	 
	 public void writeToFile(){
			BufferedWriter writer = null;
			try {
				writer = new BufferedWriter(new FileWriter("c:\\logFile.txt", true));
				writer.write(toLog);
				writer.newLine();

			} catch (IOException e) {
				System.out.println("ERROR");
			} finally {
				try {
					if (writer != null)
						writer.close();
					System.out.println("Written: " + toLog);
				} catch (IOException e) {
					System.out.println("ERROR");
				}

			}
		}

	@Override
	public void run() {
		writeToFile();
	}

}
