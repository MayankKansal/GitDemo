package SuperKeyword;

public class childDemo extends parentDemo {

	String s = "child";

	public childDemo() {
		super();
		System.out.println("child constructor");
	}

	public void getStringData() {

		System.out.println(s);
		System.out.println(super.s);
	}

	public void getData() {
		System.out.println("From Child method");
		super.getData();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childDemo cd = new childDemo();
		// parentDemo cd1 =new parentDemo();

		cd.getStringData();
		cd.getData();

	}

}
