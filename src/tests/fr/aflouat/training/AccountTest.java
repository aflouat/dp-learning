package fr.aflouat.training;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AccountTest {

	
	/*
	@Test
	public void testWhenAccountIsCreditedTheBalanceShouldBeUpdated(){
		//Arrange
		Account account = new Account(0);
	
		//Act
		account.credit(250);
		
		//Assert
		
		assertEquals(Math.round(250 - account.getBalance()) < 0.001, true);
	}*/
	
	@ParameterizedTest(name = "{0} + {1} = {2} ")
	@CsvSource({
			"0,    250,   250",
			"-160,    200,   40",
			"5600,  50, 5650",
			"1000,  100, 1100",
			"1525.25,75,1600.25"
	})
	
	void testWhenAccountIsCreditedTheBalanceShouldBeUpdated(double balance, double credit, double expectedBalance) {
		Account account = new Account(balance);
		account.credit(credit);
		assertEquals(Math.round(expectedBalance - account.getBalance()) < 0.001, true,
				() -> balance + " this account balance when credited with  " + credit + " should equal " + expectedBalance);
	}

}
