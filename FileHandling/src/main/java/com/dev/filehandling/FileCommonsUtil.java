package com.dev.filehandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCommonsUtil {

	public static void main(String[] args) throws IOException {
		File file = new File("E:/Text.txt");
		FileUtils.touch(file);
		
		if(file.exists()) {
			System.out.println("File Exists..");
		}else {
			System.out.println("File does not Exists");
		}
		
		FileUtils.deleteQuietly(file);
		if(file.exists()) {
			System.out.println("File Exists");
		}else {
			System.out.println("File does not exists");
		}

	}

}
