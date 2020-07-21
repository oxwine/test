package com.hu.collection;

import java.util.HashMap;
/**
 * HashSet 使用了hashmap的key不可重复性
 * @author hujun
 *
 */
public class TestHashSet {
	
	HashMap map;
	
	public static final Object PRESENT = new Object();
	
	//int size;
	
	public int size() {
		return map.size();
	}
	public TestHashSet() {
		map = new HashMap();
	}
	
	public void add(Object o) {
		map.put(o, PRESENT);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
