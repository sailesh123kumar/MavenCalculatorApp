package com.demo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Demo5 {

	public static void main(String[] args) {

		// File will be created at root level of project
		File myFile = new File("demo.txt");
		File destinationFile = new File("copy-demo.txt");

		try {
			FileUtils.copyFile(myFile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
