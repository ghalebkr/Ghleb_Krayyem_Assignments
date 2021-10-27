package Exception;

public class Assignment2 {

	static void salary (int salary) throws SalaryException{
		if (salary <2100)
			throw new SalaryException ("You need to Work Harder");
		else if (2100<salary && salary <5100)
			throw new SalaryException ("Your Salary is somehow Good");
		else if (5100<salary && salary <9000 )
			throw new SalaryException ("Your Salary is Very Good");
		else 
			System.out.println("Undefined Salary");
		
	}
	public static void main(String[] args) {
		try {
			salary (2000);
		}
		catch (Exception e) {
			System.out.println("Exception Occured: " +e.getMessage());
			}
		System.out.println("Rest of code ...");
	
	

		try {
			salary (4800);
		}
		catch (Exception e) {
			System.out.println("Exception Occured: " +e.getMessage());
			}
		System.out.println("Rest of code ...");
		
		try {
			salary (8000);
		}
		catch (Exception e) {
			System.out.println("Exception Occured: " +e.getMessage());
			}
		System.out.println("Rest of code ...");

	}
}
	class SalaryException extends Exception {
		SalaryException (String s) {
			super (s);
		}

}

