package com.hu.generic;

/**
 * 泛型接口不能使用在全局常量上面
 * 
 * @author hujun
 *
 * @param <T>
 */
public interface Comparator<T> {

	/* public static final */ int MAX_VALUE = 1024;

	/* public abstract */ void compare(T t);

	T compare1(T t);

}

class InterC1<A> implements Comparator {

	@Override
	//泛型擦除，当作Object
	public void compare(Object t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object compare1(Object t) {
		// TODO Auto-generated method stub
		return null;
	}
}

class InterC2<A> implements Comparator<Integer> {

	@Override
	public void compare(Integer t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer compare1(Integer t) {
		// TODO Auto-generated method stub
		return null;
	}
}
