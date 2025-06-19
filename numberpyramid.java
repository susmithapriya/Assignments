package javaassignments;

public class numberpyramid {

	public numberpyramid() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		int m = 5;
		for(int i = 1;i<=m;i++)
		{
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
	int o=5;
		for(int i=1;i<=o;i++) {
			for(int j=i;j<=o;j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		
		int p=5;
		int space=p-1;
		for(int i=1;i<=p;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
		/*
		 * int q=5; int Lspace=q-1; for(int i=1;i<=q;i++) { for(int j=1;j<=q;j++) {
		 * System.out.print("* "); } for(int j=1;j<=Lspace;j++) {
		 * System.out.print("  "); Lspace--; }
		 * 
		 * 
		 * 
		 * System.out.println();
		 * 
		 * }
		 */
		
		
		
		}

	
}
