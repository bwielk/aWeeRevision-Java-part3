package classes;

public class Volvo extends Car{
	
	private boolean mp3player;
	private boolean madeInSweden;
	
	
	public Volvo(int engines, int speed, int doors, String name, int model, int id, int wheels, int petrol,
			int exhausts, boolean isManual, String currentGear, boolean mp3player, boolean madeInSweden) {
		super(engines, speed, doors, name, model, id, wheels, petrol, exhausts, isManual, currentGear);
		this.mp3player = mp3player;
		this.madeInSweden = madeInSweden;
	}

	public boolean isMp3player() {
		return mp3player;
	}

	public void setMp3player(boolean mp3player) {
		this.mp3player = mp3player;
	}

	public boolean isMadeInSweden() {
		return madeInSweden;
	}

	public void setMadeInSweden(boolean madeInSweden) {
		this.madeInSweden = madeInSweden;
	}
	
}
