package example.java.com;

	import java.util.HashMap;
	import java.util.Map;

	// Given a string. Find the first character that does not repeat.
	
	public class FirstChar {

		public static Character compare(String string) throws Exception {
			
			Map<Character, Integer> map = new HashMap<>();
			Character c= null ;	
			if(string.isEmpty()){
		       	  throw new Exception("String is empty");  
		    }
			 
			for (int i = 0; i < string.length() ; i++) {
				if(!map.containsKey(string.charAt(i))) {
					map.put(string.charAt(i), 1 );
					System.out.println("map"+ map);
				}
				else {
					map.put(string.charAt(i), map.get(string.charAt(i))+1) ;
					System.out.println("map"+ map);
				}
			}	
			
			if ( !map.containsValue(1)){
		       	  throw new Exception("There is no char that does not repeat itself");
	        }
			for (int i = 0; i < string.length() ; i++) {
	            c = string.charAt(i);
	            if (map.getOrDefault(c, null) == 1) {
	            	System.out.println("The first char that doesn't repeat is  "+ c);
	            	return c;
	            }
	        }
			return c;
	}
		
		public static void main(String[] args) {
			String string= "tartak";
			try {
				compare(string);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		 // time complexity O(n)

	}
