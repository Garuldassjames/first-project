
public class task1 {

	public static void main(String[] args) {
		String input = "alpha123beta123";

		// output-ateba123hpla123

		String a = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

try {
	
	Integer.parseInt(ch);
	
	
	
} catch (Exception e) {
	
}
			

			a = ch + a;

		}
		System.out.println(a);
	}

}
