/**
 * 
 */
package javaassignments;

/**
 * 
 */
public class operatorsAssignment {

	/**
	 * 
	 */
	public operatorsAssignment() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[]={"Suresh","Mahesh","Naresh"};
		int marks[]= {75, 80, 82};
		int  updatedMarks[]=new int[marks.length];
		int total=0;
		
		for (int i = 0; i < marks.length; i++) {
            updatedMarks[i] = marks[i] + 10; 
            }
		
		 
	     for (int i : updatedMarks) {
	            total += i;
	        }
	    // System.out.println(total);
	     int average = total / updatedMarks.length;
	     
	     for (int i = 0; i < name.length; i++) {
	            System.out.println(name[i] + ": " + updatedMarks[i]);
	        }
	     System.out.println("Average Marks: " + average);
	}

}
