package com.hu.testClassProperty;

public class StaticParentClass {
	
	public static String staticField = "父类静态变量";   
	  
    public final String finalField = "父类常量";   
  
    public static final String staticFinalField = "父类静态常量";   

	public static void main(String[] args) {
		SubStaticParentClass subClass = new SubStaticParentClass();   
        System.out.println(subClass.staticField);   
        System.out.println(subClass.finalField);   
        System.out.println(subClass.staticFinalField); 
     
        System.out.println("----------------");   
        StaticParentClass subClass2 = new SubStaticParentClass();   
        System.out.println(subClass.staticField);   
        System.out.println(subClass.finalField);   
        System.out.println(subClass.staticFinalField);   

	}
	
}

class SubStaticParentClass extends StaticParentClass {   
    public static String staticField = "子类静态变量";   
  
    public final String finalField = "子类常量";   
  
    public static final String staticFinalField = "子类静态常量";
}
