package com.demo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class Demo4 {

	public static void main(String[] args) {

		File myFile = new File("Newdemo.txt");
		String absolutePath = myFile.getAbsolutePath();
		System.out.println("Absolute path : "+absolutePath);
		
		String extension = FilenameUtils.getExtension(absolutePath);
		System.out.println("File Extention : "+extension);
		
		String fileName = FilenameUtils.getName(absolutePath);
		System.out.println("File Name : "+fileName);
		
		String fullPath = FilenameUtils.getFullPath(absolutePath);
		System.out.println("Full path of File : "+fullPath);

	}

}
