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
		
		
		//1 Array
		String sems[]= {"sem1","sem2","sem3","sem4"};
		
		String sub[]= {"sub1","sub2","sub3","sub4","sub5","sub6","status/marks"};
		
		String val[]= {"M1","Physics","Chemistry","computer programming","Engineer Drawing","Basi Eletrial eng","M2","Mechanics","Environmental shools",
				"Basic Electronics","engineering physics","Engineering graphics","Data Strutures","Discrete math","Digital Eletronics","OS","SS","OOP",
				"Alg","CN","DBMS","Mc","Communication eng","SE","P&S","ML","CD","Theory Compu","ES","CG"};
		
		String marks[]= {"p78","p85","f21","p74","p88","p79","p82","p77","p93","f19","f24","p90","p88","p81","p76","f32","p85","p78","p91","p73","f19","p80",
				"p76","p87","p86","p88","p84","p95","p73","p90"};
		
		String ss[][]= {sems,sub};
		String vm[][]= {val,marks};
		
		String ssvm[][][]= {ss,vm};
		
		System.out.println(ssvm[0][0][2]);
		

	}

}
