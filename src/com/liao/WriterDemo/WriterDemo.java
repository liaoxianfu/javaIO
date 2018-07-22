package com.liao.WriterDemo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WriterDemo {
	public static void main(String[] args) throws Exception {
//		test1();
//		test2();
		CopyStringFiles.copyStrFiles("G:/demo/demo2.txt", "G:/demo/demo3.txt");
	}
	public static void test1() throws Exception {
		FileWriter fileWriter = new FileWriter("G:/demo/demo3.txt", true);
		String str="hfsdjfsdjsidfjskfpsdlfsd;sd";
		fileWriter.write(str);
		fileWriter.close();
	}
	public static void test2() throws Exception {
		OutputStream out = new FileOutputStream("G:/demo/demo.txt");
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(out, "UTF-8");
		String str="Hello world \n ƒ„∫√ ¿ΩÁ";
		outputStreamWriter.write(str);
		outputStreamWriter.close();
	}
}

