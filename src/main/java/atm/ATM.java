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

}
