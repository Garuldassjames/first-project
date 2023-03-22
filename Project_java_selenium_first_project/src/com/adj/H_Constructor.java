package com.adj;

public class H_Constructor {

	public H_Constructor() {
		this (1234);
		System.out.println("My personal data:");
	}
	public H_Constructor(int a) {
		this ("G.arul dass james");
		System.out.println("My roll no:"+" "+a);
	}
	public H_Constructor(String b) {
		this("april",1999);
		System.out.println( "My name is "+" "+b);
	}
	public H_Constructor(String c, int d) {
			System.out.println("my date of birth is 25th of"+" "+c+" "+d);
	}
	public static void main(String[] args) {
		H_Constructor C=new H_Constructor();
	
		// TODO Auto-generated constructor stub
	}

}
