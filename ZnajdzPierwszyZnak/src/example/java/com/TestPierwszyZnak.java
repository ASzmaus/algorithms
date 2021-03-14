	package example.java.com;

	import static org.junit.Assert.*;

	import org.junit.Test;

	import junit.framework.Assert;

	public class TestPierwszyZnak {

		@Test
		public void test1() throws Exception {
		    try {
		    	PierwszyZnak.porownaj("");
		    } catch(Exception e) {
		        System.out.println("Pusty ciag znakow");
		        assertTrue(e.getMessage().contains(""));
		    }
		}
		
		@Test
		public void test2() throws Exception {
			try {
				PierwszyZnak.porownaj("mama");
			} catch (Exception e) {
				System.out.println("Nie ma znaku ktory sie nie powtarza");
				assertTrue(e.getMessage().contains("Nie ma znaku"));
			}
		}
		
		@Test
		public void test3() throws Exception {
			 Assert.assertSame('r', PierwszyZnak.porownaj("tartak"));
		}
	}
