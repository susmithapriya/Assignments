/**
 * 
 */
package javaassignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 */
public class Collections1 {

	/**
	 * 
	 */
	public Collections1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List
		List<String> cities=new ArrayList<String>();
		cities.add("Delhi-1484km");
		cities.add("Bengaluru-741km");
		cities.add("Vishakapatnam-681.96km");
		cities.add("Hyderabad-650km");
		cities.add("Lucknow-631km");
		
		System.out.println("the total area of the 3rd and 4th cities combined is "+cities.get(2) +" and " +cities.get(3));
		
		//Set
		Set<String> tourist=new HashSet<String>();
		tourist.add("1. Senso-ji Temple, Tokyo, Japan ");
		tourist.add("2. Niagara Falls, Ontario, Canada/NY, USA ");
		tourist.add("3. Forbidden City, Beijing, China");
		tourist.add("4. Notre-Dame Cathedral, Paris, France");
		tourist.add("5. Sacré-Cœur Basilica, Paris, France");
		tourist.add("6. St. Peter’s Basilica, Rome, Italy ");
		tourist.add("7. Great Wall of China, Badaling, China");
		tourist.add("8. Hollywood Walk of Fame, Los Angeles, USA");
		tourist.add("9. Louvre Museum, Paris, France");
		tourist.add("10. Sydney Opera House, Sydney, Australia");
		
		
		System.out.println("the top 10 most visited tourist attractions in the world "+tourist.toString()+ " and size is "+tourist.size());
		
		//arrays
		int num[]= {1, 12, 13, 15, 10, 12, 20, 18, 30, 45};
		int avg;
		
		System.out.println("the Average of 5th and 6th Value " + (num[4]+num[5])/2);
		
		//List
		List<String> movies=new ArrayList<String>();
		movies.add("Avatar");
		movies.add("Avengers: Endgame");
		movies.add("Avatar: The Way of Water");
		movies.add("Titanic");
		movies.add("Ne Zha 2 †");
		
		System.out.println("The third movie on the list is" +movies.get(2));
		
		
		
		
		
	}

}
