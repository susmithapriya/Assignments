/**
 * 
 */
package javaassignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class Collections2 {

	/**
	 * 
	 */
	public Collections2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> Student =new ArrayList<String>();
		
		Student.add("Name Age Gender Roll Number Grade Major GPA Email PAN Number Address");
		Student.add("John Doe	Twenty	    Male	SBA12345	A++	Computer Science	A3.8	john@example.com	SDF6543210	123 Elm St");
		Student.add("Jane Smith	TwentyOne	Female	SBA12346	B+	Mathematics	        A3.5	jane@example.com	REW6543211	456 Oak St");
		Student.add("Mike Brown	TwentyTwo	Male	SBA12347	A+	Physics	            A3.9	mike@example.com	TYR6543212	789 Pine St");
		
		System.out.println(Student.get(0));
		System.out.println(Student.get(1));
		System.out.println(Student.get(2));
		System.out.println(Student.get(3));
		
		List<String> Employee =new ArrayList<String>();
		
		Employee.add("EmployeeID	Name	Age	   Gender	 Department	    Position	          Salary	Email	              PAN Number");
		Employee.add("E001	Alice Green	Thirty	    Female	Engineering	Software Engineer	75K Pounds	alice@example.com	SDF6543210");
		Employee.add("E002	Bob Johnson	ThirtyFive	Male	Marketing	Marketing Manager	85K Pounds	bob@example.com	    REW6543211");
		Employee.add("E003	Carol White	TwentyEight	Female	Sales	    Sales Executive	    65K Pounds	carol@example.com	TYR6543212");
		
		System.out.println(Employee.get(0));
		System.out.println(Employee.get(1));
		System.out.println(Employee.get(2));
		System.out.println(Employee.get(3));

	}

}
