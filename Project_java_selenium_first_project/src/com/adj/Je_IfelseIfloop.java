package com.adj;

import java.util.Scanner;

public class Je_IfelseIfloop { 
	
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		public void markPercentage1() { 
			
		System.out.println("enter your mark percentage");
	
		int a = s.nextInt();
		
		if(a==30 && a<=50) {
			System.out.println("below average");
		}
		else if(a>50 && a<=80) {
			System.out.println("above average");
		}
		else if (a>81 && a<100) {
			System.out.println("toppers");
		}
		else if (a>100 && a<=120) {
			System.out.println("plz come for re-correction");
		}
		else {
			System.out.println(" rewrite the exam");
				}
		}
		public static void main(String[] args) {
		Je_IfelseIfloop i= new Je_IfelseIfloop();
        i.markPercentage1();
	}
}
