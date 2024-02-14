package stringutube;

public class removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="$#%*&&@ Yogeshbojjawar @765@123";
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		//s1=s1.replaceAll("[^a-zA-Z0-9]", "k");                //****it replace junk words by word k
System.out.println(s1);
	}

}
