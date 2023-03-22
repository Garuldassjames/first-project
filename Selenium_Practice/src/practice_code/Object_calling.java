package practice_code;

public class Object_calling {
	public void Familymembers() {
		System.out.println("two adults and two childres");
	}
		public void The_members() {
			System.out.println("There are four members in the fam....");
		}
			public void Adultsname() { 
			System.out.println("adults name");
			System.out.println("Adult 1.gnana dass");
			System.out.println("Adult 2:Roseline suriyakal");
			}
			public void Childsname() {
			System.out.println(" ");
			System.out.println("Childrens name");
			System.out.println("Child 1:arul dass james");
			System.out.println("Child 2:arul das andrew");
	}

			public static void main(String[] args) {
				Object_calling f=new Object_calling();
				f.The_members();
				f.Adultsname();
				f.Childsname();
			}
}
