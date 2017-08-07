package classes;

public class Motherboard {
	
	private String model;
	private String manufacturer;
	private int remSlots;
	private int cardSlots;
	private String bios;
	
	
	public Motherboard(String model, String manufacturer, int remSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.remSlots = remSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public String loadProgram(String program){
		System.out.println("" + program + " is loading");
		return "" + program + " is loading";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getRemSlots() {
		return remSlots;
	}

	public void setRemSlots(int remSlots) {
		this.remSlots = remSlots;
	}
	
	public int getCardSlots() {
		return cardSlots;
	}

	public void setCardSlots(int cardSlots) {
		this.cardSlots = cardSlots;
	}

	public String getBios() {
		return bios;
	}

	public void setBios(String bios) {
		this.bios = bios;
	}
	
};
