package com.hu.collection;

public class TestWrappedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(1000);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));
		
		Integer i2 = Integer.parseInt("333");
		
		Integer i3 = new Integer("1000");
		System.out.println(i2+1);
		//自动装箱jdk5.0之后
		Integer abcd = 123;//相当于new Integer("123")
		int abc = new Integer("1233");
		
		//边界值处理
		Integer d1 = 1234;
		Integer d2 = 1234;
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
		Integer d3 = 13;
		Integer d4 = 13;
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));

	}

}
