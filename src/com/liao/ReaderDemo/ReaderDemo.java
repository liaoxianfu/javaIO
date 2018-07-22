package com.liao.ReaderDemo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReaderDemo {
	public static void main(String[] args) throws Exception {
//		test1();
		test2();
	}
	
	/*
	 * FileReader
	 */
	@SuppressWarnings("unused")
	private static void test1() throws Exception {
		FileReader fileReader = new FileReader("G:/demo/demo2.txt");
		String encoding = fileReader.getEncoding();
		System.out.println(encoding);
		char[] ch = new char[200];
		int num=0;
		while((num = fileReader.read(ch))!=-1) {
			String s = new String(ch,0,num); //  限定读取的数组问0，num
			System.out.print(s);
		}
		fileReader.close();
	}
	
	/**
	 * InputstreamReader
	 * @throws Exception 
	 */
	
	private static void test2() throws Exception {
		InputStream in = new FileInputStream("G:/demo/demo2.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(in, "GBK");
		int num=0;
		char[] ch = new char[20];
		while ((num=inputStreamReader.read(ch))!=-1) {
			String string = new String(ch,0,num);
			System.out.print(string);
		}
		inputStreamReader.close();
		in.close();
	}
}
