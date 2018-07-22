package com.liao.JavaIO;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;


public class IOTest01 {
	public static void main(String[] args) throws IOException {
//		fileTest4();
//		listFileDemo();
		isFile();
	}

	/**
	 * File对象的创建
	 */
	public static void fileTest1() {
		String path = "G:/dmeo.txt";
//			封装成File对象，注意尅呀封装不存在的文件和对象
		File file = new File(path);
		System.out.println(file);
//			根据parent的路径字符串和child路径名字创建一个新的File实例
		File file2 = new File("G:/demo", "demo.txt");
		System.out.println(file2);
//			将parent封装成File对象
		File dir = new File("G:/demo");
		String child = "demo2.txt";
		File file3 = new File(dir, child);
		System.out.println(file3);

	}

	/**
	 * 获取文件的路径
	 */

	public static void fileTest2() {
		/**************** File类的获取 **************/
		File fileDemo = new File("Test2.txt");
		// 获取文件的绝对路径
		String absPath = fileDemo.getAbsolutePath();
		System.out.println(absPath); // E:\Eclipse\JavaIO\Test2.txt
//			获取路径，封装的是什么就是什么
		String path1 = fileDemo.getPath();
		System.out.println(path1);// Test2.txt

	}

	/**
	 * 获取文件的大小
	 */

	public static void fileTest3() {
		// 获取文件的大小
		File fileRar = new File("G:/aaa.rar");
		String absolutePath = fileRar.getAbsolutePath();
		System.out.println("绝对路径是" + absolutePath);
		String name = fileRar.getName();
		System.out.println("文件名称" + name);
		long size = fileRar.length();
		System.out.println("文件大小" + size / 1024.0 + "k");
	}

//		文件和文件夹的创建
	public static void fileTest4() throws IOException {
		File file = new File("G:/demo.txt");
		File file2 = file;
		boolean isCreated = file2.createNewFile();
		System.out.println("文件是否已经创建" + !isCreated);
		boolean isDelete = file.delete();
		System.out.println(isDelete);
//		删除目录时需要先保证目录为空的时才能删除
		File fileDir = new File("G:/dir");
		if (fileDir.exists()) {
			System.out.println("存在目录");
			File fileTxt = new File(fileDir, "a.txt");
			if (fileTxt.exists()) {
				System.out.println("存在文件");
			} else {
				boolean isCreatedFile = fileTxt.createNewFile();
				System.out.println("文件创建成功" + isCreatedFile);
			}
		} else {
			fileDir.mkdirs();
		}
	}

	/**
	 * 获取目录下的文件以及文件夹
	 */
	public static void listFileDemo() {
		getAllFile(new File("G:/网易云音乐"));
		System.out.println();
	}

	public static void getAllFile(File fileOrDir) {
		File[] listFiles = fileOrDir.listFiles();
		for (File file : listFiles) {
			if (file.isDirectory()) {
				getAllFile(file);
			} else {
				System.out.println(file.toURI());
			}
		}
	}

	
	public static void isFile() {
		File file = new File("G:/网易云音乐");
		File[] listFiles = file.listFiles(new Myfiler());
		for (File file2 : listFiles) {
			System.out.println(file2);
		}
	}

}
/**
 * FileFileter
 * 
  *  接口 可以实现对指定文件的过滤
 */

class Myfiler implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		if (pathname.isFile())
			return true;
		return false;
	}

}