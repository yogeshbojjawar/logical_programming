package xtrastuff;

public class Nth_primeNumber {
	public static void main(String[]args) {
	  int n = 5; // Change this to the desired value of n
      int nthPrime = findNthPrime(n);
      System.out.println("The " + n + "th prime numbers is: " + nthPrime);
  }

  private static int findNthPrime(int n) {
	  int counter = 0;
	    int j;
boolean op=false;
	    for ( j = 1; counter <=n; j++) {
            if (isPrime(j)) { // Check if the current number is prime
                counter++; // Increment the count for each prime number encountered
                if (counter == n) {
                	op=true;
                   // System.out.println("The " + n + "th prime number is: " + j);
                }
                }
            }
		return j-1;
  }

  private static boolean isPrime(int num) {
	  int count=0;
	  if(num>1) { 
			for (int i=1; i<=num; i++) {
				if (num%i==0) {
					count++;
					}
			}		
			if (count== 2) {
				return true;
			}
			else {
				return false;
			}
		}
	return true;
}
}