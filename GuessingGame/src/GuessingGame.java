import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		String secretWord = "Jeremy";
		String guess = "";
		int guessCount = 0;
		int guessLimit = 3;
		boolean outOfGuesses = false;
		
		while(!guess.contentEquals(secretWord) && !outOfGuesses) {
			if(guessCount < guessLimit) {
				System.out.print("Enter a guess: ");
				guess = keyboardInput.nextLine();
				guessCount++;
			}
			
			else {
				outOfGuesses = true;
			}
		}
		if(outOfGuesses) {
			System.out.println("You lose! No more guesses!");
		}
		
		else {
			System.out.println("You win!");
		}
	}
}