package day09nestedternary;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		/*Kullanicidan g�n numarasini alin
		 * ekrana gun iswmini yazdirin
		 * 1==> pazar 7==>cumartesi
		 */
Scanner scan =new Scanner(System.in);
System.out.println("G�n giriniz");
int gun = scan.nextInt();

//case 1 veya case(1) kullanilabilir)
switch(gun) {
case (1):
System.out.println("Pazar");
break;

case (2):
System.out.println("Pazartesi");
break;

case (3):
System.out.println("Sali");
break;

case (4):
System.out.println("Carsamba");
break;

case (5):
System.out.println("Persembe");
break;

case (6):
System.out.println("Cuma");
break;

case (7):
System.out.println("Cumartesi");
break;

default:
	System.out.println("L�tfen 1-7 arasi bir tamsayi giriniz");
	}
scan.close();
	}}
