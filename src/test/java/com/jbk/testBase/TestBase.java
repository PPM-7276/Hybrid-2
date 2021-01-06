package com.jbk.testBase;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestBase {
	public static Logger logger;
		 public Logger loggerTest(){
			 	logger	=  Logger.getLogger(Logger.class);
				String path=(System.getProperty("user.dir")+"log4j.properties");
				System.out.println(path);
				PropertyConfigurator.configure("E:\\workspace3\\FinalModuleAddUser\\src\\main\\resources\\log4j.properties");
				logger.setLevel(Level.INFO);
				return logger;
			 
		 }
}
