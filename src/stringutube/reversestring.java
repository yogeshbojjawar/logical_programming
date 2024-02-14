package stringutube;

public class reversestring {

	public static void main(String[] args) {
		// TODO Aut
		        String str="AKKA";
		        
		 String name2="";

		/////////////////////////
		//1. reverse string using concatenation operator

		/*int z=str.length();                        //length is 7    // this have to be write during this process

		for (int i=z-1;i>=0;i--)                     //6   5  4...3......0
		{
			name2=name2+str.charAt(i);               //GFEDCBA
		}
		System.out.println(name2);*/


		/////////////
		//2. REVERSE STRING USING CHARACTER ARRAY

		char a[]= str.toCharArray();
		System.out.println(a.length);               // for measuring length of char we don not need ()
		int z= a.length;
		 
		for (int i=z-1;i>=0;i--)  
		{
			name2=name2+a[i];
		}
		System.out.println(name2);
		
		
		
	String d=str;
	if(str.equals(name2)) {
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}

		///////////////
		//3. using string buffer
		StringBuffer tb=new StringBuffer(str);
		System.out.println(tb.reverse());
		


	}

}
