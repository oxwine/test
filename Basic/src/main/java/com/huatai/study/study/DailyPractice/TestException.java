package com.huatai.study.study.DailyPractice;

public class TestException {
	public TestException() {
	}
 
	boolean testEx() throws Exception {
		boolean ret = true;
		try {
			ret = testEx1();
		} catch (Exception e) {
			System.out.println("testEx, catch exception");
			ret = false;
			throw e;
		} finally {
			System.out.println("testEx, finally; return value=" + ret);
			return ret;
		}
	}
 
	boolean testEx1() throws Exception {
		boolean ret = true;
		try {
			ret = testEx2();
			if (!ret) {
				return false;
			}
			System.out.println("testEx1, at the end of try");
			return ret;
		} catch (Exception e) {
			System.out.println("testEx1, catch exception");
			ret = false;
			throw e;
		} finally {
			System.out.println("testEx1, finally; return value=" + ret);
			return ret;
		}
	}
 
	boolean testEx2() {
		boolean ret = true;
		try {
			int b = 12;
			int c;
			for (int i = 2; i >= -2; i--) {
				c = b / i;
				System.out.println("i=" + i);
			}
			return true;
		} catch (Exception e) {
			System.out.println("testEx2, catch exception");
			ret = false;
			int a = 1/0;
		} finally {
			System.out.println("testEx2, finally; return value=" + ret);
			//return ret;//返回值覆盖了catch中的异常
		}
		return true;
	}
 
	public static void main(String[] args) {
		TestException testException1 = new TestException();
//		try {
//			testException1.testEx();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		try {
			System.out.println(testException1.testEx2());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("结束");
	}
}
