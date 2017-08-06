package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	
	private Car car1;
	
	@Before
	public void before(){
		car1 = new Car(1, 80, 4, "Seat", 4556, 123, 4, 200, 5, true, "Extra seats");
	}
	
	@Test
	public void canGetNumberOfEngines(){
		int numOfEngines = car1.getEngine();
		assertEquals(1, numOfEngines);
	}
	
	@Test 
	public void canGetSpeed(){
		int speedValue = car1.getSpeed();
		assertEquals(80, speedValue);
	}
	
	@Test 
	public void canRide(){
		String result = car1.ride();
		assertEquals("The vehicle number 123 moves on", result);
	}
	
	@Test
	public void canAccelarate(){
		car1.accelarate(1000);
		assertEquals(1080, car1.getSpeed());
	}
}
