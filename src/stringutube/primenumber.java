package stringutube;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
findprime(97);


	}
	

static int findprime(int num) {
	int count=0;
if(num>1) { 
	for (int i=1; i<=num; i++) {
		if (num%i==0) {
			count++;
			}
	}
	
	
	if (count== 2) {
		System.out.println(num+" " +"is prime number");
	}
	else {
		System.out.println("not a prime");
	}

}
return num;
	}
	}
	
	

