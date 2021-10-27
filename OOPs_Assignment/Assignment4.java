package OOPs_Assignment;

abstract class Telephone {
	abstract void with();
	abstract void lift();
	abstract void disconnected();
}

class Smartphone extends Telephone{
	void with (){
		System.out.println("Smartphone is Connected");
	}
void lift (){
	System.out.println("Smartphone is  Lift");
	}
void disconnected (){
	System.out.println("Smartphone is Disconnected ");
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		Telephone t = new Smartphone();
		 t.with();
		 t.disconnected();
		 t.lift();

	}

}
