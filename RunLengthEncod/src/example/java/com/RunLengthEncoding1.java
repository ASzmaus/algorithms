package example.java.com;
//Have the function take the str parameter being passed and return a compressed version of the string using the Run_length encoding algorithm.
//This algorithm works by taking the occurrence of each repeating character and outputting that number along with a single character of the repeating sequence.

public class RunLengthEncoding1 {
	
	public static String encoding(String str) {
		
		 String currentString = "";
		 int numberOfRepetitions=0;
		 boolean repeating =false;

		 for ( int i=0; i<str.length()-1; i++) {
			 char currentElement=str.charAt(i);
			 char nextElement = str.charAt(i+1);
				 if(currentElement==nextElement) {
					 numberOfRepetitions ++;
					 if (repeating  == false) {
						 repeating  = true;
					 }
				 }
				 else if (currentElement!=nextElement) { 
					 if (repeating ==true) {
						 numberOfRepetitions ++;
						 repeating =false;
					 }
					 else if(repeating==false) {
						 numberOfRepetitions=1;
					 }
					 currentString += numberOfRepetitions + str.substring(i, i+1);
					 numberOfRepetitions=0;
					 }
		 		}
			 if(str.charAt(str.length()-2)==str.charAt(str.length()-1)) {
				  	numberOfRepetitions++;
					currentString +=numberOfRepetitions+str.substring(str.length()-1);
			 }
			  if(str.charAt(str.length()-2)!=str.charAt(str.length()-1)) {
				  	numberOfRepetitions=1;
					currentString +=numberOfRepetitions+str.substring(str.length()-1);
			 }	  
		return currentString;
	}
	
	public static void main(String[] args) {
		String str = "wwwwgggopp";
	String result = encoding(str);
		System.out.println(result);
		
	}
}
