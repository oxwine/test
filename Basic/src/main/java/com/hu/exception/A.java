package com.hu.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class A {
	public void  method() throws IOException{}
}

class B extends A {
	public void  method() throws Exception{}
}

class c extends A {
	public void  method() {}
}

class D extends A {
	public void  method() throws FileNotFoundException{}
}

class E extends A {
	public void  method() throws IOException,FileNotFoundException{}
}

class F extends A {
	public void  method() throws IOException,ArithmeticException{}
}

class G extends A {
	public void  method() throws IOException,ParseException{}
}