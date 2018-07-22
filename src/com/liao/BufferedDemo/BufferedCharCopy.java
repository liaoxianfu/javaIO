package com.liao.BufferedDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharCopy {
	private BufferedCharCopy() {}
	public static void CopyFiles(String filePath,String aimPath) {
		try {
			Reader in = new FileReader(filePath);
			BufferedReader bufR = new BufferedReader(in);
			Writer out = new FileWriter(aimPath);
			BufferedWriter buffW = new BufferedWriter(out);
			String str="";
			while ((str=bufR.readLine())!=null) {
				buffW.write(str);
				buffW.newLine();
				buffW.flush();
			}
			out.close();
			buffW.close();
			bufR.close();
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
