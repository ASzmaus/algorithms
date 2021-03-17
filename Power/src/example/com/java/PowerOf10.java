package example.com.java;

//Given is an number. Check that the number is a power of 10.

public class PowerOf10 {

String string;
	
	public static boolean ifPower( int number) {
		String string = Integer.toString(number);
		if(string.charAt(0)=='1') {
			System.out.println("We check the first character in the string");
			for( int i=1; i< string.length(); i++) {
				if  (string.charAt(i)=='0') {
					System.out.println("We check the next characters in the string with index i =  " + i);
				}else {
					System.out.println("The number can not be a power of 10");
					return false;
				}
			} 
			System.out.println("The number is the power of 10");
			return true;
		
		} else {
			System.out.println("The number can not be a power of 10");
			return false;
		}
	}

	public static void main(String[] args) {
        boolean result = ifPower(100000);
	}

	//time complexity constant
	//memory complexity  constant

}
