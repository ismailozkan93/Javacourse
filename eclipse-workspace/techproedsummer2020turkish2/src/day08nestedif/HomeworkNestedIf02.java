package day08nestedif;

import java.util.Scanner;

public class HomeworkNestedIf02 {

	public static void main(String[] args) {
	/*Kullanıcıdan password girmesini isteyin.  Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. 
	 * Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın. 
	 * Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
	 * Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
	 **/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();
		int birler = sayi-((sayi/10)*10) ;
		if( birler %5 == 0 ) {
			if(birler == 0){System.out.println("5´e bölünen cift sayi");
			}
			else {System.out.println("5 e bölünen tek sayi");
			}
			}
				
		else {
			System.out.println("Tekrar deneyin");
		}
	}

}
