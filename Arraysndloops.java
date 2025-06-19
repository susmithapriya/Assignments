/**
 * 
 */
package javaassignments;

/**
 * 
 */
public class Arraysndloops {

	/**
	 * 
	 */
	public Arraysndloops() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sortarray[]= {12,34,11,36,87,98,93};
		
		//Arrays.sort(sortarray);
		
		/*
		 * for(int val:sortarray) { System.out.println(val); }
		 */
		 int n = sortarray.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (sortarray[j] > sortarray[j + 1]) {
	                    int temp = sortarray[j];
	                    sortarray[j] = sortarray[j + 1];
	                    sortarray[j + 1] = temp;
	                    
	                }
	            }
	        }
	        System.out.println("Sorted array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(sortarray[i] + " ");
	        }
	}

}
