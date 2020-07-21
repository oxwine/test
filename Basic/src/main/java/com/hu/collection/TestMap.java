package com.hu.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	MyEntry[]  arr = new MyEntry[999];
	
	int size;
	
	public void put(Object key, Object value) {
		MyEntry e = new MyEntry(key,value);
		
		arr[size++] = e;
	}
	
	public Object get(Object key) {
		for (int i=0; i<size; i++) {
			if(arr[i].key.equals(key))
			 return arr[i].value;
		}
		return null;
	}
	
	public boolean containsKey(Object key) {
		if(get(key) != null) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		TestMap map = new TestMap();
		
		map.put("hj", "ym");
		map.put("hj1", "ym1");
		
		System.out.println(map.get("hj1"));
	}

}

class MyEntry {
	Object key;
	Object value;
	
	public MyEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
}
