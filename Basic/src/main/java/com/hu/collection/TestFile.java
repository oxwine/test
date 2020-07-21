package com.hu.collection;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		File f = new File("/Users/hujun/eclipse-workspace/Basic/src/main/java/com/hu/collection/Human.java");
		
		File f2 = new File("/Users/hujun/eclipse-workspace/Basic/src/main/java/com/hu/collection");
		
		File f3 = new File(f2,"Testthis.java");
		
		File f4 = new File(f2,"Testthis666.java");
		
		File f5 = new File("/Users/hujun/eclipse-workspace/Basic/src/main/java/com/hu/collection");
		f5.mkdir();f5.mkdirs();
		
		try {
			f4.createNewFile();//创建文件
			//f4.delete();  删除文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(f.isFile()) {
			System.out.println("一个文件");
		}
		
		if(f2.isDirectory()) {
			System.out.println("一个文件夹");

		}
	}

}
