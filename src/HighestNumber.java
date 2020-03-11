
public class HighestNumber {
	
	static double higestnumber(double ar[]) {
		
		for(int i=0; i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
				/*double temp = ar[i];
				ar[i]=ar[j];
				ar[j]=temp;*/
					
					ar[j]= ar[i]+ar[j];
					ar[i]=ar[j]-ar[i];
					ar[j]=ar[j]-ar[i];
					
					
				}
			}
		}
		
		
		return ar[ar.length-1];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(higestnumber(new double [] {5,4.6,3,0, 9.1,1.1,5.4, 9,4}));
	}

}
