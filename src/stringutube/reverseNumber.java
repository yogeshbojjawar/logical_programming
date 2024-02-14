package stringutube;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class reverseNumber {

	public static void main(String[] args) {
		
		//int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num = sc.nextInt();
//1. using algorithm
int rev=0;                                  //123
while(num!=0) {
	rev=rev*10+num%10;
	num=num/10;
}
	System.out.println(rev);
//using stringbuffer class	
/*StringBuffer rev;
StringBuffer sb=new StringBuffer(String.valueOf(num));
StringBuffer tb= sb.reverse();
	
	*/
	
//3. using stringbuilder method
/*StringBuilder sb1= new StringBuilder();
sb1.append(num);
StringBuilder rev=sb1.reverse();*/
 int akda=rev;                                    // palindrome number is nothing but the reverse of original number is same or not.

System.out.println("reversed number:"+rev);
if (akda==rev) {
	System.out.println("number is palindrome");
}
else {
	System.out.println("  number is not palindrome");
}


	}

}
