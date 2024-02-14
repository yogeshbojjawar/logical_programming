package stringutube;

public class swapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="hello";
String b="world";


//System.out.println("after swapping value of a is " +b);
//System.out.println("after swapping value of b is " +a);

//1. using append a and b

a=a+b;   //helloworld

b=a.substring(0, a.length()-b.length());               //store initial string a in string b

a=a.substring(b.length());                             //store inkitial string b in string a 

System.out.println("after swapping is "+a+" "+b);




    String originalString = "reverse this sentence";
    String reversedString = reverseWithoutChangingPosition(originalString);
    System.out.println("Original String: " + originalString);
    System.out.println("Reversed String: " + reversedString);
}

private static String reverseWithoutChangingPosition(String input) {
    String[] words = input.split(" ");
    String reversedString = "";

    
    for (int i = 0; i<=words.length-1; i++) {
    	for(int k=words[i].length()-1; k>=0;k--) {
    		
    		reversedString=reversedString+words[i].charAt(k);

    	}
    	reversedString=reversedString+" ";
    }

    // Remove the trailing space
    System.out.println(reversedString);
    return reversedString;
}




	}



