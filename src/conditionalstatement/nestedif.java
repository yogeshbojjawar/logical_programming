/// multiple ifelse conditional statements
//nested if...else

package conditionalstatement;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=30;
		                              //if one condition not satisfied then go for the second condition 
		                                //by using nested ifconditional statement
				if (day==1) 
				{
		System.out.println("Sunday");

	}
				else if (day==2){
				System.out.println("monday");
				}
				else if (day==3){
					System.out.println("tueday");
					}
				else if (day==3){
					System.out.println("wensday");
					}
				else if (day==4){
					System.out.println("thursday");
					}
				else if (day==5){
					System.out.println("friday");
					}
				else if (day==6){
					System.out.println("saturday");
					}
				else if (day==29) {
					System.out.println("feb month");
				}

				else {
					System.out.println("holiday");
					}
				
}
}
