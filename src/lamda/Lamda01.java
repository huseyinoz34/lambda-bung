package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lamda01 {
	
	
	
	
			
			
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new ArrayList<>(Arrays.asList(12,13,65,7,34,42));
// structured Programing ile elemanlarin tamamini yazdirin
		
		prinelStructured(list);
		System.out.println();
		prinelfunctional(list);
		System.out.println();
		System.out.println("*****");
		prinelfunctional1(list);
		System.out.println();
		printCiftStructured(list);
		System.out.println();
		printCiftFunctional(list);
		System.out.println();
		printCiftFunctional2(list);
		System.out.println();
		 printCiftbuyuk(list);
		 System.out.println();
		 ciftKareal(list);
		 System.out.println();
		 maxElfunction(list);
		
	}
public static void prinelStructured(List<Integer> list) {
	for (Integer w : list) {
		System.out.print(w+" ");
		
	}
}

//functional Programing  ile list elemanlarinin tamamini aralarina bosluk birakarak yazdirin 

   public static void prinelfunctional(List<Integer> list) {
	 list.stream().forEach(t->System.out.print(t+" "));  
	 // stream datalari yukaridan asagi akis yatayda olmayan method   
	   
	 // forEach datanin parametresine gore her bir elemani isler  
   }
   
// method Reference kendi create ettigimiz veya javadan aldigimiz ile 
   //Classname::methodnamae
   
   public static void printel(int t) {// refere edilecek
	   System.out.print(t+" ");
   }
   
   
   public static void prinelfunctional1(List<Integer> list) {
	   
	   list.stream().forEach(Lamda01::printel);
   }
   // structured programig ile list elemanlarinin cift olanlarini yanyana yazdirin
   
   
   public static void printCiftStructured(List<Integer> list) {
	  
	   for (Integer w : list) {
		   if (w%2==0) {
			System.out.print(w+" ");
		}
		
	}
   }
   
   
   // functional programig ile list elemanlarinin cift olanlarini yanyana yazdirin
 
   public static void printCiftFunctional(List<Integer> list) {
	 list.stream().filter(t->t%2==0).forEach(Lamda01::printel);  
	   //filter akis icindeki elemanlari istenen carta gore secer
   }
   
   public static boolean ciftBul(int i) {
	   
	   return i%2==0;
   }
   
   public static void printCiftFunctional2(List<Integer> list) {
	   list.stream().filter(Lamda01::ciftBul).forEach(Lamda01::printel);
   }
   
  //   // functional programig ile list elemanlarinin 30 dan buyuk  cift olanlarini yanyana yazdirin
 
   
   
   public static void printCiftbuyuk(List<Integer> list) {
	  list.stream().filter(t->t%2==0 & t>30).forEach(Lamda01::printel);
	  
	 // functional programming ile elemanlarin cift olanlarinin karelerini ayni satirda bosluk
   }
	  public static void ciftKareal(List<Integer> list) {
		 list.stream().filter(Lamda01::ciftBul).map(t->t*t).forEach(Lamda01::printel);
	  
	  
   
	  }
   
	  // en buyuk elemani yazdirin
	  public static void maxElfunction(List<Integer> list) {
		Optional <Integer>maxEl = list.stream().reduce(Math::max);
		System.out.println(maxEl);
		//reduce azaltmak bir cok datayi bir dataya cevirmek icin max gibi
	  }
	  
	  
}
