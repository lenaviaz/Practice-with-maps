import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Lena Viazmitinov 8/7/20
 * sentences.java
 */

public class sentences {
	
	private String sentence;
	private int length;
	
	    public sentences(String sentence, int length) {
		this.sentence = sentence;
		this.length = length;	
	}

	/**method that takes a string and turns it into an array then prints out the array
	 * makes an empty string and fills it with the char, takes out empty spaces
	 **/
	    
	public char[] makesentenceanarray(String sentence, int length) {
		char[] ch = new char[sentence.length()];
		StringBuilder s = new StringBuilder();
		char prevchar = ' ';
		for (int i = 0; i < sentence.length(); i++) {
	     	ch[i] = sentence.charAt(i);
		}     
	     for(int j = 0; j < sentence.length(); j++) {
	    	 char currentchar = ch[j];
	    	 
	    	 if( !(prevchar == ' ' && currentchar == prevchar)) {
	    		 s.append(prevchar);
	    	 }
	    	 prevchar = currentchar;
	     }
	     s.deleteCharAt(0);
	     s.append(ch[sentence.length() -1]);
		
		System.out.print(s);
		System.out.print("\n");
		return ch;		

		}
	
	/** method that prints the frequency of every word, the most frequent word and the least frequent word
	 * uses hashmaps
	 */ 
	
	public void frequency(String sentence, int length) {
		char[] ch2 = new char[sentence.length()];
		StringBuilder s2 = new StringBuilder();
		char prevchar = ' ';
		for (int i = 0; i < sentence.length(); i++) {
	     	ch2[i] = sentence.charAt(i);
		}     
	     for(int j = 0; j < sentence.length(); j++) {
	    	 char currentchar = ch2[j];
	    	 
	    	 if( !(prevchar == ' ' && currentchar == prevchar)) {
	    		 s2.append(prevchar);		
	    	 }
	    	 prevchar = currentchar;
	     }

	     s2.deleteCharAt(0);
	     s2.append(ch2[sentence.length() -1]);
	     
        String phrase = new String(s2.toString());	     
		String [] StringArray = phrase.split(" ");
		
		 HashMap<String, Integer> myWordsCount = new HashMap<String, Integer>();
		    for (String s : StringArray){
		        if (myWordsCount.containsKey(s)) myWordsCount.replace(s, myWordsCount.get(s) + 1);
		        else myWordsCount.put(s, 1);
		    }
		    
		   // at some point try to figure out how to make the spacing even 
		    System.out.println("word:      frequency\n");
		    for (Map.Entry<String, Integer> e : myWordsCount.entrySet()) 
	            System.out.println(e.getKey() + "       " + e.getValue()); 
		    

	        // Create set to iterate over HashMap 
	        Set<Map.Entry<String, Integer> > set = myWordsCount.entrySet(); 
	        String key = ""; 
	        int value = 0; 
	  
	        for (Map.Entry<String, Integer> me : set) { 
	            // Check for word having highest frequency 
	            if (me.getValue() > value) { 
	                value = me.getValue(); 
	                key = me.getKey(); 
	            } 
	          } 
	  
	       System.out.println("the word with the highest frequency is: " + key);

	        for (Map.Entry<String, Integer> me : set) { 
	            // Check for word having highest frequency 
	            if (me.getValue() < value) { 
	                value = me.getValue(); 
	                key = me.getKey(); 
	                   } 
	            } 	  
	       System.out.println("the word with the lowest frequency is: " + key);   
		               
		         }
       } 

			
	     	 
		 
		
	
			
		
		
		
	
	
	


