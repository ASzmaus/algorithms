package example.com.java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestBubbleSort {

	@Test
	void test1() {
		int[] expectedArray = {1,2,3,4};
		int[] actualArray = {4,3,2,1};
		Assert.assertArrayEquals(expectedArray, BubbleSort.sorting(actualArray));
	}

	@Test
	void test2(){
		int[] expectedArray= { 1,3,6,20,20,200};
		int[] actualArray= {3,200,20,1,6,20};
		Assert.assertArrayEquals(expectedArray,  BubbleSort.sorting(actualArray));
	}
}
