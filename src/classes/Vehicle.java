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
	
	public String ride(){
		return "The vehicle number " + this.id + " moves on";
	};
	
	public void accelarate(int value){
		this.speed += value;
	};
}
