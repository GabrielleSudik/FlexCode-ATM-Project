package atm;

import static org.junit.Assert.*;

import org.junit.Test;

import atm.ATM;


public class ATMTest {
	
	/*
	@Test
	public void shouldHaveDefaultBalance(){
		
		//arrange -- create a new instance of the ATM class
		ATM underTest = new ATM();
		
		//act -- create a default balance for the account
		int balance = underTest.getBalance();
		
		//assert -- check that something is what you expect
		assertEquals(100, balance);
	}
	//that test passed because 100 = balance in ATM class
	 */
	
	/*
	@Test
	public void shouldHaveDefaultBalanceOf200(){
		
		//arrange -- create a new instance of the ATM class
		ATM underTest = new ATM();
		
		//act -- create a default balance for the account
		int balance = underTest.getBalance();
		
		//assert -- check that something is what you expect
		assertEquals(200, balance);
	}
	//that test failed because 200 != balance in ATM class
	//let's make a test that will pass no matter what the default balance is
	*/
	
	//you left the two above, commented out, to show earlier steps
	//they won't work with the new constructor of ATM that accepts an int as a parameter
	//instead, use the next way, passing the int as an argument
	
	@Test
	public void shouldHaveDefaultBalanceOf300(){
		
		//arrange -- create a new instance of the ATM class
		ATM underTest = new ATM(300);
		
		//act -- create a default balance for the account
		int balance = underTest.getBalance();
		
		//assert -- check that something is what you expect
		assertEquals(300, balance);
	}
	
	//let's try it again to show it works for multiple values:
	@Test
	public void shouldHaveDefaultBalanceOf400(){
		
		//arrange -- create a new instance of the ATM class
		ATM underTest = new ATM(400);
		
		//act -- create a default balance for the account
		int balance = underTest.getBalance();
		
		//assert -- check that something is what you expect
		assertEquals(400, balance);
	}

}
