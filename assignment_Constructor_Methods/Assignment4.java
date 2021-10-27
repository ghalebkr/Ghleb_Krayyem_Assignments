package assignment_Constructor_Methods;

abstract class Marks{
	abstract public int getPercentage();
}

 class StudentA extends Marks {
	
 int subject1 =65;
 int subject2 =50;
 int subject3 =86;


	public int getPercentage() {
		return  (((subject1+ subject2+subject3)*100)/300);
	}
}
 
 class StudentB extends Marks {
		
	 int subject1 =74;
	 int subject2 =90;
	 int subject3 =86;
	 int subject4 =84;



		public int getPercentage() {
			return  (((subject1+ subject2+subject3+subject4)*100)/400);
		}
	}
public class Assignment4 {

	public static void main(String[] args) {
		Marks sa = new StudentA();
		Marks sb = new StudentB();
		System.out.println("The Percentage of Student A = "+sa.getPercentage() +"%");
		System.out.println("The Percentage of Student B = "+sb.getPercentage() +"%");

	}

}
