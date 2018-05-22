package atm;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ATMApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ATM myATM = new ATM(500, "54321");

		System.out.println("Please enter your PIN:");
		String enteredPin = input.nextLine();

		if (myATM.getPin().equals(enteredPin)) {
			System.out.println("Welcome to your bank account.");
		} else {
			System.out.println("Buzz off, ya hoser.");
			System.exit(0);
		}
		// remember, you don't want to allow direct (public) access to your
		// fields.
		// instead, you have to create a method that returns the private field.

		System.out.println("Choose an option:");
		System.out.println("Press 1 to deposit funds.");
		System.out.println("Press 2 to withdraw funds.");
		System.out.println("Press 3 to check balance.");
		System.out.println("Press 4 to exit.");
		String menuOption = input.nextLine();

		while (!menuOption.equals("4")) {

			if (menuOption.equals("1")) {
				System.out.println("Enter the amount to deposit:");
				int amountToDeposit = input.nextInt();
				myATM.deposit(amountToDeposit);
			} else if (menuOption.equals("2")) {
				System.out.println("Enter the amount to withdraw:");
				int amountToWithdraw = input.nextInt();
				myATM.withdraw(amountToWithdraw);
			} else if (menuOption.equals("3")) {
				System.out.println("Your current balance is: "
						+ myATM.getBalance());
				// this one needs enter key hit to move on.
				// not sure why, it's the same as the video.
			}
			/*
			 * else if (menuOption.equals("4")) {
			 * System.out.println("Goodbye. Thanks for your business!");
			 * System.exit(0); // that last line needed an argument. //I guess 0
			 * is the "safe" choice. }
			 */
			
			input.nextLine(); // makes an extra line
			System.out.println("Choose an option:");
			System.out.println("Press 1 to deposit funds.");
			System.out.println("Press 2 to withdraw funds.");
			System.out.println("Press 3 to check balance.");
			System.out.println("Press 4 to exit.");
			menuOption = input.nextLine();
		}

		if (menuOption.equals("4")) {
			System.out.println("Goodbye. Thanks for your business!");
			System.exit(0);
		}
	}
}
