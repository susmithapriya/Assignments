/**
 * 
 */
package javaassignments;

/**
 * 
 */
public class conditionalstatsassgn {

	/**
	 * 
	 */
	public conditionalstatsassgn() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customername="John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;
		
		if (creditScore > 750) {
            System.out.println(customername + " is automatically approved for the loan.");
        } else if (creditScore >= 650 && creditScore <= 750) {
            if (income >= 50000) {
                if (isEmployed) {
                    if (debtToIncomeRatio < 40) {
                        System.out.println(customername + " is eligible for the loan.");
                    } else {
                        System.out.println(customername + " is not eligible for the loan due to high debt-to-income ratio.");
                    }
                } else {
                    System.out.println(customername + " is not eligible for the loan due to unemployment.");
                }
            } else {
                System.out.println(customername + " is not eligible for the loan due to insufficient income.");
            }
        } else {
            System.out.println(customername + " is not eligible for the loan due to low credit score.");
        }
    }

	

}
