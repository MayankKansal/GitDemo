package seleniummock.project1;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stuba
		
		String s1 = "java";
		String s2 = "tava";
		
		String s3 = new String("java");
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s2.compareTo(s1));
		System.out.println(s2.compareTo("hello"));
		
		String s4 = 5+5+"java"+5+9;
		System.out.println(s4);
		

	}

}
