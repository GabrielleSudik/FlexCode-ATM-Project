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
		ATM underTest = new ATM(300, "12345");
		
		//act -- create a default balance for the account
		int balance = underTest.getBalance();
		
		//assert -- check that something is what you expect
		assertEquals(300, balance);
	}
	
	//let's try it again to show it works for multiple values:
	@Test
	public void shouldHaveDefaultBalanceOf400(){
		
		//arrange -- create a new instance of the ATM class
		ATM underTest = new ATM(400, "12345");
		
		//act -- create a default balance for the account
		int balance = underTest.getBalance();
		
		//assert -- check that something is what you expect
		assertEquals(400, balance);
	}
	
	//new test: make sure withdrawal works
	//code is similar to above, but with added line checking
	//that the withdraw method (lulz) works
	@Test
	public void shouldHaveBalanceOf100AfterWithdrawalOf100(){
		
		//the name of this method -- see how specific it is? that's good.
		ATM underTest = new ATM(200, "12345");
		
		underTest.withdraw(100);
		
		int balance = underTest.getBalance();
		
		assertEquals(100, balance);
	}
	
	@Test
	public void shouldHaveBalanceOfZeroAfterWithdrawOf300(){
		
		ATM underTest = new ATM(200, "12345");
		
		underTest.withdraw(300);
		
		int balance = underTest.getBalance();
		
		assertEquals(0, balance);
	}
	
	@Test
	public void shouldHaveBalanceOf200AfterDepositOf100(){
		
		ATM underTest = new ATM(100, "12345");
		
		underTest.deposit(100);
		
		int balance = underTest.getBalance();
		
		assertEquals(200, balance);
	}
	
	//these next two are different
	//they check a bool.
	//the one that should work matches the set variable (12345)
	//the one that should "fail" does not match the set variable
	
	@Test
	public void shouldAllowAccessByPIN(){
		
		ATM underTest = new ATM(100, "12345");
		
		boolean access = underTest.allowAccess("12345");
		
		assertTrue(access);
	}
	
	@Test
	public void shouldDenyAccessByPIN(){
		
		ATM underTest = new ATM(100, "12345");
		
		boolean access = underTest.allowAccess("12346");
		
		assertFalse(access);
	}

}
