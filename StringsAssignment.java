package javaassignments;

import java.util.ArrayList;
import java.util.List;

public class StringsAssignment {

	public StringsAssignment() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sentence="Java programming is fun and challenging";
		System.out.println(sentence.split(" ").length);
			 
		String reverse="";
		for(int i=0;i<sentence.length();i++)
		{
			reverse=sentence.charAt(i)+reverse;
		}
		System.out.println(reverse);
		
		
		//System.out.println(		);
		
		String[] words = sentence.split("\\s+");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                                   .append(word.substring(1))
                                   .append(" ");
            }
        }

        System.out.println("Original: " + sentence);
        System.out.println("Capitalized: " + capitalizedSentence.toString().trim());
        
        
        
        String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
        int index = paragraph.indexOf("J"); 
        System.out.println(index);

        
        String[] words1 = paragraph.split("\\s+");

        // Step 2: Initialize a list to store indexes of "Java"
        List<Integer> indexes = new ArrayList<>();

        // Step 3: Iterate through the words and find occurrences of "Java"
        for (int i = 0; i < words1.length; i++) {
            if (words1[i].equalsIgnoreCase("Java")) {
                indexes.add(i);
            }
        }

        // Step 4: Print the total count and indexes
        System.out.println("Total occurrences of 'Java': " + indexes.size());
        System.out.print("Indexes: ");
        for (int index1 : indexes) {
            System.out.print(index1 + " ");
        }
	}

}
