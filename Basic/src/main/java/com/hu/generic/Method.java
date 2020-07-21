package com.hu.generic;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 非泛型类中 定义泛型方法
 *  <字母 [extands]> 返回类型｜void  前面
 * @author hujun
 * @param <T>
 *
 */
public class Method<T> {
	//泛型不能用于静态方法，方法泛型可以
	public static <T> void test(T t) {
		System.out.println(t);
	}
	
	public static <T extends List>  void test(T t) {
		System.out.println(t);
		t.add("aa");
	}
	
	
//释放资源T... 等同于T[],只是吧参数限制在一个范围，不用Object那么大，和做一个参数类型检查	
	public static <T extends Closeable>  void test(T... t) {
		for(T temp:t) {
			if(null !=temp) {
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static  void test1(Closeable...t) {
		for(Closeable temp:t) {
			if(null !=temp) {
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		test("aaa");
		test(1);
		test(new ArrayList());
		test1();//可变参数
		

	}

}
