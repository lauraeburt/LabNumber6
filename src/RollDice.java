import java.util.Scanner;

public class RollDice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus Casino!");
		System.out.println();
		System.out.println("How many sides does each die have?");

		int dieSides = scan.nextInt();
		int die1;
		int die2;
		int counter = 1; // initialize and declare at the same time
		die1 = (int) (Math.random() * dieSides + 1);
		die2 = (int) (Math.random() * dieSides + 1);

		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {
			System.out.println();

			die1 = generateRandomDieRoll(dieSides);
			die2 = generateRandomDieRoll(dieSides);
			System.out.println("Roll" + " " + counter++ + ":");
			// System.out.println("The first die comes up " + die1);
			// System.out.println("The second die comes up " + die2);
			System.out.print("(" + die1 + ",");
			System.out.print(" " + die2 + ")");
			System.out.println();
			System.out.print("Roll again? (y/n)");
			cont = scan.next();

		}
		System.out.println("Goodbye!");

		scan.close();
	}

	public static int generateRandomDieRoll(int die) {
		return (int) (Math.random() * die + 1);

	}

	
	
}
