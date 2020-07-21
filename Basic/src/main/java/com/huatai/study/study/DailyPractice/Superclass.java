package com.huatai.study.study.DailyPractice;

public class Superclass {

	public static void main(String[] args) throws Exception {
		Subclass me = new Subclass();
//		me.exampleMethod();
//		try {
//			me.doA();
//		} catch (IndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
////			System.out.println(e.getStackTrace());
//			e.printStackTrace();
//		}catch (Exception e) {
//			System.out.println("aaa");
//		}finally{
//			System.out.println("没有捕获到异常finally");
//		}
//		System.out.println("异常过后");

		System.out.println(me.testExcp());
	}

	private void interestingMethod() {
		System.out.println("Superclass's intersting method.");
	}

	void exampleMethod() {
		interestingMethod();
	}

}

class Subclass extends Superclass {
	void interestingMethod() throws Exception {
		System.out.println("Subclass's interesting method.");
		throw new ArithmeticException();
	}

	// 异常
	void doA() throws Exception {
		int a = 1;
		int b = 2;
		try {
			interestingMethod();
		} catch (ArithmeticException e) {
			System.out.println("异常1");
			throw new Exception("异常111");
		} catch (Exception e) {
			System.out.println("出错了");
		}
		if (a != b) {
			System.out.println("a不等于b");
			throw new IndexOutOfBoundsException("自定义异常");// 自己抛出需要抛出去给调用者
		}
	}

	int testExcp() {
		int a[] = { 1, 2, 3 };
		;
		try {
			try {
				System.out.println(a[1]);
				return a[5];
			} catch (Exception e) {
				System.out.println("异常");
				return a[5];
			}
		} catch (Exception e) {
			System.out.println("异常2");
		}
		return 0;

	}
}