/**
 * 
 */
package javaassignments;

/**
 * 
 */
public class palindrome {
	
	
	public static boolean ispalindrome(String s){
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
				
			}
			i++;
			j--;
			
		}
		
		return true;
		
		
	}

	/**
	 * 
	 */
	public palindrome() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="A man, a plan, a canal: Panama";
		String s2="race a car";
		
		s1=s1.toLowerCase().replaceAll(",","").replace(":", "").replace(" ", "");
		s2=s2.toLowerCase().replace(" ", "");
		System.out.println(s1);
		System.out.println(s2);
		
		if(ispalindrome(s1)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
		System.out.println();
		
		if(ispalindrome(s2)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		

	}

}
