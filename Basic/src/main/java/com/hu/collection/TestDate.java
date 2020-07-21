package com.hu.collection;

import java.util.Date;

public class TestDate {
/**
 * 测试时间类
 * @param args
 */
	public static void main(String[] args) {
		Date d = new Date();
		
		long t = System.currentTimeMillis();
		
		System.out.println(t);
		
		Date d2 = new Date(10000);
		
		System.out.println(d2.toGMTString());
		System.out.println(d2.getTime());
	}

}
