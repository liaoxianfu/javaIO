package com.liao.InputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {

//		test1();
		readTest();
	}

	/**
	 * FileInputStream的构造方法
	 * 
	 * @throws Exception
	 */

	public static void test1() throws Exception {
		// 1
		File file = new File("G:/demo/demo.txt");
		FileInputStream fis = new FileInputStream(file);
		// 2
		String filePath = "G:/demo/demo2.txt";
		FileInputStream fis2 = new FileInputStream(filePath);

	}

	private static void readTest() throws Exception {
		byte[] bs = new byte[1024];
		String filePath = "G:/demo/demo2.txt";
		FileInputStream fis = new FileInputStream(filePath);
		while (fis.read(bs)!=-1) {
			String s = new String(bs);
			System.out.println(s);
		}
		fis.close();
		
	}

}
