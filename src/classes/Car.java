package classes;

public class Car extends Vehicle {
	
	private int wheels;
	private int petrol;
	private int exhausts;
	private boolean isManual;
	private String currentGear;
	
	public Car(int engines, int speed, int doors, String name, int model, int id, int wheels, int petrol, int exhausts,
			boolean isManual, String currentGear) {
		super(engines, speed, doors, name, model, id);
		this.wheels = wheels;
		this.petrol = petrol;
		this.exhausts = exhausts;
		this.isManual = isManual;
		this.currentGear = currentGear;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getPetrol() {
		return petrol;
	}

	public void setPetrol(int petrol) {
		this.petrol = petrol;
	}

	public int getExhausts() {
		return exhausts;
	}

	public void setExhausts(int exhausts) {
		this.exhausts = exhausts;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public String getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(String currentGear) {
		this.currentGear = currentGear;
	}
	
	};
	
