package com.adj;

public class Kb_Typesofstring {

	public void stringTypes(){
		String s="HELLO MA MAKALAE";
		String s1="hello ma makalae";
		
		int a=s.length();
		System.out.println(a); 
		System.out.println(" ");
		
		boolean b=s.equals(s1);
	    System.out.println(b);
	    System.out.println(" ");
	    
	    boolean c=s.equalsIgnoreCase(s1);
	    System.out.println(c);
	    System.out.println(" ");
	    
	    String d=s1.toUpperCase();
	    System.out.println(d);
	    System.out.println(" ");
	    
	    String e=s.toLowerCase();
	    System.out.println(e);
	    System.out.println(" ");
	    
	    boolean f=s.startsWith("HELLO");
	    System.out.println(f);
	    System.out.println(" ");
	    
	    boolean g= s.endsWith("MAKALAE");
	    System.out.println(g);
	    System.out.println(" ");
	    
	    boolean h=s.contains("MA");
	    System.out.println(h);
	    System.out.println(" ");
	    
	    int i=s.indexOf("A");
	    System.out.println(i);
	    System.out.println(" ");
	    
	    int j=s.lastIndexOf("A");
	    System.out.println(j);
	    System.out.println(" ");
	    
	    char k=s.charAt(11);
	    System.out.println(k);
	    System.out.println(" ");
	    
	    String l=s.replace("MAKALAE", "makalae");
	    System.out.println(l);
	    System.out.println(" ");
	    
	    String m= s.substring(11,15);
	    System.out.println(m);
	    System.out.println(" ");
	    
	    String n=s.trim();
	    System.out.println(n);
	    System.out.println(" ");
	   
	    boolean o =s.isEmpty();
	    System.out.println(o);
	    System.out.println(" ");
	 
		String p= s.concat(s1);
		System.out.println(p);
		System.out.println(" ");
		
		String[] q= s.split(" ");
		System.out.println(q[0]);
		System.out.println(q[1]);
		System.out.println(q[2]);
		}
	    
	
	public static void main(String[] args) {
		Kb_Typesofstring st= new Kb_Typesofstring();
		st.stringTypes();
	}
}
