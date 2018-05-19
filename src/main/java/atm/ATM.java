package atm;

public class ATM {

	private int balance;

	public ATM(int balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		//you added that line
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
		//that was originally "0"
		//you changed it to 100 to match the assertEquals test
		//then for a better test, you changed it to "balance" (and added a "balance" field)
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

}
