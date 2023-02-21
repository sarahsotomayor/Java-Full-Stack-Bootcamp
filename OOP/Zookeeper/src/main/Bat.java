package main;

public class Bat extends Mammal{
	//belongs only to bat class
	private int fly;
	private int eatHumans;
	private int attackTown;
	
	public int getFly() {
		return fly;
	}
	
	public void setFly(int fly) {
		this.fly = fly;
	}
	
	public int getEatHumans() {
		return eatHumans;
	}
	
	public void setEatHumans(int eatHumans) {
		this.eatHumans = eatHumans;
	}
	
	public int getAttackTown() {
		return attackTown;
	}
	
	public void setAttackTown(int attackTown) {
		this.attackTown = attackTown;
	}
	
	//methods
	public void fly() {
		setEnergyLevel(getEnergyLevel() - 50);
		System.out.println("Bat is flying.");
	}
	
	public void eatHumans() {
		setEnergyLevel(getEnergyLevel() + 25);
		System.out.println("Is the bat eating a... is that... RUN!");
	}
		
	public void attackTown() {
		setEnergyLevel(getEnergyLevel() - 100);
		System.out.println("The town is on fire!");
	}
	
}
