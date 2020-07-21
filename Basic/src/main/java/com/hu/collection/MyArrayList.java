package com.hu.collection;
/**
 * 实现arrylist
 * @author hujun
 *
 */
public class MyArrayList {
	
	Object[] value;
	
	int size;
	
	public MyArrayList() {
		this(16);
	}
	
	public MyArrayList(int si) {
		value = new Object[si];
	}
	
	public void add(Object obj) {
		ensureCap();
		value[size++] = obj;
	}
	
	public Object get(int index) {
		if(index<0 || index>size-1)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return value[index];
	}
	
	public void ensureCap() {
		if (size >= value.length) {
			int newCapacity = value.length*2;
			Object[] newlist = new Object[newCapacity];
			
			for(int i=0; i<value.length;i++) {
				newlist[i] = value[i];
			}
			
			value = newlist;
		}
	}
	
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add("aaa");
		list.add(new Human("gq"));
		list.add("b");
		System.out.println(list.size);
		System.out.print(list.get(-1));
	}

}
