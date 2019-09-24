package Arratbasic;

public class MutlidArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][] = new int[2][3]; 
		ar[0][0]=1;
		ar[0][1]=2;
		ar[0][2]=3;
		
		ar[1][0]=4;
		ar[1][1]=5;
		ar[1][2]=6;
		
		
		int br[][] = {{2,4,5},{3,4,7},{1,2,3}};
		
		for(int i=0; i<br.length;i++) {
			for (int j=0; j<br.length;j++) {
			
				System.out.print(br[i][j]+ " ");
			}
			System.out.println("");
		} 
		
		System.out.println("--------------------------------------------------------");
		
		for(int i=0; i<br.length-1;i++) {
			
			for(int j=1 ;j<br.length;j++) {
				System.out.print(br[i][j]);
			}
			System.out.println("");
			
		}
		
		
	}

}
