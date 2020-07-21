package com.huatai.mvnbook.Basic;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		System.out.println(arr.length);
		Object[] ob = new String[10];
		System.out.println(ob.getClass());
		int[] intg = {2,3,1,8};
		Arrays.sort(intg);
		System.out.println(Math.signum(0));

	}

}
