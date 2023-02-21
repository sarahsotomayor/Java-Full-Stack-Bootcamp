package main;

public class Gorilla extends Mammal {
	
	//belongs only to gorilla class
	private int throwSomething;
	private int eatBananas;
	private int climb;
	
	//getters and setters
	public int getThrowSomething() {
		return throwSomething;
	}
	
	public void setThrowSomething(int throwSomething) {
		this.throwSomething = throwSomething;
	}
	
	public int getEatBananas() {
		return eatBananas;
	}
	
	public void setEatBananas(int eatBananas) {
		this.eatBananas = eatBananas;
	}
	
	public int getClimb() {
		return climb;
	}
	
	public void setClimb(int climb) {
		this.climb = climb;
	}
	
	//methods
	public void throwSomething() {
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("Gorilla threw a rock!");
	}
	
	public void eatBananas() {
		setEnergyLevel(getEnergyLevel() + 10);
		System.out.println("Gorilla ate a banana!");
	}
		
	public void climb() {
		setEnergyLevel(getEnergyLevel() - 10);
		System.out.println("Gorilla climbed a tree!");
	}
	
}
