import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String args[]) {
		boolean playAgain;
		int roundsWon = 0;
		do {
			int i, maxAttempts = 5;
			Random rand = new Random();
			Scanner sn = new Scanner(System.in);
			int num = rand.nextInt(100);
			for (i = 0; i < maxAttempts; i++) {
					System.out.print("enter number to guess: ");
					int guess = sn.nextInt();

					if (guess > num) {
						System.out.println("Too high");

					} else if (guess < num) {
						System.out.println("Too low");

					} else {
						System.out.println("Congratulations you guessed the number in attempt " + i);
						roundsWon++;
					}
			}
			if (i == maxAttempts) {
				System.out.println("Sorry, you've run out of attempts.The correct number is:" + num);
			}
			System.out.print("Do you want to play again? (yes/no): ");
			String playAgainInput = sn.next().toLowerCase();
			playAgain = playAgainInput.equals("yes");
		} while (playAgain);
		System.out.println("Game Over!");
		System.out.println("Rounds won: " + roundsWon);
	}
}