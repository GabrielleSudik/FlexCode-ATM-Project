package atm;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class ATMApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ATM myATM = new ATM(500, "54321");
		
		System.out.println("Please enter your PIN:");
		String enteredPin = input.nextLine();
		
		if (myATM.getPin().equals(enteredPin)){
			System.out.println("Welcome to your bank account.");
		}
		//remember, you don't want to allow direct (public) access to your fields.
		//instead, you have to create a method that returns the private field.
		
		System.out.println("Choose an option:");
		System.out.println("Press 1 to deposit funds.");
		System.out.println("Press 2 to withdraw funds.");
		System.out.println("Press 3 to check balance.");
		System.out.println("Press 4 to exit.");
		String menuOption = input.nextLine();
		
	}

}
