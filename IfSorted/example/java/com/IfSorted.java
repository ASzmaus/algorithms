package example.java.com;
//It is given an array of numbers. Check if the array is sorted.
public class IfSorted {
	public static boolean ifSorted(int[] array) {		
		 boolean ifIncrease = false;
		 for ( int i=0; i<array.length-1;i++) {
			 if(array[i]<=array[i+1]) {
				 System.out.println("We are checking next elements");
			 }
			 else {
				ifIncrease = false;
				break;
			}
			ifIncrease = true;
		 } 
		
		if(ifIncrease == false) {
			for ( int j=0; j<array.length-1;j++) {
				if(array[j]>=array[j+1]) {
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
		int[]array = {10,8,5,8,1};
		ifSorted(array);
	}
	//złożonosc pamieciowa O(1)
	//złożonoś obliczeniowa O( n )
}

