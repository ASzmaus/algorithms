package example.com.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestPowerOf9 {

	
	@Test
	public void test1() {
	    Assert.assertFalse(PowerOf9.ifPower(100000,9));
		}

	@Test
	public void test2() {
	    Assert.assertTrue(PowerOf9.ifPower(387420489,9));
		}

	@Test
	public void test3() {
	    Assert.assertTrue(PowerOf9.ifPower(9,9));
		}

}