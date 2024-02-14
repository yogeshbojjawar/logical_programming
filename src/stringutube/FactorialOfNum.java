package stringutube;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=24;

if (n <= 0) {
    // Factors are not defined for non-positive numbers
    System.out.println("Factors are not defined for non-positive numbers.");
    return;
}

for (int i = 1; i <= n; i++) {
    // Check if i is a factor of n
    if (n % i == 0) {
        System.out.print(i + " ");
    }
}


int fact=1;  
int number=5;//It is the number to calculate factorial    
for(int i=1;i<=number;i++){    
    fact=fact*i;    
}    
System.out.println("Factorial of "+number+" is: "+fact);    
	}

}
