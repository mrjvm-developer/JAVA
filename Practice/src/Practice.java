import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("How many names will be entered? ");
		int number = keyboardInput.nextInt();
		System.out.print(number);
		
		String [] names = new String[number];
		System.out.print(names);
	}
}