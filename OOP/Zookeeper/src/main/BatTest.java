package main;

public class BatTest {
	
	public static void main(String[] args) {
		
		Bat Golbat = new Bat(); {
			Golbat.setEnergyLevel(300);
			Golbat.attackTown();
			Golbat.attackTown();
			Golbat.attackTown();
			Golbat.eatHumans();
			Golbat.eatHumans();
			Golbat.fly();
			Golbat.fly();
			
			Golbat.displayEnergy();
		}
	}

}
