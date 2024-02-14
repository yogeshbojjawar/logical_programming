package stringutube;

public class Starpattern {

	public static void main(String[] args) {
		       
		        
//run this programme        
		  for (int c=1;c<=5; c++) {
		        	for (int d=1; d<=c;d++)
		        	{
		        		System.out.print("*");	
		        	}
		        	 System.out.println("");  	       
	}
		 	 
	////////////////////////////	
		
		  for (int a=1; a<=5; a++)  {
			for (int b=5; b>=a; b--)
			{System.out.print("+");}
			System.out.println();
	                              	}
		  
			 
		  for (int a=1; a<=5; a++)  {
				for (int b=5; b>=a; b--)
				{System.out.print(b);}
				System.out.println();
		                              	}  
		
			  
		
		
		  for (int a=1; a<=5; a++)  {
				for (int b=5; b>=a; b--)
				{System.out.print(" ");}
				for(int l=1;l<=a;l++) {
				System.out.print("+");
				}
				  System.out.println();
}
		  
		  for (int a=1; a<=5; a++)  {
				for (int b=1; b<=a; b++)
				{System.out.print(" ");}
				for(int l=5;l>=a;l--) {
				System.out.print("+ ");
				}
				  System.out.println("");
}	  
		  
}	  
	}
	


