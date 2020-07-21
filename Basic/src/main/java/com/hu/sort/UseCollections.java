package com.hu.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Collections 工具类
 * @author hujun
 *
 */
public class UseCollections {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("cc");l.add("bb");l.add("aa");l.add("dfdgs");l.add("c1");
		Collections.sort(l);
		System.out.println(l.toString());
		
		//Collections.sort(null, new StringCmp());//使用比较器
	}

}
