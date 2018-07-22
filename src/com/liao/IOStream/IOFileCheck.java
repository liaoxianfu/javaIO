package com.liao.IOStream;

import java.io.File;
import java.io.FileFilter;

public class IOFileCheck {
	public static void main(String[] args) {
//		test1();
//		test2();
		test3();
	}

	/**
	 * 创建文件和文件夹
	 */

	@SuppressWarnings("unused")
	private static void test1() {
		File file = new File("G:/test");
		String absolutePath = file.getAbsolutePath();// 获取文件或文件夹的绝对路径
		System.out.println(absolutePath);
		boolean exist = file.exists(); // 判断文件或文件夹是否存在
		System.out.println(exist);
		if (!exist) {
			boolean mkdirs = file.mkdirs();// 递归创建文件夹
			System.out.println(mkdirs);
		}

		if (file.exists()) {
			boolean delete = file.delete();
			System.out.println(delete);
		}

	}

	@SuppressWarnings("unused")
	private static void test2() {

		File file = new File("G:/网易云音乐");
		getAllFiles(file);
	}

	private static void test3() {

		File file = new File("G:/网易云音乐");
		getMp3Files(file);
	}

	// 递归判断文件夹目录下的所有 文件
	public static void getAllFiles(File files) {
		File[] listFiles = files.listFiles();
		for (File file : listFiles) {
			if (file.isDirectory())
				getAllFiles(file);
			else
				System.out.println(file.getAbsolutePath());
		}
	}

//	判断文件夹中的mp3文件
	public static void getMp3Files(File files) {
		File[] listFiles = files.listFiles(new MyFilter());
		for (File file : listFiles) {
			if (file.isDirectory()) {
				getMp3Files(file);
			} else {
				System.out.println(file.getAbsolutePath());
			}
		}
	}

}

class MyFilter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		if (pathname.isDirectory())
			return true;
		boolean endsWith = pathname.getName().endsWith(".mp3");
		return endsWith;
	}

}
