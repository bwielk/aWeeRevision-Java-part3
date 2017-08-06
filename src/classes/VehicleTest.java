package classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {
	
	private Vehicle vehicle1;
	
	@Before
	public void before(){
		vehicle1 = new Vehicle(1, 100 ,2, "Fiat", 345, 112);
	}
	
	@Test
	public void shouldRide(){
		String result = vehicle1.ride();
		assertEquals("The vehicle number 112 moves on", result);
	}
	
	@Test
	public void shouldIncreaseSpeed(){
		vehicle1.accelarate(200);
		assertEquals(300, vehicle1.getSpeed());
	}

}
