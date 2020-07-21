package com.hu.sort;

public class ReferenceType {

	public static void main(String[] args) {
		Integer a;

		char x;
		String b;
		Comparable c = (Comparable) 1;
		
		int[] ia = {1,3};
		char[] ch = {'a','b','c'};
		String[] st = {"abc","cba"};
		//cmp(ch);cmp(ia);
		
	    cmp(st);

	}

	public static <T extends Comparable<T>>  void cmp(T[] t) {
	}
	

}
