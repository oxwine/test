package com.hu.sort;

import java.io.UncheckedIOException;
import java.util.Arrays;

public class bubble {
	/**
	 * 冒泡排序
	 * 
	 * @param args
	 */
	//是否经过了排序
	static boolean isChange = false;
	
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,7};
		Integer[] arr1 = {7,6,4,2,1};
//		Object dkf = arr;
//		int df1 = ((int[])dkf)[1];
		for (int j = 0; j < arr1.length - 1; j++) {
			isChange = false;
			System.out.println("次数==" + (j + 1));
			for (int i = 0; i < arr1.length - 1 - j; i++) {
				change1(arr1,i, true);
				System.out.println(Arrays.toString(arr1));
			}
			//没有经过元素交换，说明已经是有序，结束
			if(!isChange) {
				break;
			}
		}
		System.out.println("sorting is over");

	}
//true为升序
	public static void change(int[] j, int i, boolean AsendOrDesc) {
		int temp = j[i];
		if (i>= j.length-1)
				throw new UncheckedIOException(null);
		if (j[i] > j[i+1] && AsendOrDesc) {
			j[i] = j[i+1];
			j[i+1] = temp;
			System.out.println("交换了一次");
			//经过了排序设置为true
			isChange = true;
		}
		if (j[i] < j[i+1] && !AsendOrDesc) {
			j[i] = j[i+1];
			j[i+1] = temp;
			System.out.println("交换了一次");
			isChange = true;
		}

	}
	
	public static <T extends Comparable> void change1(T[] j, int i, boolean AsendOrDesc) {
		T temp = j[i];
		if (!(temp instanceof Comparable)) {
			throw new UncheckedIOException(null);
		}
//		temp = (Comparable)temp;
		if (i>= j.length-1)
				throw new UncheckedIOException(null);
		boolean bo = ((Comparable)j[i]).compareTo(((Comparable)j[i+1]))>0?true:false;
		if (bo && AsendOrDesc) {
			j[i] = j[i+1];
			j[i+1] = temp;
			System.out.println("大于交换了一次");
			//经过了排序设置为true
			isChange = true;
		}
		if (!bo && !AsendOrDesc) {
			j[i] = j[i+1];
			j[i+1] = temp;
			System.out.println("小于交换了一次");
			isChange = true;
		}

	}

}
