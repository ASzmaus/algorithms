package example.com.java;

import org.junit.Assert;
import org.junit.Test;

public class TestPowerOf10 {

	@Test
	public void test1() {
	    Assert.assertTrue(PowerOf10.ifPower(100000));
		}

	@Test
	public void test2() {
	    Assert.assertFalse(PowerOf10.ifPower(100400));
		}

	@Test
	public void test3() {
	    Assert.assertFalse(PowerOf10.ifPower(200400));
		}

}
