import java.util.Scanner;

public class CreatingACalculator {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number1 = keyboardInput.nextInt();
		
		System.out.print("Enter another number: ");
		int number2 = keyboardInput.nextInt();
		
		int sum = number1 + number2;
		
		System.out.println("The sum of number1 and number2 is: " + sum);
	}

}
