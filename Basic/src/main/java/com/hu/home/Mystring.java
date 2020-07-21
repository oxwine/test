package com.hu.home;

public class Mystring {
	String a = new String("abc");
	String b = "abc";
	String c = new String("csd");

	char[] cha = { 'a', 'b', 'c', 'd', 'e' };

	int i = 100;
	int j = 1000000;
	long ll = 1;
	long l2 = 0xffffffff;
	double d = 2.2;

	public Mystring() {
		a = "cddeerer";
	}

	public void whileInt() {
		int i = 0;
		while (i < 100) {
			i++;
		}
	}

	void createBuffer() {
		int buffer[];
		int bufs = 100;
		int value = 12;
		buffer = new int[bufs];
		buffer[10] = value;
		value = buffer[11];
	}

	public static void main(String args[]) {
		Mystring a = new Mystring();
		a.j = 10;

	}

	public void test1() {
		String date = "1999:";
		String name1 = "wangerbei";
		System.out.println(date + name1); // 编译器使用stringbuild的append方法来连接
	}

	int chooseNear(int i) {
		switch (i) {
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			return 2;
		default:
			return -1;
		}
	}

	int chooseFar(int i) {
		switch (i) {
		case -100:
			return 0;
		case 0:
			return 0;
		case 100:
			return 0;
		default:
			return 0;
		}
	}

	public long nestIndex() {
		return index++;
	}

	private long index = 0;
	
	void cantBeZero (int i) throws Exception{
		if (i==0) {
			throw new Exception("not0");
		}
	}
	
	void catchOne() {
		try {
			System.out.println("Noexception");
		}catch (Exception e) {
			System.out.println("exception");
		}
	}
}
