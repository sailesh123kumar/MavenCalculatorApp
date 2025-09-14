package com.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		// File will be created at root level of project
		File myFile = new File("demo.txt");
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileWriter writer;
		try {
			writer = new FileWriter(myFile);
			writer.write("This is the demo write in text file");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileReader reader;
		BufferedReader br;
		String data = null;
		try {
			reader = new FileReader(myFile);
			br = new BufferedReader(reader);
			data = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(data);

	}

}
