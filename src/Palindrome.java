
public class Palindrome {
	
	public void palindrome() {
		
		String str ="mayank";
		String check = "";
	
		for (int i=str.length()-1; i>=0; i--)
		{
			check = check+ str.charAt(i);
		}
		System.out.println(str);
		System.out.println(check);
		
		if (check.equalsIgnoreCase(str))
		{
			System.out.println("plaindrome");
			System.out.println("Plaindrome2");
			System.out.println("new change");
			
		}else
		{
		System.out.println("Not a plaindrome");
	}
		
}
	
	public static void main (String args[]) {
		
		Palindrome pd =new Palindrome();
		pd.palindrome();
		
	}

}
