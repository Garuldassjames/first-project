package practice_code;

import java.util.Scanner;

public class Muthukumar_task {

		// TODO Auto-generated method stub
//		Ask user to enter age, sex ( M or F ), marital status ( Y or N ) 
//		and then using following rules print their place of service.
//		if employee is female, then she will work only in urban areas.
//
//		if employee is a male and age is in between 20 to 40 then
//		he may work in anywhere
//
//		if employee is male and age is in between 40 t0 60 then
//		he will work in urban areas only.
		public void task1() {

		Scanner s= new Scanner(System.in);
		
//		System.out.println("Enter your age:"+ a);
//		int a=s.nextInt();
//		
//		System.out.println("Enter your sex: ( M /F)"+b);
//		String b=s.next();
		
		
//		System.out.println(" Enter your marital status : (Yes / No)");
//		String c=s.next();
		int i =s.nextInt();
		if(i==20 && i<=40) {
		System.out.println("he may work anywhere");
		}
		else if(i==40 && i<=60) {
		System.out.println(" He will work in urban areas");
		 }
		else {
		 System.out.println("not working");
		}
		}
		
		public static void main(String[] args) {
		Muthukumar_task obj= new Muthukumar_task();
		obj.task1();
	}

}
