package xtrastuff;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class arrayToSet {
	public static void main(String[]args) {
	  // Initialize array
    Integer[] array = {1, 2, 3,4,3, 2, 4}; // Duplicate element 2
    
    // Convert array to list
    List<Integer> list = Arrays.asList(array);

    // Display elements of the list
    System.out.println("Elements of the list: " + list);

    // Convert array to set using HashSet constructor
    Set<Integer> set = new HashSet(Arrays.asList(array));

    // Display elements of the set
    System.out.println("Elements of the set: " + set);
    
    // Convert list to set using HashSet constructor
    Set<Integer> set2 = new HashSet(list);

    // Display elements of the set
    System.out.println("Elements of the set: " + set);
    
	}

}
