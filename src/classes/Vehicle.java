package classes;

public class Vehicle {
	
	private int engine;
	private int speed;
	private int doors;
	private String name;
	private int model;
	private int id;
	
	public Vehicle(int engine, int speed, int doors, String name, int model, int id){
		this.engine = engine;
		this.speed = speed;
		this.doors = doors;
		this.name = name;
		this.model = model;
		this.id = id;
	};
	
	public int getSpeed(){
		return this.speed;
	};
	
	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String ride(){
		return "The vehicle number " + this.id + " moves on";
	};
	
	public void accelarate(int value){
		this.speed += value;
	};
}
