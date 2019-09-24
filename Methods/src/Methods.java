public class Methods {

	public static void main(String[] args) {		
		System.out.println("Top");
		sayHi1("Dave", 1);
		sayHi1("Phyllys", 2);
		sayHi1("Angela", 3);
		System.out.println("Bottom");
	}
	
	public static void sayHi() {
		System.out.println("Hello Mike");
		System.out.println("Hello Tom");
	}
	
	public static void sayHi1(String name, int age) {
		System.out.println("Hello " + name + " you are " + age);
	}
}