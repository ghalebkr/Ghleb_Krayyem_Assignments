package OOPs_Assignment;

class Vehicle {
	int speed = 50;
	long distance = 1000;
	
	
	public Vehicle() {
		super();
	}
	public Vehicle(int speed, long distance) {
		super();
		this.speed = speed;
		this.distance = distance;
		System.out.println("Speed of Vehicle is " +speed + "\n The Distance Covered by the Vehicle is " +distance);
	}
	
	
	void run() {
		System.out.println("Vehicle is Running ...");
	}
	void stop() {
		System.out.println("Vehicle is Stopped ...");
	}
	
	public void fuel( int num1) {
		System.out.println("Fuel Number = " +num1);
	}
	public void fuel( float num2 , String string1) {
		System.out.println( "Type of Fuel is " + string1 + " Fuel Number is " +num2);
	}
	public void fuel( char char1 , int num3) {
		System.out.println( "Type of Fuel is  " +char1 + " Fuel Number is " +num3);
	}
	
}

class TwoWheels extends Vehicle {
	int speed = 80;
	long distance = 2000;
	int No_of_Wheels = 2;
	
	public TwoWheels() {
		super();}
	
@Override
	void run(){
		System.out.println("Two Wheels Vehicle is Running");
	}
@Override
void stop(){
	System.out.println("Two Wheels Vehicle is Stopped");
}
	
public void display() {
	System.out.println("Speed of Two Wheels is " +speed +" Distance of Two Wheels is " +distance +" Number of Wheels is " +No_of_Wheels );
	Vehicle tw = new TwoWheels ();
	System.out.println("Vehicle Speed is " +tw.speed + " Vehicle distance is " +tw.distance);
}
}

class ThreeWheels extends Vehicle {
	int speed = 100;
	long distance = 3000;
	int No_of_Wheels = 3;
	
	public ThreeWheels() {
		super();}
	
@Override
	void run(){
		System.out.println("Three Wheels Vehicle is Running");
	}
@Override
void stop(){
	System.out.println("Three Wheels Vehicle is Stopped");
}
	
public void display() {
	System.out.println("Speed of Three Wheels is " +speed +" Distance of Three Wheels is " +distance +" Number of Wheels is" +No_of_Wheels );
	Vehicle thw = new ThreeWheels ();
	System.out.println("Vehicle Speed is " +thw.speed + " Vehicle distance is" +thw.distance);
}
}

class FourWheels extends Vehicle {
	int speed = 80;
	long distance = 2000;
	int No_of_Wheels = 4;
	
	public FourWheels() {
		super();}
	
@Override
	void run(){
		System.out.println("Four Wheels Vehicle is Running");
	}
@Override
void stop(){
	System.out.println("Four Wheels Vehicle is Stopped");
}
	
public void display() {
	System.out.println("Speed of Four Wheels is " +speed +" Distance of Four Wheels is " +distance +" Number of Wheels is" +No_of_Wheels );
	Vehicle fw = new FourWheels ();
	System.out.println("Vehicle Speed is " +fw.speed + " Vehicle distance is" +fw.distance);
}
}

class EightWheels extends Vehicle {
	int speed = 60;
	long distance = 4000;
	int No_of_Wheels = 8;
	
	public EightWheels() {
		super();}
	
@Override
	void run(){
		System.out.println("Eight Wheels Vehicle is Running");
	}
@Override
void stop(){
	System.out.println("Eight Wheels Vehicle is Stopped");
}
	
public void display() {
	System.out.println("Speed is " +speed +" Distance is " +distance +" Number of Wheels is" +No_of_Wheels );
	Vehicle ew = new EightWheels ();
	System.out.println("Vehicle Speed is " +ew.speed + " Vehicle distance is" +ew.distance);
}
}

public class Assignment1 {

	public static void main(String[] args) {
		Vehicle v;
		v = new Vehicle();
		v.fuel(95);
		v.fuel('D', 95);
		v.fuel(2.95f, "Diesel");
		
		
		
		TwoWheels ww;
		ww = new TwoWheels();
		ww.run();
		ww.stop();
		ww.display();
		
		
		ThreeWheels tw ;
		tw = new ThreeWheels();
		tw.run();
		tw.stop();
		tw.display();
		
		FourWheels fw ;
		fw = new FourWheels();
		fw.run();
		fw.stop();
		fw.display();
		
		EightWheels ew;
		ew = new EightWheels();
		ew.run();
		ew.stop();
		ew.display();
		
	}

}
