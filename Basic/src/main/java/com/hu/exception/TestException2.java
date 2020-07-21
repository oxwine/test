package com.hu.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {

	public static void main(String[] args) {
		File f = new File("/Users/hujun/eclipse-workspace/Basic/src/main/java/com/hu/exception/a.txt");
		FileReader reader = null;
		try {
			reader = new FileReader(f);

			char c1 = (char)reader.read();
			char c2 = (char)reader.read();
			System.out.print(c1+""+c2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader !=null)
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
