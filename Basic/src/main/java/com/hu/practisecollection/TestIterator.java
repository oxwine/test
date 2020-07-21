package com.hu.practisecollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestIterator {
	
	

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("aaa");list.add("bbb");list.add("ccc");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---iterator---");
		for(Iterator itr=list.iterator(); itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---set---");
		
		Set set = new HashSet();
		
		set.add("aaa");set.add("bbb");set.add("ccc");
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
//			System.out.println(itr.next());
		}
		
		System.out.println("------");
		
		

	}

}
