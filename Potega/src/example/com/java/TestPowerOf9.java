package example.com.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestPotega9 {

	
	@Test
	public void test1() {
	    Assert.assertFalse(Potega9.czyPotega9(100000,9));
		}

	@Test
	public void test2() {
	    Assert.assertTrue(Potega9.czyPotega9(387420489,9));
		}

	@Test
	public void test3() {
	    Assert.assertTrue(Potega9.czyPotega9(9,9));
		}

}