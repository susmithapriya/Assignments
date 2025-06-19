/**
 * 
 */
package javaassignments;

/**
 * 
 */
public class pyramidnumbers {

	/**
	 * 
	 */
	public pyramidnumbers() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int n = 5; // Maximum number for the pyramid

		        // Upper half of the pyramid
		        for (int i = 1; i <= n; i++) {
		            // Print leading spaces
		            for (int j = i; j < n; j++) {
		               System.out.print(" ");
		            }
		            // Print numbers in ascending order
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j + " ");
		            }
		            System.out.println();
		        }

		        // Lower half of the pyramid
		        for (int i = n - 1; i >= 1; i--) {
		            // Print leading spaces
		            for (int j = n; j > i; j--) {
		                System.out.print(" ");
		            }
		            // Print numbers in ascending order
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j + " ");
		            }
		            System.out.println();
		        }
		    }
		
	}


