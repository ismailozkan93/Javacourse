package day12forvewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// Ilk 10 sayma sayisini ekrana yazdiriniz.
		int i = 1;
		while(i<=10) {
			System.out.println(i +" ");
			i++;
		}
/*Yukaridaki kodda int i=1; ifadesi for-loop un ilk b�lgesi,
 * i<=10 for-loop`un ikinci b�lgesi,i++; for-loop un ucunu b�lgesi gibidir.
 * DIKKAT:i++; ifadesi yazmazsaniz while-loop d�ng�s� sonsuz d�ng�ye girer bu da pc ye zarar verebilir.	
*/
	//ilk 10 sayma sayisinin b�y�kten k�c�ge yazdiriniz.while-loop kullanin.	
		
		int a =10;
		while(a>=1) {
		System.out.println(a+" ");
		a--;
		}
		
//ilk 100 cift sayma sayisini yazdiriniz.
		int sayma=1;
		int t = 1;
		while(sayma<=100) {
		if(t%2==0) {
			System.out.print(t + " ");
		sayma++;
		}
		t++;
		}
//j den �nceki t�m k�c�k harfleri yazdiran bir program yapiniz.while-loop kullaniniz
		
		char h ='a';
		while ( h<'j') {
			System.out.println(h+" ");
			h++;
		}
		
//Son ilk bes harfin aski degerleri toplamini ekrana yazdiran bir program yaziniz.While-loop kullaniniz
		int sum2=0;
		int s='A';//char s ='A'; Char lar matematiksel islemde aski degeri alirlar.
		while(s<='E') {
			sum2 = sum2 + s;
			s++;
		}
		System.out.println("toplam: " +sum2);
	}

}
