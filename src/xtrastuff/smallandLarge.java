package xtrastuff;

public class smallandLarge {
	public static void main(String[]args) {
	 String inputString = "This is a sample string with some words. This is a sample.";

     // Split the input string into words
     String[] words = inputString.split("\\s+");

     // Initialize variables to track largest and smallest words
     String smallestWord = null;
     String largestWord = null;

     // Iterate through the words
     for (String word : words) {
         // Check for the smallest word
         if (smallestWord == null || word.length() < smallestWord.length()) {
             smallestWord = word;
         }

         // Check for the largest word
         if (largestWord == null || word.length() > largestWord.length()) {
             largestWord = word;
         }
     }

     // Print the smallest and largest words
     System.out.println("Smallest word: " + smallestWord);
     System.out.println("Largest word: " + largestWord);
 }

}
