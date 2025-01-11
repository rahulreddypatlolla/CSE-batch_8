package com.mru.oops;

import java.util.ArrayList;

public class Java8Features {

	public static void main(String[] args) {
      ArrayList<Integer> list1 = new ArrayList<>();
      list1.add(10);
      list1.add(9);
      list1.add(30);
      list1.add(7);
      list1.add(50);
      
     //list1.forEach(num -> System.out.println(num));
	// print even numbers
      list1.stream().filter(num->num%2==0).forEach(System.out::println);
	
	//print odd numbers
      list1.stream().filter(num->num%2!=0).forEach(System.out::println);

      
      ArrayList<Integer> list2 = new ArrayList<>();
      list2.add(1);
      list2.add(2);
      list2.add(3);
      list2.add(4);
      list2.add(5);
      
      //Modify elements
      list2.stream().map(num -> num*12).forEach(System.out::println);
      
      
      ArrayList<String> list3 = new ArrayList<>();
      list3.add("Hello");
      list3.add("Rahul");
      list3.add("Welcome");
      list3.add("To");
      list3.add("Training");
      list3.stream().map((name) ->{
    	  return new StringBuilder(name).reverse().toString();
      }).forEach(System.out::println);
	}

}
