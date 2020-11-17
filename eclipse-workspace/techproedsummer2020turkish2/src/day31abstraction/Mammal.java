package day31abstraction;

public abstract class Mammal extends Animal {

	/*
	 * 1)Gordugunuz gibi Mammal,Animal'in child class'i ve asi() methodu ile drink()
	 * methodunu override etmedi,ama herhangi bir CTE yok.C�nk� abstract childlarin
	 * abstract parenttaki abstract methodlari override etme zorunlulugu yoktur.
	 * 
	 */
	
	public abstract void feed() ;
	
	public void move() {
		System.out.println("Hareket ederler.");
	}
		
	
}
