package Exphandling;

public class Exception1 {

	public static void main(String[] args) {
		int a =4;
		int b=0;
		
try {
	
	System.out.println("Sys try");
	int c=a/b;
	System.out.println(c);
	System.out.println("try");
}
catch(Exception e) {
	System.out.println("exception handle");
	System.out.println(e);
}
finally {
	System.out.println("Im final");
}
	
	}

}
