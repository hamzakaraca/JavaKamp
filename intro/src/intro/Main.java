package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu ="�nternet �ubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade=36;
		boolean dustuMu=false;
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}else if(dolarBugun>dolarDun){
			System.out.println("Dolar y�kseldi resmi");
		}
		else {
			System.out.println("Dolar de�i�medi resmi");
		}
		
		String[] krediler= {"H�zl� Kredi","Mutlu emekli Kredisi","Konut Kredisi","�ift�i Kredisi","Msb  Kredisi","Meb Kredisi"};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
