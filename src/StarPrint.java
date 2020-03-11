
public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
/*		for(int i =0 ; i<5;i++) {
			for (int j =0;j<=i;j++) {
				System.out.print("*");
				}
			System.out.println("");
		}
*/		
		/*for(int i =1 ; i<=5;i++) {
			for (int j =i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");	
			}
			
			System.out.println("");
		}*/

		/*for(int i =1 ; i<=5;i++) {
			for (int j =i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");	
				System.out.print(" ");
			}
			
			System.out.println("");
		}
*/	 
		//int l=0;
		for(int i=1;i<=5;i++) {
			for (int j=i;j<=5-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			
			System.out.println("");
		//	 l =i;
		}
		for(int l=4; l<=1;l--) {
			for (int j=l;j>=5-1;j--) {
				System.out.print(" ");
			}
			for(int k=l;k<=1;k--) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
