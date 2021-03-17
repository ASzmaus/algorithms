package example.com.java;

//Check that the number is a power of 9?

public class PowerOf9{

	
	public static boolean ifPower( int number, int baseOfPower){
		
		int n=0;
		int power=1;
		while(number>=power) {
			power *=  baseOfPower;
			n ++;
			if (number== power) {
				System.out.println("Number "+ number + "  is power " + baseOfPower);
				return true;
			}
		} 
		System.out.println("Number "+ number + " is not power " + baseOfPower);
		return false;
	}
	
	
	public static void main(String[] args) {
		
		 boolean result = ifPower(387420489,9);
		 System.out.println(result);
    }

}
