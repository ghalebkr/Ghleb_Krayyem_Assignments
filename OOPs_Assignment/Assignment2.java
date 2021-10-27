package OOPs_Assignment;

abstract class MNC{
	public MNC (){
		System.out.println("MNC is Created");
	}
	
	void Nmethod1(){
		System.out.println("Normal Method in MNC Class");
	}
	
	abstract void run();
	abstract void run1();
}

abstract class Infosys extends MNC{
	abstract void run();
	void run1(){
		System.out.println("Run1 Method in Infosys Class");
}
}

class Hello extends Infosys{
	void run() {
		System.out.println("Run Method in Hello Class");
	}
	void NormalMethod() {
		System.out.println("Normal Method in Hello Class");
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		
		MNC s = new Hello();
		s.run();
		s.run1();
		s.Nmethod1();
		
		 Hello h = new Hello();
		 	h.NormalMethod();
	}

}
