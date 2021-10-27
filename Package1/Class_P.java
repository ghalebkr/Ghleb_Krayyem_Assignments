package Package1;

public class Class_P {
	
public static void main(String[] args) {
	
	Class_M c1 = new Class_M();
	c1.methodPublic();
	c1.methodDefault();
	c1.methodProtected();
	System.out.println("The Value of long = " + c1.b);
	System.out.println("The Value of float = " + c1.c);

	Class_N c2 = new Class_N();
	c2.methodPublic();
	c2.methodDefault();
	c2.methodProtected();
	System.out.println("The Value of int = " + c2.e);
	System.out.println("The Value of double = " + c2.f);
	System.out.println("The Value of long = " + c2.d);
	
	}
	
	public void methodPublic()
	{
		System.out.println("Class_P : mathodPublic");
	}
	 void methodDefault()
	{
		System.out.println("Class_P : mathodDefault");
	}
	 protected void methodProtected()
		{
			System.out.println("Class_P : mathodProtected");
		}
	 @SuppressWarnings("unused")
	private void methodPrivate()
		{
			System.out.println("Class_P : mathodPrivate");
		}

}
