package SuperKeyword;



class Student{
	
	int a;
	int b;
	String s;
	
	Student(int a, int b, String s){
		this.a=a;
		this.b=b;
		this.s=s;
	}
	
	void display() {
		System.out.println(a +" "+ b+" "+s);
	}
	
}


public class thisDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ob = new Student(2,4, "chcek");
		ob.display();

	}

}
