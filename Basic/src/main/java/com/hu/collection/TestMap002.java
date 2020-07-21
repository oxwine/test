package com.hu.collection;
/**
 * 
 * @author hujun
 *@version  hashcode算法实现快速查询
 */
public class TestMap002 {
	LinkedList[] arr = new LinkedList[999];

	int size;

	public static void main(String[] args) {
		TestMap002 map = new TestMap002();

		map.put("hj", "ym");
		map.put("hj1", "ym1");

		System.out.println(map.get("hj1"));

	}

	public void put(Object key, Object value) {
		MyEntry1 e1 = new MyEntry1(key, value);
		int a = key.hashCode() % 999;

		if (arr[a] == null) {
			LinkedList list = new LinkedList();
			arr[a] = list;
			list.add(e1);
		} else {
			arr[a].add(e1);
		}
	}

	public Object get(Object key) {
		LinkedList linklist = arr[key.hashCode() % 999];

		if (linklist != null) {
			for (int i = 0; i < linklist.size(); i++) {
				MyEntry1 e = (MyEntry1) linklist.get(i);
				if (e.key.equals(key)) {
					return e.value;
				}
			}
		}
		return null;
	}

}

class MyEntry1 {
	Object key;
	Object value;

	public MyEntry1(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEntry1 other = (MyEntry1) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	

}
