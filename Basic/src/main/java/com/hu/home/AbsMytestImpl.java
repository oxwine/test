package com.hu.home;

public abstract class AbsMytestImpl implements IMytest,java.io.Serializable{
   StringBuilder a = new StringBuilder();
   char[] cha = new char[13];
	@Override
	public  void math() {
		
	}
	
	
	public void math(int a,double b,char c,Object o) {
		
	}
	
	public void math2(int a,double b,char c,Object o) {
		
	}
	public String math2(int a,double b,char c) {
		return "a";
	}

	@Override
	public String ad() {
		return null;};
}

class	Mytest extends AbsMytestImpl implements IMytest {
	
	public static void main(String[] args) {
		Mytest m = new Mytest();m.ad();
	}

	@Override
	public String mu() {
		// TODO Auto-generated method stub
		return null;
	}

}