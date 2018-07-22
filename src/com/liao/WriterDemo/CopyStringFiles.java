package com.liao.WriterDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyStringFiles {
	private CopyStringFiles() {	}
	public static void copyStrFiles(String fileName,String aimPath) throws IOException {
		FileReader fileReader = new FileReader(fileName);
		FileWriter fileWriter = new FileWriter(aimPath);
		int num=0;
		char[] ch = new char[20];
		while((num=fileReader.read(ch))!=-1) {
			fileWriter.write(ch, 0, num);
		}
		fileReader.close();
		fileWriter.close();
		System.out.println("¸´ÖÆÍê³É");
	}
}
