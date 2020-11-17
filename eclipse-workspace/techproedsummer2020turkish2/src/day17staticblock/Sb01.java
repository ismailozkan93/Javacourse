package day17staticblock;

public class Sb01 {

	/*Farzdekin bu class dairenin alanini ve cevresini hesaplayacak.
	 * Alan = pi*r*r 		cevre = 2*pi*r
	 * Bu class da pi sayisi her zaman kullanilicaktir.Pi sayisina class �retirken
	 * deger atamasi yapmak faydalidir.Eger class �retilirken bazi variablelara deger 
	 * atamasi yapilmasi isterseniz static block kullanmalisiniz. 
	 */
	
	/*Static block icinde kullanilan hersey static olmalidir.
	 * Bu y�zden asagidaki �rnekte "pi" variable'ni static yapmak zorundayiz.
	 */
	/*Static block main methoddan diger b�t�n methodlardan ve b�t�n constructorlardan
	 * �nce calisir.
	 */
	/*
	 * Static block class olusturulurken calistirilir.
	 */
	
	static double pi;
	
	Sb01(){
		System.out.println("Constructor");
	}
	static {
		pi=3.14;
		System.out.println("Static block Ali");
	}
	
	
	public static void main(String[] args) {
		
		Sb01 obj1 = new Sb01();
		
		System.out.println("Main Method");

		Sb01 obj2 = new Sb01();
	}
static {
	pi = 3.14;
	System.out.println("Static block Veli");
}
	
}
