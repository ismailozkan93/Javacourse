package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		// Kullanican bir g�n alin eger 
		//"Cuma" ise m�sl�manlar icin kutsal g�n
		// cumartesi ise yahudiler icin kutsal g�n
		//pazar ise hristiyanlar icin kutsal g�n
	//Stringleri karsilastirirken sakin haa"=="kullanmayin.
		//Stringleri karsilastirken kesinlikle equals() kullanin
		//equals() boolean return eder.
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir G�n Giriniz");
	String gun = scan.nextLine();
	if(gun.equals("Cuma")) {
		System.out.println("M�sl�manlar icin kutsal g�n");
	}
	
	if(gun.equals("Cumartesi")) {
		System.out.println("Yahudiler icin kutsal g�n");
	}
	if(gun.equals("Pazar")) {
		System.out.println("Hristiyanlar icin kutsal g�n");
	}
	scan.close();
		
		
	}

}
