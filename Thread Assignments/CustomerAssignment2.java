package Threads;

class Class{
	
	int amount = 10000;
	
	synchronized void  Withdraw (int amount) {
		System.out.println("Withdraw Process Activated...");
		
		if (this.amount< amount) {
			System.out.println("Balance Not Sufficient, Waiting for Deposit... ");
			
			try { wait(); }
			catch (Exception e) {System.out.println(e);	}
			}
		this.amount -= amount;
		System.out.println(" Withdraw Process is Done, The Left Money is " +this.amount);
}

	synchronized void Deposit (int amount) {
		System.out.println("Deposit Process in Progress... ");
		this.amount+=amount;
		System.out.println("Deposit Done, Your New Balance is " +this.amount);
		notify();
	}
}


public class CustomerAssignment2 {

	public static void main(String[] args) {
		
		final Class c = new Class();
		
		new Thread() {
			@Override
			public void run(){
				c.Withdraw(5000);     }
		}.start();
		
		new Thread() {
			@Override
			public void run(){
				c.Withdraw(4000);     }
		}.start();
		new Thread() {
			@Override
			public void run(){
				c.Withdraw(10000);     }
		}.start();
		new Thread() {
			@Override
			public void run(){
				c.Deposit(20000);     }
		}.start();
	}

}
