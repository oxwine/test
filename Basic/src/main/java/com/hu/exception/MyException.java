package com.hu.exception;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyException() {}
	
	public MyException(String mes) {
		super(mes);
	}
}


