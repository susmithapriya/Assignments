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
		
		Map<String,String> Student1 =new HashMap<String,String>();
		
		Student1.put("Name","John Doe");
		Student1.put("Age","Twenty");
		Student1.put("Gender","Male");
		Student1.put("Roll Number","SBA12345");
		Student1.put("Grade","A++");
		Student1.put("Major","Computer Science");
		Student1.put("GPA","A3.8");
		Student1.put("Email","john@example.com");
		Student1.put("PAN Number","SDF6543210");
		Student1.put("Address","123 Elm St");
		
		
       Map<String,String> Student2 =new HashMap<String,String>();
		
		Student2.put("Name","Jane Smith");
		Student2.put("Age","Twenty One");
		Student2.put("Gender","Female");
		Student2.put("Roll Number","SBA12346");
		Student2.put("Grade","B+");
		Student2.put("Major","Mathematics");
		Student2.put("GPA","A3.5");
		Student2.put("Email","jane@example.com");
		Student2.put("PAN Number","REW6543211");
		Student2.put("Address","456 Oak St");
		
		
		 Map<String,String> Student3 =new HashMap<String,String>();
			
			Student3.put("Name","Mike Brown");
			Student3.put("Age","Twenty Two");
			Student3.put("Gender","Male");
			Student3.put("Roll Number","SBA12347");
			Student3.put("Grade","A+");
			Student3.put("Major","Physics");
			Student3.put("GPA","A3.9");
			Student3.put("Email","mike@example.com");
			Student3.put("PAN Number","TYR6543212");
			Student3.put("Address","789 Pine St");
			
			List<Map<String,String>> Studentdetails=new ArrayList<Map<String,String>>();
			Studentdetails.add(Student1);
			Studentdetails.add(Student2);
			Studentdetails.add(Student3);
			
			
			
			Map<String,String> Employee1 =new HashMap<String,String>();
			
			Employee1.put("Employee ID","E001");
			Employee1.put("Name","Alice Green");
			Employee1.put("Age","Thirty");
			Employee1.put("Gender","Female");
			Employee1.put("Department","Engineering");
			Employee1.put("Position","Software Engineer");
			Employee1.put("Salary","75K Pounds");
			Employee1.put("Email","alice@example.com");
			Employee1.put("PAN Number","SDF6543210");
			
			
			Map<String,String> Employee2 =new HashMap<String,String>();
			
			Employee2.put("Employee ID","E002");
			Employee2.put("Name","Bob Johnson");
			Employee2.put("Age","Thirty Five");
			Employee2.put("Gender","Male");
			Employee2.put("Department","Marketing");
			Employee2.put("Position","Marketing Manager");
			Employee2.put("Salary","85K Pounds");
			Employee2.put("Email","bob@example.com");
			Employee2.put("PAN Number","REW6543211");
			
			Map<String,String> Employee3 =new HashMap<String,String>();
			
			Employee3.put("Employee ID","E003");
			Employee3.put("Name","Carol White");
			Employee3.put("Age","Twenty Eight");
			Employee3.put("Gender","Female");
			Employee3.put("Department","Sales");
			Employee3.put("Position","Sales Executive");
			Employee3.put("Salary","65K Pounds");
			Employee3.put("Email","carol@example.com");
			Employee3.put("PAN Number","TYR6543212");
			
			
			List<Map<String,String>> EmployeeDetails=new ArrayList<Map<String,String>>();
			EmployeeDetails.add(Employee1);
			EmployeeDetails.add(Employee2);
			EmployeeDetails.add(Employee3);
			
		
			

		        // Product 1: Laptop
		        Map<String, String> product1 = new HashMap<>();
		        product1.put("Product ID", "P001");
		        product1.put("Name", "Laptop");
		        product1.put("Category", "Electronics");
		        product1.put("Price", "12K Pounds");
		        product1.put("Stock Quantity", "Not Available");
		        product1.put("Supplier", "Tech Supplies");
		        product1.put("Warranty", "2 years");
		        product1.put("Rating", "4.5 Stars");
		        product1.put("Manufacturing Date", "Aug 2023");
		        product1.put("Expiry Date", "Aug 2028");

		        // Product 2: Desk Chair (Office Depot)
		        Map<String, String> product2 = new HashMap<>();
		        product2.put("Product ID", "P002");
		        product2.put("Name", "Desk Chair");
		        product2.put("Category", "Furniture");
		        product2.put("Price", "150K Pounds");
		        product2.put("Stock Quantity", "Two");
		        product2.put("Supplier", "Office Depot");
		        product2.put("Warranty", "1 year");
		        product2.put("Rating", "4 Stars");
		        product2.put("Manufacturing Date", "Sep 2024");
		        product2.put("Expiry Date", "N/A");

		        // Product 3: Coffee Maker
		        Map<String, String> product3 = new HashMap<>();
		        product3.put("Product ID", "P003");
		        product3.put("Name", "Coffee Maker");
		        product3.put("Category", "Kitchen");
		        product3.put("Price", "75 Pounds");
		        product3.put("Stock Quantity", "Two Hundred");
		        product3.put("Supplier", "KitchenWorld");
		        product3.put("Warranty", "6 months");
		        product3.put("Rating", "4.2 Stars");
		        product3.put("Manufacturing Date", "Jan 2025");
		        product3.put("Expiry Date", "Jan 2027");
		        
		        
		        ArrayList<Map<String, String>> productList = new ArrayList<>();
		        // Add all products to the list
		        productList.add(product1);
		        productList.add(product2);
		        productList.add(product3);
		        
		        Map<String, List<Map<String, String>>> dataMap = new HashMap<>();
		        
		        dataMap.put("Student", Studentdetails);
		        dataMap.put("Employee", EmployeeDetails);
		        dataMap.put("products", productList);
		        
		        System.out.println(dataMap.get("Student").get(0));
		        System.out.println(dataMap.get("Employee").get(1));
		        System.out.println(dataMap.get("Student").get(2));
		        System.out.println(dataMap.get("Employee").get(0));
		        System.out.println(dataMap.get("Student").get(1));
		        System.out.println(dataMap.get("Employee").get(2));
		        System.out.println(dataMap.get("products").get(1).get("Supplier"));
	}

}
