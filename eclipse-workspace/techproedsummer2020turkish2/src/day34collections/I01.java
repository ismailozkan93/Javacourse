package day34collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);
		
	//List'i[ZA, YA, XA] sekline iterator kullanarak d�n�st�r�n.
	ListIterator<String> li1 = list1.listIterator();
	while(li1.hasNext()) {
		Object el=li1.next();
		li1.set(el+"A");
	}
	System.out.println(list1);	
		
	
	//hasPrevious() ve previous() methodlari kullanabilmek icin �ncesinde hasNext()
	//ve next() methodlarini pointer'ien saga tasinmak icin kullanmak gerekir.
	
	while(li1.hasPrevious()) {
		Object el=li1.previous();
	
		System.out.println(el+" ");
	}
		
	}
}
