package SuperKeyword;

public class ThisDemo {
	int a =5;
	
	public void getData(int a) {
	//	System.out.println(this.a);
		//a=this.a;
		this.a=a;
		System.out.println(this.a);
		a=this.a;
		System.out.println(a);
		System.out.println(a+this.a);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo ob = new ThisDemo();
		
		ob.getData(7);
	}

}
