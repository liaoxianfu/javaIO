package com.liao.BufferedDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 高效拷贝数据
 * 
 * @author liao
 *
 */
public class BufferedStreamCopy {
	public static void bufferCopyFiles(String filePath, String aimPath) {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(filePath);
			out = new FileOutputStream(aimPath);
		} catch (FileNotFoundException e) {
			throw new RuntimeException();
		}
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		bin = new BufferedInputStream(in);
		bout = new BufferedOutputStream(out);
		int num = 0;
		byte[] bs = new byte[1024 * 4];
		try {
			while ((num = bin.read(bs)) != -1) {
				bout.write(bs,0,num);
				bout.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bin.close();
				bout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
