package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lamda02 {

	public static void main(String[] args) {
		
  List<Integer> list=new ArrayList(Arrays.asList(12,-3,65,34,22,-60));
     
	//blist in cift elemanlarin karelerini aliniz en buyugunu yazdirin
	
  ciftKareMax(list);
  listToplam(list);
  listToplam1(list);
  carpCifteln(list);
  carpCifteln1(list);
  tekKareBuyukten(list);
	
	
	}

	public static void ciftKareMax( List<Integer> list) {
	Optional<Integer> maxEl=	list.stream().filter(Lamda01::ciftBul).map(t->t*t).reduce(Integer::max);
	// reduce (math::max da kullanilabilir Integer daha dar oldugu icin  tercih edilir
	// reduce return elemanin null yada int dan buyuk ihtimali icin
	// java guvenlik olarak optional class sart kosuyor
	System.out.println(maxEl);
	}
	
	// listeki tum elemanlari toplamini yazdiriniz 
	// Lamda Expresion  math::sum 
	
	public static void listToplam(List<Integer> list) {
	int toplam=list.stream().reduce(0,(x,y)->x+y);
//	x her zaman ilk degerini atanan "0"alir
	// y her zaman dgerini list streamden alir
	// x ilk degerinden sonraki degerlerini islem sonucundan alir
	System.out.println(toplam);
	}
	// listdeki tum elemanlarinin toplamini bulalim
	// method reference
	
	public static void listToplam1(List<Integer> list) {
		Optional<Integer> toplam=list.stream().reduce(Integer::sum);
		//Optional<Integer> toplam=list.stream().reduce(Math::addExact);
		
		System.out.println(toplam);
		
	}
	// listdeki cift elemanlarin carpimini yazdiriniz
	// method reference
	
	public static void carpCifteln(List<Integer> list) {
		Optional<Integer>	carp=list.stream().filter(Lamda01::ciftBul).reduce(Math::multiplyExact);
		System.out.println(carp);
	}
	
	
	
	// listedi cift sayilari carpimini yazdiriniz 
	// lamda expression
	
	public static void carpCifteln1(List<Integer> list) {
	Integer	carp=list.stream().filter(Lamda01::ciftBul).reduce(-1,(x,y)->x*y);
		System.out.println(carp);
	}
	
	// listedi elemanlardan en kucugunu dort farkli yontemle yazdiriniz
	
	public static void min1(List<Integer> list) {
		Optional<Integer>min=list.stream().reduce(Integer::min);
	System.out.println(min);
	}
	
	public static void min2(List<Integer> list) {
		Optional<Integer>min=list.stream().reduce(Math::min);
	System.out.println(min);
	}
	
	public static int minBul(int  x,int y) {
		
		
		return x<y?x:y;
		
	}
	
	
	
	
	public static void min3(List<Integer> list) {
		Optional<Integer>min=list.stream().reduce(Lamda02::minBul);
	System.out.println(min);
	}
	public static void min4(List<Integer> list) {
		//Integer min=list.stream().reduce(Integer.max(x,y)->x<y?x:y);
	//System.out.println(min);
		// list deki 15 den buyuk en kucuk tek sayiyi yazdiriniz
	}
	// list deki 15 den buyuk en kucuk tek sayiyi yazdiriniz
	
	public static void onbestenByukKckTekSayi(List<Integer> list) {
		
		// list.stream().filter(t->t% ==1 && t>15).reduce
		// list in tek elemanlarini buyukten kucuge dogru yazdiriniz
		
		
	}
	// list in tek elemanlarini buyukten kucuge dogru yazdiriniz
	
	public static void tekKareBuyukten(List<Integer> list) {
		
		list.stream().filter(t->t%2==1).map(t->t*t).sorted(Comparator.reverseOrder()).forEach(Lamda01::printel);
		
		
		
	}
	
	
}
