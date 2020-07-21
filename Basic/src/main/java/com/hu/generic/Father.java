package com.hu.generic;
/**
 * 
 * @author hujun
 *
 */
public abstract class Father<T1,T2> {
/**
 * 保留
 * 1,全部保留
 * 2.部分保留
 * 
 * 不保留
 * 1.具体类型
 * 2.没有类型，擦除
 */
	
	T1 age;
	public abstract void test(T2 name);
}
//保留
class c1<T1,T2> extends Father<T1,T2> {

	@Override
	public void test(T2 name) {
		//this.age; T1
		
	}}
class c2<T2> extends Father<Integer,T2> {

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}}
//不保留
class c31<A,B> extends Father<Integer,String> {

	@Override
	public void test(String name) {
		//this.age---Integer类型，子类使用父类属性，随父类而定
		
	}}
class c3 extends Father<Integer,String> {

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
		
	}}
class C4 extends Father {

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	}}
