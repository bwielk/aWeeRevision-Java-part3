package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	
	private BankAccount account;
	
	@Before
	public void before(){
		account = new BankAccount(100.0);
	}
	
	@Test
	public void shouldHaveBalance(){
		assertEquals(100.0d, account.getBalance(), 0.1);
	}
	
	@Test
	public void shouldBeAbleToDepositFunds(){
		account.depositFunds(145.0);
		assertEquals(245.00, account.getBalance(), 0.1);
	}
	
	@Test
	public void shouldBeAbleToSetBalance(){
		account.setBalance(200.00);
		assertEquals(200.00, account.getBalance(), 0.1);
	}
	
	@Test
	public void shouldBeAbleToGiveMoney(){
		account.setBalance(200.00);
		account.givesCash(140.00);
		assertEquals(60.00, account.getBalance(), 0.1);
	}
	
	@Test
	public void shouldNotifyLackOfFunds(){
		account.setBalance(300.00);
		assertEquals("Not enough funds", account.givesCash(350.00));
	}
}
