package practice_code;

import java.util.Iterator;

public class Loopstatements {
	String a[] = { "one", "two", "three", "five" };

	private void string() {
		System.out.println("string");
		System.out.println("");
		for (String str : a) {
			System.out.println(str);
		}
		System.out.println("");
		
	}
	/*
	public void formila() {
		System.out.println("for");
		System.out.println("");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("");
	}

	public void While() {
		System.out.println("while");
		System.out.println("");
		int i = 0;
		while (i < a.length) {
			System.out.println(a[i]);
			i++;
		}
		System.out.println("");
	}

	private void dowhile() {
		System.out.println("dowhile");
		System.out.println("");
		int i = 0;
		do {
			System.out.println(a[i]);
			i++;
		} while (i < a.length);
		System.out.println("");
		

	}
	*/

	public static void main(String[] args) {
		Loopstatements ls = new Loopstatements();
		ls.string();
//		ls.formila();
//		ls.While();
//		ls.dowhile();
	}

}
