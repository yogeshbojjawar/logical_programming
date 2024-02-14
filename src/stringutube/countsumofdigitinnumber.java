package stringutube;

public class countsumofdigitinnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1234;
int sum=0;
while(num>0) {
	sum=sum+num%10;
	num=num/10;
	System.out.println("step by step sum of digit in number "+sum);   //not necessary pn ith syso ghetlyane khup farak padla
}

System.out.println("sum of digit in number "+sum);
	
 }

}
