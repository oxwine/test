package com.hu.collection;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd w W");
		
		Date d = new Date(123213123L);
		String str = df.format(d); //格式化date，使用格式
		System.out.println(str);
		
		System.out.println("############");
		String str2 = "1977,7,7";
		
		DateFormat df2 = new SimpleDateFormat("yyyy,MM,dd");
		
		try {
			Date d2 = df2.parse(str2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
