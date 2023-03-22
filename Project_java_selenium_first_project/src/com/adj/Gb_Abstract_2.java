package com.adj;

public class Gb_Abstract_2 extends Ga_Abstract_class {
	@Override
	public void release() {
		// TODO Auto-generated method stub
		System.out.println("More movies are on the way");
		
	}
	@Override
	public void theatre() {
		// TODO Auto-generated method stub
		System.out.println("Rakki theatre cinemas");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gb_Abstract_2 A= new Gb_Abstract_2();
		A.release();
		A.theatre();
		A.newMovie();
	}

}
