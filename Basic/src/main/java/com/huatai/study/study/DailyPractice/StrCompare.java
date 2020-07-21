package com.huatai.study.study.DailyPractice;

public class StrCompare {

	public static void main(String[] args) {
		Boolean b = StrCompare.comp("", "");
		System.out.println(b);

	}
	
	public static Boolean comp(String str1,String str2) {
		if (str1.isEmpty()) return str2.isEmpty();
		return str1.length()==str2.length()&&str1.charAt(0)==str2.charAt(0)&&comp(str1.substring(1),str2.substring(1));
		
	}

}
