package com.hu.home;

public class TestInvokeSpecial {
	public static void main(String args[]) {
		Subclass me = new Subclass();
		System.out.println(me.hashCode());
		me.exampleMethod();
	}

}
class SuperSuper {

}

class Superclass extends SuperSuper {
	private void interestingMethod() {
		System.out.println("Superclass's intersting method.");
	}

	void exampleMethod() {
		System.out.println(this.hashCode());
		this.interestingMethod();  //invoke special只用来调用私有实例方法
	}
}

class Subclass extends Superclass {
	
	public void interestingMethod() {
		System.out.println("Subclass's interesting method.");
	}
	
	public void only() {
		System.out.println("only me");
	}

}
