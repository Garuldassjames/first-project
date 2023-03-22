package com.adj;

public class Fa_Polymorphism_methodoverloading {
	public void sensexReport(int a) {
		System.out.println("Sensex report form no."+" "+a);
	}
	public void sensexReport() {
		System.out.println("family count details");
	}
	public void sensexReport(int a, String b){
		System.out.println("Family members above age 18="+" "+a+" "+b);
		}
	public void sensexReport(String c, int d, char e){
		System.out.println("Family members below age 18="+" "+c+" "+d+" "+e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Fa_Polymorphism_methodoverloading p= new Fa_Polymorphism_methodoverloading();
//		 p.sensexReport(14);
//		 p.sensexReport();
//		 p.sensexReport(4,"Members");
//		 p.sensexReport("Children", 2,'/');
	}

}
