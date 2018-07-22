package com.liao.BufferedDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
 public static void test() {
	 try {
		Writer writer = new FileWriter("G:/demo/demo4.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		bufferedWriter.write("ƒ„∫√ ¿ΩÁ");
		bufferedWriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
