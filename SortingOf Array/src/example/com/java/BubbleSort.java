package example.com.java;

//Given is an array of numbers. Sort the array and return the result. Sorting implementations available in Java (Collections.sort, Arrays.sort) must not be used
public class BubbleSort {
	
	public static int[] sorting(int[] array) {
		
		for (int i =0; i< array.length; i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j]>array[j+1]) {
					int temp = 0;
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;			
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		int[] array= {300,200,111,102,101,100};
		sorting(array);
		}
// memory complexity 0(1)
// time complexity O(n^2)
}
