package example.com.java;

//Dana jest liczba typu int. Sprawdzić, czy liczba jest potęgą liczby 10.

public class Potega10 {

String string;
	
	public static boolean czyPotega( int liczba) {
		String string = Integer.toString(liczba);
		if(string.charAt(0)=='1') {
			System.out.println("Sprawdzamy pierwszy znak w stringu");
			for( int i=1; i< string.length(); i++) {
				if  (string.charAt(i)=='0') {
					System.out.println("Sprawdzamy kolejne znaki w stringu o indeksie i =  " + i);
				}else {
					System.out.println("Liczba nie może by potga lizcby 10");
					return false;
				}
			} 
			System.out.println("Liczba jest potga lizcby 10");
			return true;
		
		} else {
			System.out.println("Liczba  nie może by potga lizcby 10");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean result = czyPotega(100000);
	}

	//złozoniosc obliczeniowa stała
	//złozonosc pamieciowa  stała

}
