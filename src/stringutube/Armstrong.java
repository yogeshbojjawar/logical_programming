package stringutube;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=153;
int r;
int t=num;
int cube=0;
while(num>0) {
	r=num%10;
	num=num/10;
	cube=(r*r*r)+cube;
		
}

if(t==cube) {
	System.out.println("armstrong number");     //153
}
else {
	System.out.println("not armstrong number");
}
		
		
		
		
		
	 }

}
