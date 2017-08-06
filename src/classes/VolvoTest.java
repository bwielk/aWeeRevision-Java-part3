package classes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class VolvoTest {
	
	private Volvo volvo1;

	@Before
	public void before(){
	volvo1 = new Volvo(1, 400, 22, "a1", 34, 2, 45, 23, 2, false, "extra accelarators" , true, true);
	}
	
	@Test
	public void canBeMadeSomewhereElse(){
		volvo1.setMadeInSweden(false);
		assertEquals(false, volvo1.isMadeInSweden());
	}
	
	@Test
	public void canRide(){
		String result = volvo1.ride();
		assertEquals("The vehicle number 2 moves on", result);
	}
	
	@Test
	public void canGetWheels(){
		assertEquals(45, volvo1.getWheels());
	}
	
}
