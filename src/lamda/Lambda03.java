package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {
		
		  List<String> list=new ArrayList(Arrays.asList("emre","kader","emine","nilgun","islam","emre"));

		  
		//  bykHarfTkrarsz(list);
		//  carekterSayiTersSirali(list);
		//  carekterSayisiSiraliEl(list);
		  carekterSonHarfTersSiraliEl(list);
		  harfSayisi7Kontrol(list);
		  wBaslamaKontrol(list);
		  
		  
		  
	}
// list elemanlarini harf sira tekrarsiz
	
	public static void bykHarfTkrarsz(List<String> list) {
		
		list.stream().map(t->t.toUpperCase()).sorted().distinct().forEach(Lambda03::printel);
		
		// tekrarsiz distinct
		
		
	}
	
	public static void printel(String t) {
		
		System.out.print(t+" ");
	}
	// list elemanlari karekter sayisi ters sirali tekrarsiz
	
	public static void carekterSayiTersSirali(List<String> list) {
		
		list.stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(Lamda01::printel);
		
	}
	// list elemanlarini chrecter sayisina gore kckten byuge yazdiriniz
	
	public static void carekterSayisiSiraliEl(List<String> list) {
		list.stream().sorted(Comparator.comparing(t->t.toString().length())).forEach(Lambda03::printel);
	}
	
	
	// list elemanlarini son harfine gore ters sirali
	
	public static void carekterSonHarfTersSiraliEl(List<String> list) {
		list.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)));
	}
	// cift sayili elemanlarin karelerini hesaplayan tekrarsiz ters sirali
	
	// list elemanlarinin 7 ve 7 den az olma durumunu kontrol ediniz
	public static void harfSayisi7Kontrol(List<String> list) {
		
boolean	kontrol=	list.stream().allMatch(t->t.length()<=7);
		System.out.println(kontrol);
		
	}
	
	// list elemanlarinin "w"ile baslamasini kontrol ediniz
	
	public static void wBaslamaKontrol(List<String> list) {
		
		System.out.println(list.stream().noneMatch(t->t.startsWith("w"))? "w ile baslayan isim var":"agam w ila baslayan isim mi olr");
		
		
	}
	// karekter sayisi en fazla olan elemani yazdiriniz
	
	public static void carekterEnBüyük(List<String> list) {
		
		 list.stream().sorted(Comparator.comparing(t->t.toString().length())).findFirst();
		
		
	}
}		

	

