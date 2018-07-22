package com.liao.BufferedDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderDemo {
	public static void BufferedReader() {
		try {
			Reader reader = new FileReader("G:/demo/demo2.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String str = "";
			int num = 0;
			while ((str = bufferedReader.readLine()) != null) {
				num++;
				System.out.println(num + "  " + str);
			}
			bufferedReader.close();
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
