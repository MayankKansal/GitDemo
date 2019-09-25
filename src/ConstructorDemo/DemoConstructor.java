package ConstructorDemo;

public class DemoConstructor {

	public DemoConstructor() {
		
		System.out.println("simple cons");
	}
	
	public void DemoConstructor() {
		 System.out.println("anohter simple cons");
	}
	
	public DemoConstructor(int a, int b) {
		
		int c= a+b;
		System.out.println(c);
	}
	
	public  DemoConstructor(String s) {
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoConstructor cd =new DemoConstructor();
		cd.DemoConstructor();
		
		DemoConstructor c =new DemoConstructor("hello");
		DemoConstructor ci =new DemoConstructor(4,5);
	}

}
