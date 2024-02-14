// to reduce the code and make your programm execution faster we need to use switch case instead of ifelse 


package conditionalstatement;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=21;
		switch (day)
		{
		case 1 : System.out.println("sunday"); break;
		case 2 : System.out.println("monday"); break;
		case 3: System.out.println("tuesday"); break;
		case 4 : System.out.println("wensday"); break;
		case 5 : System.out.println("thursday"); break;
		case 6 : System.out.println("friday"); break;
		case 21 : System.out.println("feb month");break;
		default : System.out.println("holiday");

	 	}

	}
	

}
