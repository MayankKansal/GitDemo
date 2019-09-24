package Arratbasic;

public class MinElementIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int br [][] = {{2,4,5},{3,4,7},{1,2,9}};
		int min = br[0][0];
		for(int i=0; i<br.length;i++) {
			for(int j=0; j<br.length;j++) {
				if(br[i][j]<min) {
					
					min=br[i][j];
				}
			}
		}
		System.out.println(min);

		int max = br[0][0];
		for(int i=0; i<br.length;i++) {
			for(int j=0; j<br.length;j++) {
				if(br[i][j]>max) {
					
					max=br[i][j];
				}
			}
		}
		System.out.println(max);

	}

		
	}
		
