package stringutube;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findDupliword {

	public static void main(String[] args) {
		
		        String inputString = "This is a sample string with some duplicate words. This is a sample.";

		        // Split the input string into words
		        String[] words = inputString.split(" ");

		        // Use a HashSet to store unique words and identify duplicates
		        HashSet<String> uniqueWords = new HashSet<>();
		        HashSet<String> duplicateWords = new HashSet<>();

		        for (String word : words) {
		            if (!uniqueWords.add(word)) {
		                duplicateWords.add(word);
		            }
		        }

		        // Print duplicate words
		        System.out.println("Duplicate words: " + duplicateWords);
		        
		        List <String> l=new ArrayList(uniqueWords);
		        
		        int maxrepeated=0;
		        String repeatword="";
		        
		        for(String b:l) { 
			        int count=0;
			         
			        for(String j:words){
			        	if(b.equalsIgnoreCase(j)) {
			        		count++;
			        	}
			         }	
			        System.out.println(b  +" "+count);
			        
			        if(count>maxrepeated) {
			            maxrepeated=count;
			            repeatword=b;
			        }
		        }
		        System.out.println("max occurance of word is "+ repeatword +" and its count is "+ maxrepeated);
    
		    }

	}


