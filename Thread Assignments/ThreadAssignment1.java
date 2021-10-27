package Threads;

class Method {
	
	void factorial (int m) {
		System.out.println("I am in Method method");
	synchronized(this){
		int  n = m;
		for(int x= n-1;x>=1;x--) {
			n*=x;
		}
		try {
			Thread.sleep(1000);  // 1 second
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Factorial of number " +m +" is " +n);
	}
	}
	
	void add (int num1, int num2) {
		
		int num3 = num1+num2;
		try {
			Thread.sleep(1000); // 1 second
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Summation of " +num1 +" and " +num2 + " is " +num3);
	}
	}
	


class Thread1 extends Thread{
	Method m;
	Thread1(Method m) {
		this.m=m;
	}
	public void run() {
		System.out.println("Thread1 run() method ");
		m.factorial(4);
	}
}
class Thread2 extends Thread{
	Method m;
	Thread2(Method m) {
		this.m=m;
	}
	public void run() {
		System.out.println("Thread2 run() method ");
		m.factorial(6);
	}
}
class Thread3 extends Thread{
	Method m;
	Thread3(Method m) {
		this.m=m;
	}
	public void run() {
		System.out.println("Thread3 run() method ");
		m.add(4, 5);
	}
}
class Thread4 extends Thread{
	Method m;
	Thread4(Method m) {
		this.m=m;
	}
	public void run() {
		System.out.println("Thread4 run() method ");
		m.add(10, 20);
	}
}

public class ThreadAssignment1 {

	public static void main(String[] args) {
		
		Method obj =new Method();
		
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		Thread3 t3 = new Thread3(obj);
		Thread4 t4 = new Thread4(obj);
	
		t2.start();
		t4.start();
		t1.start();
		t3.start();
	}

}
