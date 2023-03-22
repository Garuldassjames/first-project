package com.adj;

public class Fb_Polymorphism_method_overriding extends Fa_Polymorphism_methodoverloading{
	@Override
	public void sensexReport() {
	// TODO Auto-generated method stub
	super.sensexReport();
	super.sensexReport(3);
	super.sensexReport(5, "fffh");
	super.sensexReport("dvwhv", 232, '#');	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fb_Polymorphism_method_overriding p= new Fb_Polymorphism_method_overriding();
		p.sensexReport();
	}

}
