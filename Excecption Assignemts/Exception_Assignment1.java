package Exception;

public class Exception_Assignment1 {
	
	
	public static void main(String[] args) {
		try {
			checkException();
			int a[] = new int [5];
			a[5] = 9;
			a[3] = 30/0;
		}
		catch(ArrayIndexOutOfBoundsException ee) {
			System.out.println("Array Index out of Bounds Exception");
		} 
		finally {
			System.out.println("Outside the Method");
		}
	}
public static void checkException() {
	try {
		int a[] = new int [5];
		a[3] = 30/0;
		a[5] = 9;
	}
	catch (ArithmeticException ee) {
		System.out.println("Arithmetic Exception");}
	finally {
		System.out.println("Inside the Method");
	}
	
}
}


