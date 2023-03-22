package com.adj;

import java.util.Scanner;

public class Jf_IfelseIf_phonenumber {
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
		// TODO Auto-generated method stub
	System.out.println("enter your mob. no:");
		long a= s.nextLong(10);
		if(a>5999999999l && a<=9999999999l) {
			System.out.println("accepted contact no:"+a);
		}
	    else if(a<6000000000l || a>9999999999l) {
				System.out.println("rewrite your phone no:");
			}
				else {
					System.out.println("enter your valid phone ");
				}
		}
	
Jf_IfelseIf_phonenumber j= new Jf_IfelseIf_phonenumber();


}
