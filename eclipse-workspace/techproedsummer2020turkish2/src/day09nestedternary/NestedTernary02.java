package day09nestedternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		/*kullanicidan bir �cgenin uc kenar uzunlugunu alin.
		 * Ucu birbirine esitse cevreyi kontrol edin.
		 * cevre 30 dan b�y�k ise ""Ne b�y�ks�n yazdirin.
		 * degilse "Normal yazdirin"
		 *ucu birbirine esit degilse Cevreyi kontrol edin.
		 *cevre 20 den k�c�kse "Ne k�c�ks�n yazdirin" degilse "Normal yazdirin"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("�cgenin kenarlarini giriniz");
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int cevre = A + B + C;
	String result = (A == B && B == C) ? ((cevre > 30)?("Ne B�y�ks�n"):("Normal")):((cevre<20)?("Ne k�c�ks�n"):("normal"));
		System.out.println(result);
		scan.close();
		
		
	}

}
