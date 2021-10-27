package Package1;

public class Class_M {
	private int a;
	long b=1000;
	protected float c=1.234f;
	
	public void methodPublic()
	{
		System.out.println("Class_M : mathodPublic");
	}
	 void methodDefault()
	{
		System.out.println("Class_M : mathodDefault");
	}
	 protected void methodProtected()
		{
			System.out.println("Class_M : mathodProtected");
		}
	 @SuppressWarnings("unused")
	private void methodPrivate()
		{
			System.out.println("Class_M : mathodPrivate");
		}

}
