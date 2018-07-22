package com.liao.PropertiesDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class PropertiesDemo {
	public static void loadProperties() throws IOException {

		Properties properties = new Properties();
		FileReader reader = new FileReader("demo.properties");

		properties.load(reader);
		reader.close();
		System.out.println(properties);
		String name = properties.getProperty("name");
		System.out.println(name);
	}

	public static void saveProperties() throws IOException {
		Properties properties = new Properties();
		Writer writer = new FileWriter("demo.properties");
		properties.setProperty("name", "liao");
		properties.setProperty("age", "15");
		properties.setProperty("sex", "man");
		properties.store(writer, "Person info");
		writer.close();
		System.out.println("end");
	}

}
