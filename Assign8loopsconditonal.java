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
public class Assign8loopsconditonal {

	/**
	 * 
	 */
	public Assign8loopsconditonal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> Transactionlist= new ArrayList<Integer>();
		
		Transactionlist.add(50000);
		Transactionlist.add(-2000);
		Transactionlist.add(3000);
		Transactionlist.add(-15000);
		Transactionlist.add(-200);
		Transactionlist.add(-300);
		Transactionlist.add(4000);
		Transactionlist.add(-3000);
		System.out.println("Print total number of credit and debit transactions completed "+Transactionlist.size());
		
		int creditCount = 0, debitCount = 0, suspiciousCount = 0;
        double totalCredits = 0, totalDebits = 0, balance = 0;
		
		for(Integer amount:  Transactionlist) {
			if (amount > 0) {
                creditCount++;
                totalCredits += amount;
                balance += amount;
                if (amount > 10000) {
                    System.out.println("Suspicious credit transaction with amount: " + amount);
                    suspiciousCount++;
                }
            } else {
                debitCount++;
                totalDebits += amount;
                balance += amount;
                if (amount < -10000) {
                    System.out.println("Suspicious debit transaction with amount: " + amount);
                    suspiciousCount++;
                }
			
			
		}
		
		
		}
		System.out.println("Total number of credit transactions: " + creditCount);
        System.out.println("Total number of debit transactions: " + debitCount);
        System.out.println("Total amount credited: " + totalCredits);
        System.out.println("Total amount debited: " + totalDebits);
        System.out.println("Total balance remaining: " + balance);
        System.out.println("Total number of suspicious transactions: " + suspiciousCount);
	}

}
