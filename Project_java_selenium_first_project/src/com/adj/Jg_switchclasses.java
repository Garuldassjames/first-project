package com.adj;

import java.util.Scanner;

public class Jg_switchclasses {
	public void switchTest() {
		String a = "eng";
		//Scanner s= new Scanner(System.in);
		//System.out.println("enter the subject abbreaviation:");
		//String a= s.nextLine();
		switch(a) {
		case"eng":
			System.out.println("english");
		case"tam":
			System.out.println("tamil");
		case"mat":
			System.out.println("mathematical");
		case"chem":
			System.out.println("chemistry");
		case"phy":
			System.out.println("physics");
		case"bio":
			System.out.println("biology");
		case"zoo":
			System.out.println("zoology");
		}
	}
	public static void main(String[] args) {
		Jg_switchclasses j= new Jg_switchclasses();
		j.switchTest();
	}
}
