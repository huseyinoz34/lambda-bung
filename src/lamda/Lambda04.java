package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Lambda04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TechPro trGunduz=new TechPro("yaz","TR gunduz",97,124);
		TechPro engGunduz=new TechPro("kis","ENG gunduz",95,131);
		TechPro trGece=new TechPro("bahar","TR gece",98,143);
		TechPro engGece=new TechPro("sonbahar","ENG gece",93,151);

		List<TechPro> list=new ArrayList<>(Arrays.asList(trGunduz,engGunduz,trGece,engGece));
		System.out.println(batchOrt92Byk(list));
		System.out.println(ogrenci110danAzMi(list));
		System.out.println(herhangiBirBaharKontrol(list));
		System.out.println(ogrnSayiEnAzIkinciBatch(list));
		System.out.println(ogrnSayiEnAzIkinciBatch(list));
		System.out.println(ogrcSayiToplam(list));
		System.out.println(ogrcSayiToplam1(list));
		System.out.println(ogrnSayisi130BykBatchOrt(list));
		
		
		}
	
	// batch ort 92 den buyuk old kontrol eden pr create ediniz
	
	public static  boolean batchOrt92Byk(List<TechPro> list) {
		
	return 	list.stream().allMatch(t->t.getBatchOrt()>92);
		
		
	}
	//ogrenci sayilarinin hicbirinin 110 dan az olmadigini kontrol eden bir program create edini
	
	public static boolean ogrenci110danAzMi(List<TechPro> list) {
		
	return list.stream().anyMatch(t->t.getOgrnSayi()<110);	
		
	}
	
	// batchlerde bahar olup olmadigini 
	
	public static boolean herhangiBirBaharKontrol(List<TechPro> list) {
		return list.stream().anyMatch(t->t.getBatch().equals("bahar"));
	}
	// batch lleri ogrenci sayilarina gore siralayiniz
	
	public static void ogrenciSayiSirala(List<TechPro> list) {
	
		//list.stream().sorted(Comparator.thenComparing(TechPro::getogrnSayi)));
		// collect collektor.tolist collect e toplanan elemanlari liste ceviri
		
		
		// batch leri batc ortalamsina gore buyukten kucuge gore siralayip ilk 3 u yazdiriniy
	}
	
	public static void batchOrtTersSira(List<TechPro> list) {
		
	list.stream().sorted(Comparator.comparing(TechPro::getBatchOrt).reversed()).limit(3).collect(Collectors.toList());	
		
		
	}
	
	// ogr sayisi en az olan 2.batchi yazdirin
	
	public static List ogrnSayiEnAzIkinciBatch(List<TechPro> list){
		return list.stream().sorted(Comparator.comparing(TechPro::getOgrnSayi)).limit(2).skip(1).collect(Collectors.toList());	
	
	}
	
	// batch ortalamalari 95 den buyuk olan batchlerin ogrenci sayilarinin toplamini bulunuz
	
	
	public static Optional<Integer>  ogrcSayiToplam(List<TechPro> list) {
		
		return list.stream().filter(t->t.getBatchOrt()>95).map(t->t.getOgrnSayi()).reduce(Integer::sum);
		
	}
	
public static int  ogrcSayiToplam1(List<TechPro> list) {
		
		return list.stream().filter(t->t.getBatchOrt()>95).mapToInt(t->t.getOgrnSayi()).sum();
		
	}
	
	//ogrc sayilari 130 dan buyuk olan batchlerin batch ort bulunuz
	
	public static OptionalDouble ogrnSayisi130BykBatchOrt(List<TechPro> list) {
	
		return list.stream().filter(t->t.getOgrnSayi()>130).mapToDouble(t->t.getBatchOrt()).average();
		
	}
	
	}