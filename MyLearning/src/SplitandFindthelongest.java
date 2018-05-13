import java.util.*;

public class SplitandFindthelongest {
		  public static String LongestWord(String sen) { 
		  
			  String longest = "";
		        
		        for (String s : sen.split("[^a-zA-Z]"))
		            if (s.length() > longest.length())
		                longest = s;
		        
		        return longest;
		    
}
		  
		  public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner s = new Scanner(System.in);
	        String sc= s.nextLine();   
		    System.out.print(LongestWord(sc)); 
		    SplitandFindthelongest.LongestWord(sc);
		    
		  }   
		  
		
    }