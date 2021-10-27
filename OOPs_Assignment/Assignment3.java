package OOPs_Assignment;

abstract class Pen {
	
	abstract void write();
	abstract void refill();
}

abstract class Concrete extends Pen {
	abstract void write();
	abstract void refill();
	void Nib() {
		System.out.println("Nib is Created");
	}
}

class Monkey {
	void jump(){
		System.out.println("Monkey is Jumping");
	}
	void bite() {
		System.out.println("Monkey is Bitting");
	}
}

class Human extends Monkey {
	
}
public class Assignment3 {

	public static void main(String[] args) {
		

	}

}
