package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		/*Kullanicidan bir sayi alin bu sayi 3 e b�l�n�yorsa 
		 * ekrana "3`un kati" b�l�nm�yorsa "3 e b�l�nm�yor yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Tam Sayi Giriniz");
		int num = scan.nextInt();
		
		if(num%3==0) {System.out.println("3`�n");
		}
		
		if(num%3!=0){System.out.println("3`e b�l�nm�yor");
		}

	}

}
