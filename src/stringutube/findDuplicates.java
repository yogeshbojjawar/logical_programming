package stringutube;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class findDuplicates {
	
	public static void main(String[] args) {
	String a = "aaabcbcd";
	
	Set<Character> unique = new HashSet<Character>();
	Set<Character> duplicate = new HashSet<Character>();

	for (int i = a.length() - 1; i >= 0; i--) {
	    if (!unique.add(a.charAt(i))) {
	        duplicate.add(a.charAt(i));
	    }
	}
	System.out.println("Duplicate characters: " + duplicate);
	
	int minOccurrence = Integer.MAX_VALUE;
    int maxOccurrence = Integer.MIN_VALUE;
    char minChar = '\0';
    char maxChar = '\0';
	
	//List<Character> l = new ArrayList(unique);
      for(Character m:unique) {
		    int count = 0;

    	  for(int k=a.length()-1;k>=0;k--){
    		  if(m==(a.charAt(k))) {
    			  count++;
    		  }
    	  }
          System.out.println("occurance of the element " + m + " in nums: " + count);
          
        
              if (count < minOccurrence) {
              minOccurrence = count;
              minChar = m;
          }

          if (count > maxOccurrence) {
              maxOccurrence = count;
              maxChar = m;
          }   
          
      }
      System.out.println("Minimum occurring character: " + minChar + " (occurs " + minOccurrence + " times)");
     System.out.println("Maximum occurring character: " + maxChar + " (occurs " + maxOccurrence + " times)");
	
	
	/////////////////////////////////////////////////////
	
	int[] nums = {1, 2, 3, 4, 3, 2, 7, 8, 1,1};
	Set<Integer> uniqueNums = new HashSet<Integer>();
	Set<Integer> duplicates = new HashSet<Integer>();

	for (int numb : nums) {
	    if (!uniqueNums.add(numb)) {
	        duplicates.add(numb);
	    }
	}

	System.out.println("duplicate values are :"+duplicates);
	
	 List<Integer> list = new ArrayList(uniqueNums);

     for (Integer j : list) {
         int countS = 0;
         for (int i : nums) {
             if (j.equals(i)) {
                 countS++;
                 
             }
         }
         System.out.println("occurance of the element " + j + " in nums: " + countS);
     }
	}	
}
