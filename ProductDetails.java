/**
 * 
 */
package javaassignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class ProductDetails {

	/**
	 * 
	 */
	public ProductDetails() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Prepare the structure
        Map<String, ArrayList<Map<String, String>>> dataMap = new HashMap<>();

        ArrayList<Map<String, String>> productList = new ArrayList<>();

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

        // Add all products to the list
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        // Put the list into the map
        dataMap.put("products", productList);

        // Step 2: Find Office Depot products
        ArrayList<Map<String, String>> products = dataMap.get("products");
        
        System.out.println(products.get(1));
		/*
		 * for (Map<String, String> product : products) { if
		 * ("Office Depot".equals(product.get("Supplier"))) {
		 * System.out.println("Found Office Depot Product:"); for (Map.Entry<String,
		 * String> entry : product.entrySet()) { System.out.println(entry.getKey() +
		 * ": " + entry.getValue()); } } }
		 */

	}

}
