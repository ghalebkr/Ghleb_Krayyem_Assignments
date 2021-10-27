package Package1;

public class Class_N {
	protected long d=50000;
	public int e=24;
	double f=1.002;
	
	public void methodPublic()
	{
		System.out.println("Class_N : mathodPublic");
	}
	 void methodDefault()
	{
		System.out.println("Class_N : mathodDefault");
	}
	 protected void methodProtected()
		{
			System.out.println("Class_N : mathodProtected");
		}
	 @SuppressWarnings("unused")
	private void methodPrivate()
		{
			System.out.println("Class_N : mathodPrivate");
		}

}
