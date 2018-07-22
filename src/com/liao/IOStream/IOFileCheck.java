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
	 * �����ļ����ļ���
	 */

	@SuppressWarnings("unused")
	private static void test1() {
		File file = new File("G:/test");
		String absolutePath = file.getAbsolutePath();// ��ȡ�ļ����ļ��еľ���·��
		System.out.println(absolutePath);
		boolean exist = file.exists(); // �ж��ļ����ļ����Ƿ����
		System.out.println(exist);
		if (!exist) {
			boolean mkdirs = file.mkdirs();// �ݹ鴴���ļ���
			System.out.println(mkdirs);
		}

		if (file.exists()) {
			boolean delete = file.delete();
			System.out.println(delete);
		}

	}

	@SuppressWarnings("unused")
	private static void test2() {

		File file = new File("G:/����������");
		getAllFiles(file);
	}

	private static void test3() {

		File file = new File("G:/����������");
		getMp3Files(file);
	}

	// �ݹ��ж��ļ���Ŀ¼�µ����� �ļ�
	public static void getAllFiles(File files) {
		File[] listFiles = files.listFiles();
		for (File file : listFiles) {
			if (file.isDirectory())
				getAllFiles(file);
			else
				System.out.println(file.getAbsolutePath());
		}
	}

//	�ж��ļ����е�mp3�ļ�
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
