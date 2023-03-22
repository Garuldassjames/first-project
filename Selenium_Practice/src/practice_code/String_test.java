package practice_code;

import java.util.Scanner;

public class String_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("whats on your mind:");
		String A= s.nextLine();
		
		System.out.println();
		
		System.out.println("this is it"+A);
		String str[] =A.split("");
		for (int i=0;i<A.length();i++) {
			System.out.println(str[i]);
		}
	}
}
