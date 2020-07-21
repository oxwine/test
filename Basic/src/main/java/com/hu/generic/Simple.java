package com.hu.generic;

import java.util.ArrayList;
import java.util.List;
/**
 * 1.泛型：标签，泛化类型
 * @author hujun
 *
 */
public class Simple {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("easy");
		list.get(0).equals("aa");
//		String ele = list.get(0);
//		System.out.println(ele);
		
		
		
//		MyStudent<Integer> mst = new MyStudent<Integer>();
//		mst.setJavase(19);
//		int score = mst.getJavase().intValue();
	}

}
