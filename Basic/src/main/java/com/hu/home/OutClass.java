package com.hu.home;

public class OutClass{
	
	private String name;
	private int id;
	private String address;
	int[] a =new int[3];
	
	public innerClass inn() {
		int b = a.length;//length 是属性
		return new innerClass();
	}
	
	public OutClass() {
		this("a");
	}
	
	public OutClass(String s) {
	}
	
	
	public class innerClass{
		
		private String innerName;
		public static final int aidl = 0;
		public void fun(){
			System.out.println(OutClass.this.name+": "+innerName);
			System.out.println(OutClass.this.id+": "+innerName);
			System.out.println(OutClass.this.address+": "+innerName);
		}
		public innerClass(String innerName){
			this.innerName = innerName;
		}
		
		public innerClass(){
			this("a");
		}
			
		
	}
}
//————————————————
//结论：
//
//在虚拟机中没有外部类内部类之分都是普通的类，但是编译器会偷偷的做点修改，让内部类中多一个常量引用指向外部类，自动修改内部类构造器，初始化这个常量引用，而外部类通过扫描内部类调用了外部类的那些私有属性，为这些私有属性创造acess$xxx静态方法。这个方法是返回对应的私有属性的值。所以可以在一个类的外部获取一个类的私有属性的值
//————————————————
//版权声明：本文为CSDN博主「Aaron_涛」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/qq_33330687/java/article/details/77915345
