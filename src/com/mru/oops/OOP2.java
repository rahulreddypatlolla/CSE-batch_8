package com.mru.oops;
class Parent11{
	public void m1() {
	System.out.println(".parent-");
	}
}
class Child11 extends Parent11{
	public void m2() {
		System.out.println("-child-");
	}
}
class Subchild extends Child11{
	public void m3() {
		System.out.println("-subclass-");
	}
}
public class OOP2 {

	public static void main(String[] args) {
		Subchild obj = new Subchild();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
