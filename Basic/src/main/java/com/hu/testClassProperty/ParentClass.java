package com.hu.testClassProperty;

class ParentClass {   
    public int i = 10;   
    
    private int j = 40;
    public static void main(String[] args) {   
        ParentClass parentClass = new SubClass();   
        SubClass subClass = new SubClass();   
        System.out.println(parentClass.i + subClass.i);
        
        ParentClass parentClass1 = new SubClass();   
        ParentClass subClass1 = new SubClass();   
        System.out.println(parentClass1.i + subClass1.i);   
        
        ParentClass parentClass2 = new SubClass();   
        ParentClass subClass2 = new SubClass(); 
        System.out.println(parentClass2.geti());  
        System.out.println(subClass2.geti()); 
        System.out.println(parentClass2.getj());  
        System.out.println(subClass2.getj()); 
    } 
    
    public int geti() {
    	return this.i;
    }
    
    public int getj() {
    	return this.j;
    }
    
 
}   
  
class SubClass extends ParentClass {   
    public int i = 30;   
    private int j = 50;
//    public int geti() {
//    	return this.i;
//    }
    public int getj() {
    	return this.j;
    }
    
}  

//由于private变量受访问权限的限制，它不能被覆盖。 
//属性的值取父类还是子类并不取决于我们创建对象的类型，而是取决于我们定义的变量的类型。 
//friendly、protected和public修饰符并不影响属性的覆盖。 
//静态变量和静态常量属于类，不属于对象，因此它们不能被覆盖。 
//常量可以被覆盖。 
//对于基本类型和对象，它们适用同样的覆盖规律。 
