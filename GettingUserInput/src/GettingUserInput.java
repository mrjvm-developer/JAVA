import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = keyboardInput.nextLine();
		
		System.out.print("Enter your age: ");
		int age = keyboardInput.nextInt();
		
		System.out.println("Hey " + name + ", you are " + age + " years old!");
	}
}