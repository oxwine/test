package com.hu.generic;

import java.util.ArrayList;

/**
 * 自定义泛型类
 * @author hujun
 *1 <> 单个字母里面
 *2 T 表示 type
 *  K V 表示健 值
 *  E element
 *  
 *  不能使用在静态属性上
 */
public class MyStudent<T> {
	private T javase;

	public MyStudent(T javase) {
		super();
		this.javase = javase;
	}
	
	public MyStudent() {
		
	}

	public T getJavase() {
		return javase;
	}

	public void setJavase(T javase) {
		this.javase = javase;
	}
	
	
	
	//private static T test;  不能使用在静态属性上
	
	public static void main(String[] args) {
		//没有指定泛型的具体类型，就是类似Object，不等同于Object
		MyStudent stu = new MyStudent();
		MyStudent<Object> stu1 = new MyStudent<Object>();
		//ArrayList<String> a = new ArrayList(); 这样是可以的
		stu1.setJavase(111);
		stu.setJavase("aaa");//在使用了过后，泛型类型就被指定位Integer的类型了
		
		MyStudent<Integer> test1 = stu;//可以赋值？？？
		System.out.println(test1.getJavase());
		//MyStudent<Integer> test2 = stu1;// 不能赋值
		// MyStudent<Object> test3 = new 	MyStudent<Integer>(); 不能赋值
	}

}
