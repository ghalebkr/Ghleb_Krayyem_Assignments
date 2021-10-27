package assignment_Constructor_Methods;



public class method_Calculate {

	public int Calculate(int a, int b)
	{
		return a+b;
	}
	public float Calculate( float r)
	{
		return (float) (r*r*Math.PI);
	}
	public int Calculate(int h, double b)
	{
		return (int) (h*b);
	}

public static void main(String[] args) {
	method_Calculate c = new method_Calculate();
	
	System.out.println(c.Calculate(50,20));
	System.out.println(c.Calculate(9.621f));
	System.out.println(c.Calculate(12, 9.5));
	
}
}

