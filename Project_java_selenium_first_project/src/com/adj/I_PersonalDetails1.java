package com.adj;

import java.util.Scanner;

public class I_PersonalDetails1{
	
	public static void main(String[] args) {
		
//		I_PersonalDetails1 p= new I_PersonalDetails1();
		Scanner s= new Scanner (System.in) ;
		
		System.out.println("Enter your name:"+"");
		String a =s.nextLine();
		
		
		System.out.println("Enter your age:");
		int b=s.nextInt();
		
		System.out.println("Enter your ph.no:");
		long c=s.nextLong(10);
		
		System.out.println();
		
		System.out.println("Name:"+" "+a);
		System.out.println("Age:"+b);
		System.out.println("mob.no."+c);
		
		System.out.println();
		
		System.out.println("my hero"+" "+a);
		System.out.println("my hero's name :"+" "+b);
		System.out.println("my hero's  phone no:"+" "+c);
		}
}
