/**
 * 
 */
package example.java.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author aga
 *
 */
class TestRunLengthEncod1 {

	@Test
	void test1() {
	String str = "wwwwgggoppp";
	Assert.assertEquals("4w3g1o3p",RunLengthEncoding1.encoding(str));
	}

	@Test
	void test2() {
	String str = "aabbcde";
	Assert.assertEquals("2a2b1c1d1e",RunLengthEncoding1.encoding(str));
	}
	
	@Test
	void test3() {
	String str = "wwwbbbw";
	Assert.assertEquals("3w3b1w",RunLengthEncoding1.encoding(str));
	}
}
