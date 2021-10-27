package Package2;

import Package1.Class_M;
import Package1.Class_N;

public class Class_Y extends Class_N {

	public static void main(String[] args) {
		Class_M c3 = new Class_M();
		Class_N c4 = new Class_N();
		Class_Y c5 = new Class_Y();
		
		c3.methodPublic();
		c4.methodPublic();
		c5.methodProtected();
		
	
		
	System.out.println("The Value of int = " +c4.e);
	
	
		

}
}