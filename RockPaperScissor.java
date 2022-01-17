import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String[] moves = { "rock", "paper", "scissor" };
			Random random = new Random();
			String computerMove = moves[random.nextInt(moves.length)];

			String playerMove;
			while (true) {
				System.out.println("Enter your choice (rock, paper, scissor): ");
				playerMove = sc.nextLine().toLowerCase();
				if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissor")) {
					break;
				}
				System.out.println(playerMove + " is not valid, Please enter again !");
			}

			System.out.println("You chose " + playerMove);
			System.out.println("Computer chose " + computerMove);

			if (playerMove.equals(computerMove)) {
				System.out.println("The game was a tie!");
			} else if (playerMove.equals("rock")) {
				if (computerMove.equals("paper")) {
					System.out.println("You Lose! Computer Wins!");
				} else if (computerMove.equals("scissor")) {
					System.out.println("You Win! Computer Loses!");
				}
			} else if (playerMove.equals("paper")) {
				if (computerMove.equals("rock")) {
					System.out.println("You Win! Computer Loses!");
				} else if (computerMove.equals("scissor")) {
					System.out.println("You Lose! Computer Wins!");
				}
			} else if (playerMove.equals("scissor")) {
				if (computerMove.equals("paper")) {
					System.out.println("You Win! Computer Loses!");
				} else if (computerMove.equals("rock")) {
					System.out.println("You Lose! Computer Wins!");
				}
			}

			System.out.println("Do you wish to continue? (y/n)");
			String playAgain = sc.nextLine();

			if (!playAgain.equals("y")) {
				break;
			}
		}
		sc.close();
	}
}
