package practice_code;

import java.util.Scanner;

public class Java_arthimetic_opertaions {
	Scanner s = new Scanner(System.in);
	int a;
	int b;
	
	public void addition() {
    int c =a+b;	
    System.out.println("addition result ="+""+c);
    int a = s.nextInt();
	}
	public void subraction() {
    int d =a-b;
    System.out.println("subraction result ="+""+d);
    int a = s.nextInt();
	}
    public void multiplication() {
		int e =a*b;
		System.out.println("multiplication result ="+""+e);
		  int a = s.nextInt();
    }
    public void division() {
		int f = a/b;
		System.out.println("division result ="+""+f);
		  int a = s.nextInt();
    }
    public static void main(String[] args) {
    	Java_arthimetic_opertaions j =new Java_arthimetic_opertaions();
    	j.addition();
    	j.subraction();
    	j.multiplication();
    	j.division();
    	
	}
}
