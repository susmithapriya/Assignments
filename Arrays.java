/**
 * 
 */
package javaassignments;

/**
 * 
 */
public class Arrays {

	/**
	 * 
	 */
	public Arrays() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String[][][] data = {
	                { 
	                        {"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
	                        {"78(Pass)", "85", "91", "74", "88", "79"}
	                },
	                { 
	                        {"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
	                        {"82", "77", "93", "69", "84", "90"}
	                },
	                { 
	                        {"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
	                        {"88", "81", "76", "92", "85", "78"}
	                },
	                { 
	                        {"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"},
	                        {"91", "73", "89", "80", "76", "87"}
	                },
	                { 
	                        {"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
	                        {"86", "88", "84", "95", "73", "90"}
	                }
	        };

	   
	        System.out.println("Semester 3, Subject 4: " + data[2][0][3]); 
	        System.out.println("Semester 3, Subject 5: " + data[2][0][4]); 

	        
	        System.out.println("Semester 5, Subject 3 Marks: " + data[4][1][2]); 
	        System.out.println("Semester 5, Subject 6 Marks: " + data[4][1][5]); 
		

	}

}
