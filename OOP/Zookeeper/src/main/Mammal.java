package main;

public class Mammal {
	//static - belongs to mammal class
	private int energyLevel;
	
	//constructors
	public Mammal () {
		
	}
	
	//getters and setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	//method
	public void displayEnergy() {
		System.out.println("Energy level is " + energyLevel);
	}

	
	
}
