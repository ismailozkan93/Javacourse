package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*Kullanicidan bir �cgenin �c kenar uzunlugunu alin
		 * �c kenar esitse eskenar �cgen
		 * degilse eskenar degil yazin
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("�cgenin A Giriniz");
		int kenarA = scan.nextInt();
		System.out.println("�cgenin B Giriniz");
		int kenarB = scan.nextInt();
		System.out.println("�cgenin C Giriniz");
		int kenarC = scan.nextInt();
		
	String sonuc = (kenarA == kenarB || kenarB == kenarC)? "Eskenar" : "Eskenar Degil";	
		System.out.println(sonuc);
		scan.close();
		
	}

}
