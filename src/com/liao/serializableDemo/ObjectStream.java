package com.liao.serializableDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectStream {
	public static void objectOutputStreamDemo() throws IOException {
		OutputStream out = new FileOutputStream("G:/Person.txt");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		Object obj = (Object)new Person("liao", "demo", 15);
		oos.writeObject(obj);
		oos.close();
		out.close();
		System.out.println("Íê³É");
	}
	public static void objectInputStreamDemo() throws IOException, ClassNotFoundException{
		InputStream in = new FileInputStream("G:/Person.txt");
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(in);
		Object obj = ois.readObject();
		Person p = (Person)obj;
		System.out.println(p);
	}
}
