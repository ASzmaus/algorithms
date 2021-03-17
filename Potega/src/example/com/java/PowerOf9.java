package example.com.java;

//jakbyś to zrobiła, gdyby trzeba sprawdzić, czy x jest potęgą np. 9 ?
//Sprawdzić, czy liczba jest potęgą liczby 9?


public class Potega9 {

	
	public static boolean czyPotega9( int liczba, int podstawaPotegi){
		
		int n=0;
		int potega=1;
		while(liczba>=potega) {
			potega *=  podstawaPotegi;
			n ++;
			if (liczba== potega) {
				System.out.println("Liczbe "+ liczba + "  jest potega " + podstawaPotegi);
				return true;
			}
		} 
		System.out.println("Liczbe "+ liczba + " nie  jest potega " + podstawaPotegi);
		return false;
	}
	
	
	public static void main(String[] args) {
		
		 boolean result = czyPotega9(387420489,9);
		 System.out.println(result);
    }

}
