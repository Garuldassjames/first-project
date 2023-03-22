package com.adj;

public class B_Firstclass extends Ga_Abstract_class  implements Da_Interface_1,Db_Interface_2  {
	public void stdId(){
		System.out.println("student id=450");
	}
	public void stdName() {
		System.out.println("Student name : james");
	}
	public void subjDetails() {
		System.out.println("subject1=Tamil");
		System.out.println("subject2=English");
	}
	public void marks() {
		System.out.println("Tamil=100");
		System.out.println("English=100");
	}
	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		B_Firstclass andrew=new B_Firstclass();
		andrew.stdId();
		andrew.stdName();
		andrew.subjDetails();
		andrew.marks();
		andrew.theatre();
		andrew.collegeDetails();
		andrew.release();
		andrew.homeWork();
		andrew.semesterDetails();
		andrew.schoolDetails();
	}
	@Override
	public void theatre() {
		// TODO Auto-generated method stub
		System.out.println("rakki theatre");
		
	}
	@Override
	public void release() {
		// TODO Auto-generated method stub
		System.out.println("on 16 off this month");
	}
	@Override
	public void collegeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Amet university");
	}
	@Override
	public void semesterDetails() {
		// TODO Auto-generated method stub
		System.out.println("final semester");
	}
	@Override
	public void schoolDetails() {
		// TODO Auto-generated method stub
		System.out.println("St.marys mat.hr.sec.school");
	}
	@Override
	public void homeWork() {
		// TODO Auto-generated method stub
		System.out.println("to finish all the remaining sums in the book");
	}
	@Override
	public void examDetails() {
		// TODO Auto-generated method stub
		System.out.println("exam starts from jan 1");
	}
	@Override
	public void rollNo() {
		// TODO Auto-generated method stub
		System.out.println("mec 107");
	}

}
