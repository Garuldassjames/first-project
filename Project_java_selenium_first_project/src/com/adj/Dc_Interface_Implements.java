package com.adj;

public class Dc_Interface_Implements implements Da_Interface_1, Db_Interface_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dc_Interface_Implements j= new Dc_Interface_Implements();
		j.collegeDetails();
		j.rollNo();
		j.semesterDetails();
		j.homeWork();
		j.examDetails();
	}

	@Override
	public void collegeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Colege Name: AMET University");
		
	}

	@Override
	public void rollNo() {
		// TODO Auto-generated method stub
		System.out.println("College Roll No. MEC107");
		
	}

	@Override
	public void semesterDetails() {
		// TODO Auto-generated method stub
		System.out.println("Semester Details: Starts from march 21");
	}

	@Override
	public void schoolDetails() {
		// TODO Auto-generated method stub
		System.out.println("School Name: ST.Mary's mat.hr.sec.school");
	
	}

	@Override
	public void homeWork() {
		// TODO Auto-generated method stub
		System.out.println("Home test: Study daily portions ");
		
	}

	@Override
	public void examDetails() {
		// TODO Auto-generated method stub
		System.out.println("School exam: starts from april 05 ");
		}
	}
