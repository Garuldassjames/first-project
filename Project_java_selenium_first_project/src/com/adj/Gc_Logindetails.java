package com.adj;

public class Gc_Logindetails extends B_Firstclass {
	public void username(){
		System.out.println("username: G arul dass james");
	}
	public void mobNO(){
		System.out.println("mobile no:9566220866");
	}
	public void emailId(){
		System.out.println("email Id: aruldassjames@gmail.com");
	}
	public void enterOtp(){
		System.out.println("one time password=4321");
	}
	public static void main(String[] args) {
		Gc_Logindetails f=new Gc_Logindetails();
		f.stdId();
		f.stdName();
		f.subjDetails(); 
		f.username();
		f.mobNO();
		f.emailId();
		f.enterOtp();
	}
}