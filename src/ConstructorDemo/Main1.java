package ConstructorDemo;

 class Complex { 
    private  double re,  im; 
    int ar[] = new int[] {13};
    
   
    
    public Complex(double re, double im) { 
    	
        this.re = re; 
        this.im = im; 
    } 
    Complex(Complex c) 
    { 
      System.out.println("Copy constructor called"); 
      re = c.re; 
      im = c.im; 
    }             
    public String toString() { 
        return "(" + re + " + " + im + "i)"; 
    }             
} 
class Main1 extends Complex{ 
    Main1(Complex c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) { 
        Complex c1 = new Complex(10, 15); 
        Complex c2 = (Complex)new Complex(c1);     
        Complex c3 = c1;   
        System.out.println(c2); 
    } 
} 
