package Exphandling;

class A {
	protected void msg() {
		System.out.println("Hello java");
	}
}

public class SimpleProtected extends A {
	public void msg() {
		System.out.println("Hello java");
	}// C.T.Error

	public static void main(String args[]) {
		SimpleProtected obj = new SimpleProtected();
		obj.msg();
	}
}
