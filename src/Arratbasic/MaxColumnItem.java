package Arratbasic;

public class MaxColumnItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{2,0,5},{3,4,2},{1,11,9}};
		int min = a[0][0];
		int indexj =0;
		
		
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
					indexj =j;
				
				}
			}
		}
		int  maxC= a[0][indexj];
		System.out.println(maxC);
		
	/*	for(int i=0; i<a.length;i++) {
			for(int j= indexj; j<=indexj;j++) {
				if(a[i][j]>maxC) {
					
					maxC=a[i][j];
				}
			}
		}*/
		
		int k=0;
		while(k<3) {
			if(a[k][indexj]>maxC) {
				maxC=a[k][indexj];
			}
			k++;
		}
		System.out.println(maxC);

	}

}
