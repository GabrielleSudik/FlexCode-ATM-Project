package atm;

public class ATM {

	private int balance;
	
	//private String requiredPin = "12345";
	private String requiredPin;
	
	//instead of hard coding the requiredPin,
	//you could make String requiredPin a parameter of the constructor
	//ie, public ATM(int balance, String requiredPin) and
	//this requiredPin - requiredPin;
	//then each test needs to pass arguments for both balance and requiredPin
	//you might wind up updating your code that way as you develop the app

	public ATM(int balance, String requiredPin) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		//you added that line
		this.requiredPin = requiredPin;
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
		//that was originally "0"
		//you changed it to 100 to match the assertEquals test
		//then for a better test, you changed it to "balance" (and added a "balance" field)
	}
	
	//this method allows public access of the private property.
	//ie, it allows access to requiredPin, but indirectly
	public String getPin(){
		return requiredPin;
	}

	//like a lot of other code, this wasn't typed in the order you see it.
	//your second test made sure you could subtract amount from balance.
	//your third test made sure balance wouldn't drop below zero.
	//so the if-else statement was added later.
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		
		if (balance > amount) {
			balance -= amount;
		}
		else {
			balance -= balance;
			//this isn't the best logic for your program over all,
			//but it works well enough to test this part.
		}

	}

	public void deposit(int amount) {
		// TODO Auto-generated method stub
		balance += amount;
	}

	public boolean allowAccess(String enteredPin) {
		// TODO Auto-generated method stub
		
		if (enteredPin.equals(requiredPin)){
			return true;
		}
		else{
			return false;
		}

		
	}

}
