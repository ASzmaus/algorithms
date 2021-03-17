	package example.java.com;

	import static org.junit.Assert.*;

	import org.junit.Test;

	import junit.framework.Assert;

	public class TestFirstChar {

		@Test
		public void test1() throws Exception {
		    try {
		    	FirstChar.compare("");
		    } catch(Exception e) {
		        System.out.println("String is empty");
		        assertTrue(e.getMessage().contains(""));
		    }
		}
		
		@Test
		public void test2() throws Exception {
			try {
				FirstChar.compare("mama");
			} catch (Exception e) {
				System.out.println("There is no char that does not repeat");
				assertTrue(e.getMessage().contains("There is no char"));
			}
		}
		
		@Test
		public void test3() throws Exception {
			 Assert.assertSame('r', FirstChar.compare("tartak"));
		}
	}
