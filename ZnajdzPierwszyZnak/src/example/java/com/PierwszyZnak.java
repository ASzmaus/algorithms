package example.java.com;

	import java.util.HashMap;
	import java.util.Map;


	public class PierwszyZnak {

		public static Character porownaj(String string) throws Exception {
			
			Map<Character, Integer> mapa = new HashMap<>();
			Character c= null ;	
			if(string.isEmpty()){
		       	  throw new Exception("String jest pusty");  
		    }
			 
			for (int i = 0; i < string.length() ; i++) {
				if(!mapa.containsKey(string.charAt(i))) {
					mapa.put(string.charAt(i), 1 );
					System.out.println("mapa"+ mapa);
				}else {
					mapa.put(string.charAt(i), mapa.get(string.charAt(i))+1) ;
					System.out.println("mapa"+ mapa);
				}
			}	
			
			if ( !mapa.containsValue(1)){
		       	  throw new Exception("Nie ma znaku który sie nie powtarza");
	        }
			for (int i = 0; i < string.length() ; i++) {
	            c = string.charAt(i);
	            if (mapa.getOrDefault(c, null) == 1) {
	            	System.out.println("Pierwszy znak który sie nie powtarza to "+ c);
	            	return c;
	            }
	        }
			return c;
	}
				

		//Dany jest ciąg znaków. Znaleźć pierwszy znak, który się nie powtarza.
		public static void main(String[] args) {
			String dane= "tartak";
			try {
				porownaj(dane);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		 //zlożonośc obliczeniowa liniowa
		
	}
