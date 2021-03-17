package example.java.com;
//It is given an array of numbers. Check if the array is sorted.
public class IfSorted {
	public static boolean ifSorted(int[] array) {		
				 for ( int i=1; i<array.length-2;i++) {
				 if(array[0]<array[1]) {
					 System.out.println("We are checking next elements");
						 if(array[i]<=array[i+1]) {
							 System.out.println("We are checking next elements");
						 }
						 else {
							 System.out.println("Array is not sorted");
							 return false;
					    } 
				 }
				 else if(array[0]>array[1]) {
					 System.out.println("We are checking next elements");
						 if(array[i]>=array[i+1]) {
							 System.out.println("We are checking next elements");
						 }
						 else{
							 System.out.println("Array is not sorted");
							 return false;
					     }
				 }
				 else if(array[0]==array[1]) {
						if ((array[i]>array[i+1]) && (array[i+1]>array[i+2])){
							 System.out.println("We are checking next elements");
						}
						else if ((array[i]<array[i+1]) && (array[i+1]<array[i+2])){
							 System.out.println("We are checking next elements");
						}
						else if(array[i]==array[i+1]){
							 System.out.println("We are checking next elements");
						}
						else {
							System.out.println("Array is not sorted");
			    			 return false;
						} 
				 }
			}
		System.out.println("Array is sorted");
		return true;
	}
	public static void main(String [] args) {
		int[]array = {10,10,10,10,1};
		ifSorted(array);
	}
	//złożonosc pamieciowa O(1)
	//złożonoś obliczeniowa O( n )
}

