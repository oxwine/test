package com.hu.generic;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.hu.collection.LinkedList;

/**
 * ?-->通配符，类型不确定，用于声明变量，形参上
 * @author hujun
 *
 */
public class WildCardsTest {

	public static void main(String[] args) {
		//用于声明变量，形参上,?等同于 ？extends Object
		List<?> list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		list = new ArrayList<Object>();
		
		//extends 表示泛型的上限
		
		Test<ArrayList> t1 = new Test<ArrayList>();
		//Test<? extends Collection> t11 = new Test<ArrayList>()报错
		Test<? extends List> t12 = new Test<ArrayList>();
		//Test<? super List> t122 = new Test<ArrayList>();
		test2(t1);
		Test<AbstractList> t2 = new Test<AbstractList>();

	}
	
	//extends 表示泛型的上限
	public static void test(List<?> list) {
		
	}
	public static void test1(List<? extends List> list) {
		//list.add(new ArrayList()); //不可使用，报错
		//list.addAll(new ArrayList<List>()); //不可使用，报错
		list.addAll(new ArrayList<>());//没有报错addAll 只能添加 确定类型的子类，所以可以添加
		//public boolean addAll(Collection<? extends E> c)
	}
	
	public static void test11(List<? super List> list) {

		list.add(new ArrayList());//可以添加list的子类，因为不管（？ super list）是什么，肯定是 List或list子类的 super
	}
	
	public static void test2(Test<? extends List> t1) {
		
	}
	
	static class Test<T extends List>{}
	
	//class Test<?>{} 不能用在泛型类上面
}
