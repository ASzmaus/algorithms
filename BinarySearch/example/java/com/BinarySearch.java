package example.java.com;

//Given a sorted array of numbers and some number x. Check if x is in the array.

	public class BinarySearch {

	public static boolean check(int[] sortedArray, int number) {
		 	 
		 int lowIndex=0;
		 int highIndex=sortedArray.length-1;
		 
		 while(lowIndex<=highIndex) {
			 int  searchIndex=lowIndex + (highIndex-lowIndex)/2;
			 if (number<sortedArray[searchIndex]) {
				 highIndex=searchIndex-1;
			 }else if (number>sortedArray[searchIndex]){
				 	lowIndex=searchIndex+1;

			 }else {
				 System.out.println("There is a number= " + number + " in array");
				 return true;
			 }
		 }
		 System.out.println("There is no number= " + number + " in array");
		return false;
	}
		
	public static void main( String[] args) {
		int[] array= {1,2,3,4,5,6,10,20,30};
		System.out.println(check(array,6));
	}
		// memory complexity O(1)
		// time complexity 0(log(n))
	}
