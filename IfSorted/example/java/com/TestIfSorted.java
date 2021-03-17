package example.java.com;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestIfSorted {

	@Test
	public void test1() {
		int[]array = {10,10,10,10,1};
		Assert.assertTrue(IfSorted.ifSorted(array));
	}
	
	@Test
	public void test2() {
		int[] array = {1,1,7,8,10};
		Assert.assertTrue(IfSorted.ifSorted(array));
	}
	
	@Test
	public void test3() {
		int[] array = {10,8,5,8,1};
		Assert.assertFalse(IfSorted.ifSorted(array));
	}
	
	@Test
	public void test4() {
		int[] array ={8,8,7,4,8,10};
		Assert.assertFalse(IfSorted.ifSorted(array));
	}
	
	@Test
	public void test5() {
		int[] array ={7,7,7,7,8,8,8,6,6,6,6,10};
		Assert.assertFalse(IfSorted.ifSorted(array));
	}
	
	@Test
	public void test6() {
		int[] array ={6,6,6,6,6,6,6,10,7,7,7,7,8,8,8};
		Assert.assertFalse(IfSorted.ifSorted(array));
	}
}
