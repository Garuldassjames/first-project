package com.adj;

import java.util.Scanner;

public class Jh_switchcasses {
	public void switchtest(){
		
	String s[]= new String[11];
	s[0]="exam needs";
	s[1]="scale";
	s[2]="pen";
	s[4]="pencil";
	s[6]="rubber";
	s[8]="sharpener";
	s[10]="eraser";
	
	Scanner s1=new Scanner(System.in);
	System.out.println("select the case");
	int n= s1.nextInt();
	
	switch(n)
	{
		
		case 1:
		for(int i=0;i<s.length;i++) {
			
			System.out.println(s[i]);
	}
		    break;
		
		case 2:
			int l=s.length;
			System.out.println(l);
			break;
			
		case 3:
			Scanner s11 = new Scanner(System.in);
			System.out.println("Enter your age:");	
			int A =s11.nextInt();
				if(A<18) {
					System.out.println("Minor");
				}
				else{
					System.out.println("Major");
				}
	         break;
		case 4:
			Scanner s111 = new Scanner(System.in);
			System.out.println("Type your pin no:");
			int b = s111.nextInt();
			if (b<999) {
				System.out.println("type correct pin no:");
			}
			else if(b>9999) {
				System.out.println("you have entered wrong pin no:");
			}
			else {
				System.out.println("you entered correct pin no:");
			}
	}
}
	 	public static void main(String[] args) {
		Jh_switchcasses st =new Jh_switchcasses();
		st.switchtest();
	}
}