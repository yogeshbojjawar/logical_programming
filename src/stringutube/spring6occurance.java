
package stringutube;

public  class spring6occurance {
	 
	public static int data(String naam,char value) {
	int count=0;
	 
	 for (int i=0;i<naam.length();i++) {
		 if(naam.charAt(i)==value) {
			 count++;
		 }
	 }
	 
		 return count;
	 }

	public static void main(String[] args) {
		
		System.out.println(data("harry and hardy",'h'));
		
		
String dm="harry and hardy";
 int count=0;
                                                      // we can calculate number of char in word by both concepts above and below of main method     
		 for (int i=0;i<dm.length();i++) {
			 if(dm.charAt(i)=='r') {
				 count++;
			 }       
		 }
		 System.out.println(count);
		 
	}

}
