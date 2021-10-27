package Package2;

import Package1.Class_M;
import Package1.Class_N;
import Package1.Class_P;

public class Class_Z extends Class_M{
	public static void main(String[] args) {
	Class_M c6 = new Class_M();
	Class_N c7 = new Class_N();
	Class_P c8 = new Class_P();
	Class_x c9 = new Class_x();
	Class_Z c10 = new Class_Z();
	
	c6.methodPublic();
	c7.methodPublic();
	c8.methodPublic();
	c10.methodProtected();
	System.out.println("The Vlaue of Long = " +c9.h);
	System.out.println("The Vlaue of Float = " +c9.i);
	System.out.println("The Vlaue of Char = " +c9.r);
	
	

}
}