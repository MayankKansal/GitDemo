
public class arrayBasic {
	
	public static void main(String arg[]) {
		
		int ar[]= {4,6,2,7,8};
		for(int i=0; i<ar.length; i++) {
			
			if(ar[i]==6)
			{
				System.out.println("index of 8th "+ i);
				System.out.println("chnage 1");
				//test status
				System.out.println("changes1.1");
				System.out.println("changes 2.1");
				break;
				
			}
		}
	}

}
