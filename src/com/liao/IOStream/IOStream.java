package com.liao.IOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStream {
	public static void main(String[] args) throws Exception {
//		test1();
//		tst2();
		test3();
	}

	/**
	 * ���ֹ��췽��
	 * @throws FileNotFoundException 
	 */
	private static void test1() throws FileNotFoundException  {
	
		File path = new File("G:/demo");
		File file = new File(path,"demo.txt");
		// �ж��ļ����Ƿ����
		boolean exists = path.exists();
		if(!exists) {
			boolean mkdirs = path.mkdirs();
			System.out.println(mkdirs);
		}

		
		// ��һ�� FilOutputStream(file)
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		// �ڶ��� ��ʾ����׷��
		FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
		// ������
		String filePath = "G:/demo/demo2.txt";
		FileOutputStream fileOutputStream3 = new FileOutputStream(filePath);
		// ������
		FileOutputStream fileOutputStream4 = new FileOutputStream(filePath, true);
		
	}
	
	/**
	 * �ļ���д��
	 * @throws IOException 
	 */
	private static void tst2() throws IOException {
		String filePath = "G:/demo/demo2.txt";
		FileOutputStream fos = new FileOutputStream(filePath);
		String str ="hello world";
		fos.write(str.getBytes());
		fos.close();
	}
	
	/**
	 * �ļ�д��
	 */
	private static void test3() throws IOException {
		String filePath = "G:/demo/demo.txt";
		FileOutputStream fos = new FileOutputStream(filePath);
		String str ="hello world";
		fos.write(str.getBytes(),1,5); // ��0��ʼ������������end 
		fos.close();
	}
	
	private static void test4() throws IOException {
		String filePath = "G:/demo/demo.txt";
		FileOutputStream fos = new FileOutputStream(filePath,true);
		String str ="hello world";
		fos.write(str.getBytes(),1,5); // ��0��ʼ������������end 
		fos.close();
	}

}
