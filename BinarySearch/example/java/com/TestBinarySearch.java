	package example.java.com;

	import static org.junit.Assert.*;

	import org.junit.Test;

	import junit.framework.Assert;

	public class TestBinarySearch {

	@ Test
	public void test1(){
		int[] array = {1,2,3,4,5,6,10,20,30};
		int number=30;
		Assert.assertTrue(BinarySearch.check(array, number));
	}
	
	@Test
	public void test2() {
		int[] array= {1,2,3,4,5,6,10,20,30};
		int number=1;
		Assert.assertTrue(BinarySearch.check(array, number));
	}
	
	@ Test
	public void test3() {
		int[] array = {1,2,3,4,5,6,10,20,30};
		int number=7;
		Assert.assertFalse(BinarySearch.check(array, number));
	}
	
	}
