package com.jbk.utility;

import java.io.FileInputStream;
import java.util.Properties;
// ctrl +shift + R
// ctrl shift + o
//trl + Q
// Alt + <-
public class LoadPropertyWithSingleton {
	private static LoadPropertyWithSingleton loadPropertyWithSingleton = null;
	static Properties pp = null;

	private LoadPropertyWithSingleton() throws Exception {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\data.properties");
		pp = new Properties();
		pp.load(fis);
	}

	public static synchronized LoadPropertyWithSingleton someobject() throws Exception {
		if (loadPropertyWithSingleton == null) {
			loadPropertyWithSingleton = new LoadPropertyWithSingleton();
		}
		return loadPropertyWithSingleton;
	}

	public static String getValueForANyProperty(String key) {
		return pp.getProperty(key);
	}


}
