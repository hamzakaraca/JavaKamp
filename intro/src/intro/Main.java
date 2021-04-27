package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu ="Ýnternet Þubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade=36;
		boolean dustuMu=false;
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if(dolarBugun>dolarDun){
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar deðiþmedi resmi");
		}
		
		String[] krediler= {"Hýzlý Kredi","Mutlu emekli Kredisi","Konut Kredisi","Çiftçi Kredisi","Msb  Kredisi","Meb Kredisi"};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
