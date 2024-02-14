package stringutube;

public class Fibonacciseries {

	public static void main(String[] args) {
		// a series of numbers in which each number(fibonacci number)is sum of the two precedding number
		//eg. 0 1 1 2 3 5 8 13
		
		int n1=0, n2=1, sum;
		System.out.println(n1+" "+n2);
		
		for(int i=0;i<=10;i++) {	
			sum=n1+n2;         //0+1
			System.out.println(" "+sum); //1 2 3 5
			n1=n2;  
			n2=sum;  

		}

	}

}
