package stringutube;

public class countnumberofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123456;
int count=0;
while(num>0) {
	num=num/10;
	count++;
	System.out.println("no. of digits"+ count);   //*****  use this to check how step by step procedure works
}
System.out.println("no. of digits"+ count);
	}

}
