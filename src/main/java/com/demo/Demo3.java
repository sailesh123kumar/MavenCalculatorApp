package com.demo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Demo3 {

	public static void main(String[] args) {

		// File will be created at root level of project
		File myFile = new File("demo.txt");

		try {
			FileUtils.writeStringToFile(myFile, "Hi My Name is Sailesh Kumar \n", StandardCharsets.UTF_8);
			FileUtils.writeStringToFile(myFile, "Hi My Name is Sailesh Kumar \n", StandardCharsets.UTF_8, true);
			FileUtils.writeStringToFile(myFile, "Hi My Name is Sailesh Kumar \n", StandardCharsets.UTF_8, true);
			FileUtils.writeStringToFile(myFile, "Hi My Name is Sailesh Kumar \n", StandardCharsets.UTF_8, true);
			FileUtils.writeStringToFile(myFile, "Hi My Name is Sailesh Kumar \n", StandardCharsets.UTF_8, true);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// writing multiple lines
		List<String> lines = Arrays.asList("Naveen", "Sathish", "VijayaRaghavan", "VijayaDharanya");
		try {
			FileUtils.writeLines(myFile, lines, true);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String fileToString = null;
		try {
			fileToString = FileUtils.readFileToString(myFile, StandardCharsets.UTF_8);
			System.out.println(fileToString);
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<String> stringlines = null;

		try {
			stringlines = FileUtils.readLines(myFile, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(stringlines);
		System.out.println(stringlines.get(6));

	}

}
