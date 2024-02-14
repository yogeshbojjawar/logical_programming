package stringutube;

public class primenumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k = 1; k <= 20; k++) {
            int count = 0; // Reset count for each k

            for (int m = 1; m <= k; m++) {
                if (k % m == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(k);

                int arry[]= {k};
                for(int q:arry) {
        			System.out.print(" "+q);
        		}
            }
        }
		
		

	}

}
