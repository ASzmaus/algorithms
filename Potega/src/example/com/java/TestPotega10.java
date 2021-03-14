package example.com.java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestPotega10 {

	@Test
	public void test1() {
	    Assert.assertTrue(Potega10.czyPotega(100000));
		}

	@Test
	public void test2() {
	    Assert.assertFalse(Potega10.czyPotega(100400));
		}

	@Test
	public void test3() {
	    Assert.assertFalse(Potega10.czyPotega(200400));
		}

}
