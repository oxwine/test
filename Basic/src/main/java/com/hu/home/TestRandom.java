package com.hu.home;

public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*10);
		System.out.print(a);
		
		String b = "jh";
		
		switch (b) {  //1.7特性，字符串的使用
		case "hj":
			System.out.println("hujun");
			break;
		case "jh":
			System.out.println("error");
		default:
			break;
		}
		
	}

}
