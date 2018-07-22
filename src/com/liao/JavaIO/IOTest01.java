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
	 * File����Ĵ���
	 */
	public static void fileTest1() {
		String path = "G:/dmeo.txt";
//			��װ��File����ע�⌡ѽ��װ�����ڵ��ļ��Ͷ���
		File file = new File(path);
		System.out.println(file);
//			����parent��·���ַ�����child·�����ִ���һ���µ�Fileʵ��
		File file2 = new File("G:/demo", "demo.txt");
		System.out.println(file2);
//			��parent��װ��File����
		File dir = new File("G:/demo");
		String child = "demo2.txt";
		File file3 = new File(dir, child);
		System.out.println(file3);

	}

	/**
	 * ��ȡ�ļ���·��
	 */

	public static void fileTest2() {
		/**************** File��Ļ�ȡ **************/
		File fileDemo = new File("Test2.txt");
		// ��ȡ�ļ��ľ���·��
		String absPath = fileDemo.getAbsolutePath();
		System.out.println(absPath); // E:\Eclipse\JavaIO\Test2.txt
//			��ȡ·������װ����ʲô����ʲô
		String path1 = fileDemo.getPath();
		System.out.println(path1);// Test2.txt

	}

	/**
	 * ��ȡ�ļ��Ĵ�С
	 */

	public static void fileTest3() {
		// ��ȡ�ļ��Ĵ�С
		File fileRar = new File("G:/aaa.rar");
		String absolutePath = fileRar.getAbsolutePath();
		System.out.println("����·����" + absolutePath);
		String name = fileRar.getName();
		System.out.println("�ļ�����" + name);
		long size = fileRar.length();
		System.out.println("�ļ���С" + size / 1024.0 + "k");
	}

//		�ļ����ļ��еĴ���
	public static void fileTest4() throws IOException {
		File file = new File("G:/demo.txt");
		File file2 = file;
		boolean isCreated = file2.createNewFile();
		System.out.println("�ļ��Ƿ��Ѿ�����" + !isCreated);
		boolean isDelete = file.delete();
		System.out.println(isDelete);
//		ɾ��Ŀ¼ʱ��Ҫ�ȱ�֤Ŀ¼Ϊ�յ�ʱ����ɾ��
		File fileDir = new File("G:/dir");
		if (fileDir.exists()) {
			System.out.println("����Ŀ¼");
			File fileTxt = new File(fileDir, "a.txt");
			if (fileTxt.exists()) {
				System.out.println("�����ļ�");
			} else {
				boolean isCreatedFile = fileTxt.createNewFile();
				System.out.println("�ļ������ɹ�" + isCreatedFile);
			}
		} else {
			fileDir.mkdirs();
		}
	}

	/**
	 * ��ȡĿ¼�µ��ļ��Լ��ļ���
	 */
	public static void listFileDemo() {
		getAllFile(new File("G:/����������"));
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
		File file = new File("G:/����������");
		File[] listFiles = file.listFiles(new Myfiler());
		for (File file2 : listFiles) {
			System.out.println(file2);
		}
	}

}
/**
 * FileFileter
 * 
  *  �ӿ� ����ʵ�ֶ�ָ���ļ��Ĺ���
 */

class Myfiler implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		if (pathname.isFile())
			return true;
		return false;
	}

}