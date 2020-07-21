package com.huatai.study.study.algorithm;

public class Test {

	public static void main(String[] args) {
		int a = 123;
		int b = 445;
		int c = a^b;
		a=a^c;b=b^c;
		System.out.println("a is:"+a+" and b is:"+b);
		
		String num1="23";String num2="3";
		a = Integer.valueOf(num1);b = Integer.valueOf(num2);
		
		System.out.println(a*b);
	}

}
