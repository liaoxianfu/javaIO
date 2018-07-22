package com.liao.InputStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) {
			FileCopyTools.copy("G:/aaa.rar", "G:/demo/aa.rar");
	}

}

class FileCopyTools {
	/**
	 * 私有化构造方法
	 */
	private FileCopyTools() {
	}

	/**
	 * 
	 * @param filePath 原文件路径
	 * @param aimpath  目标路径
	 */
	public static void copy(String filePath, String aimpath) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(filePath);
			out = new FileOutputStream(aimpath);
		} catch (FileNotFoundException e) {
			System.out.println("路径错误");
			throw new RuntimeException();
		}
		byte[] bs = new byte[1024];
		try {
			while ((in.read(bs)) != -1) {
				out.write(bs);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}