package day04scanner;

import java.util.Scanner;

public class question04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Herhangi bir karakter giriniz");
		char ch = scan.next().charAt(0);
		System.out.println("  " + ch + "  ");
		System.out.println(" " + ch + " " + ch + " ");
		System.out.println(ch + " " + ch + " " + ch);
		scan.close();

	}

}
