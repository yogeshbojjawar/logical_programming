package stringutube;

public class swapinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=5;
int y=1;
//1. arithmatic operator
x=x+y;
y=x-y;
x=x-y;

//2. using xor operator
/*x=x^y;
y=x^y;
x=x^y;*/

//3. using third variable
/*int t=x;
x=y;
y=t;*/

//4. use * and / without third variable
/*x=x*y;
y=x/y;
x=x/y;*/


//5. single statemet              it execute reversly
//          y=x+y-(x=y);
 System.out.println("after swapping values are:"+" " +x+" and "+y);
	}

}
