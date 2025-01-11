package com.mru.oops;

public class Demo {

	public static void main(String[] args) {
		Adapter adp = new Adapter();
		Test11 obj = adp.getInstance1();
		String res1 = obj.message;
		System.out.println(res1);
		obj.m1();
		
		
		Test12 obj1 = adp.getInstance2();
		String res2 = obj1.msg;
		System.out.println(res2);
		obj1.m2();
	}

}
