public class Methods {

	public static void main(String[] args) {		
		System.out.println("Top");
		sayHi();
		sayHi1("Jeremy", 33);
		System.out.println("Bottom");
	}
	
	public static void sayHi() {
		System.out.println("Hello, Jeremy!");
	}
	
	public static void sayHi1(String name, int age) {
		System.out.println("Hello, " + name + "!" + " You are " + age + "!");
	}
}