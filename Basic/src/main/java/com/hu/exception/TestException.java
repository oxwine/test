package com.hu.exception;

public class TestException {

	public static void main(String[] args) {
		int i = 1/0; //自动捕获异常
		
		try {
			Thread.sleep(3000); //unchecked异常，需要捕获
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
