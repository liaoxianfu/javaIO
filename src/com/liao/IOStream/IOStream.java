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
	 * 四种构造方法
	 * @throws FileNotFoundException 
	 */
	private static void test1() throws FileNotFoundException  {
	
		File path = new File("G:/demo");
		File file = new File(path,"demo.txt");
		// 判断文件夹是否存在
		boolean exists = path.exists();
		if(!exists) {
			boolean mkdirs = path.mkdirs();
			System.out.println(mkdirs);
		}

		
		// 第一种 FilOutputStream(file)
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		// 第二种 表示可以追加
		FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
		// 第三种
		String filePath = "G:/demo/demo2.txt";
		FileOutputStream fileOutputStream3 = new FileOutputStream(filePath);
		// 第四种
		FileOutputStream fileOutputStream4 = new FileOutputStream(filePath, true);
		
	}
	
	/**
	 * 文件的写入
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
	 * 文件写入
	 */
	private static void test3() throws IOException {
		String filePath = "G:/demo/demo.txt";
		FileOutputStream fos = new FileOutputStream(filePath);
		String str ="hello world";
		fos.write(str.getBytes(),1,5); // 从0开始计数，不包括end 
		fos.close();
	}
	
	private static void test4() throws IOException {
		String filePath = "G:/demo/demo.txt";
		FileOutputStream fos = new FileOutputStream(filePath,true);
		String str ="hello world";
		fos.write(str.getBytes(),1,5); // 从0开始计数，不包括end 
		fos.close();
	}

}
