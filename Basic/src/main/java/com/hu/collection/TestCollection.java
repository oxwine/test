package com.hu.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("aa");
		list.add(new Date());
		list.add(1234);
		
		System.out.println(list.size());
	}

}
