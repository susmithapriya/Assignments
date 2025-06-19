/**
 * 
 */
package javaassignments;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class Assin9loop {

	/**
	 * 
	 */
	public Assin9loop() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Employee data
		        String[] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		        double[] baseSalaries = {75000.0, 68000.0, 82000.0, 90000.0, 60000.0};
		        double[] experiences = {5.1, 3.2, 7.1, 10.2, 2.4};
		        double[] ratings = {4.2, 3.8, 4.5, 2.5, 3.5};

		        // Initialize the map to store employee names and their corresponding hike percentages
		        Map<String, Double> hikePercentages = new HashMap<>();

		        // Process each employee
		        for (int i = 0; i < names.length; i++) {
		            double baseSalary = baseSalaries[i];
		            double experience = experiences[i];
		            double rating = ratings[i];

		            // Initialize variables for variable pay, bonus, and reward
		            double variablePayPercentage = 0.0;
		            double bonus = 0.0;
		            double reward = 0.0;

		            // Determine variable pay percentage and bonus based on rating
		            if (rating >= 4.0) {
		                variablePayPercentage = 15.0;
		                bonus = 1500.0;
		            } else if (rating >= 3.0) {
		                variablePayPercentage = 10.0;
		                bonus = 1200.0;
		            } else {
		                variablePayPercentage = 3.0;
		                bonus = 300.0;
		            }

		            // Determine reward based on experience
		            if (experience >= 5.0) {
		                reward = 5000.0;
		            }

		            // Calculate total hike
		            double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;

		            // Calculate hike percentage
		            double hikePercentage = (hike / baseSalary) * 100;

		            // Store the result in the map
		            hikePercentages.put(names[i], hikePercentage);
		        }

		        // Print the hike percentages for each employee
		        System.out.println("Employee Name\t\tHike Percentage");
		        System.out.println("----------------------------------------");
		        for (Map.Entry<String, Double> entry : hikePercentages.entrySet()) {
		            System.out.printf("%-20s %.2f%%\n", entry.getKey(), entry.getValue());
		        }
		    }

	

}

