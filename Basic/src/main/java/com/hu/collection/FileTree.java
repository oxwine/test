package com.hu.collection;

import java.io.File;

public class FileTree {

	public static void main(String[] args) {
		File f = new File("/Users/hujun/eclipse-workspace/Basic/src/main/java/com/hu");
		
		printFile(f,0);

	}
	
	public static void printFile(File file,int level) {
		
		for (int i =1; i <= level;i++) {
			System.out.print("-");
		}
		
		System.out.println(file.getAbsolutePath());
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			
			for (File temp:files) {
				printFile(temp,level+1);
			}
		}
		
	}

}
