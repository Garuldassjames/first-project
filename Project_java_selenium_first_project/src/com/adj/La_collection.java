package com.adj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class La_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> a=new HashMap<Integer,String>();
		a.put(07, "Dhoni");
		a.put(18, "ViratKholi");
		a.put(45, "RohitSharma");
		a.put(33, "HardikPandya");
		System.out.println(a);
		int cric =a.size();
		System.out.println(cric);
		String Cric = a.get(18);
		System.out.println(Cric);
		Set<Integer> cRic = a.keySet();
		System.out.println(cRic);
		Set<Entry<Integer,String>> crIc=a.entrySet();
		System.out.println(crIc);
	}

}
