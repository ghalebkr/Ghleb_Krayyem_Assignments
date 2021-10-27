package assignment_Constructor_Methods;

public class Students_Marks {

	String name ;
	int age;
	char section ;
	char gender ;
	int subject1 ;
	int subject2;
	int subject3;
	
	

	public Students_Marks() {
		
	}
	
	public Students_Marks(int subject1, int subject2, int subject3) {
		
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}

	public int totalMark( int subject1, int subject2, int subject3){
		
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		
		int total = subject1 +subject2+subject3 ;
				
		return total;
		}
	
	public int totalMark( int subject2, int subject3){
		this.subject2 = subject2;
		this.subject3 = subject3;
		
		int total =  subject2+subject3 ;
				
		return total;
		}
	
	public int percentage( int subject1, int subject2, int subject3){
	
		return ((totalMark(subject1, subject2, subject3)*100)/300);
	}
	public int percentage(  int subject2, int subject3){
		
		return ((totalMark(subject2, subject3)*100)/300);
	}
	

	public static void main(String[] args) {
		
		
		Students_Marks s1 = new Students_Marks();
		Students_Marks s2 = new Students_Marks();
		Students_Marks s3 = new Students_Marks();
		Students_Marks s4 = new Students_Marks();
		
		System.out.println("The Total Marks of Student 1 is " +s1.totalMark(20, 40, 60));
		System.out.println("The Precentage of Student 1 is " +s1.percentage(20, 40, 60)+"%" );
	
		System.out.println("The Total Marks of Student 2 is " +s2.totalMark(60, 85));
		System.out.println("The Precentage of Student 2 is " +s2.percentage(60,85) +"%");
		
		System.out.println("The Total Marks of Student 3 is " +s3.totalMark(45, 50));
		System.out.println("The Precentage of Student 3 is " +s3.percentage(45, 50) +"%");
		
		System.out.println("The Total Marks of Student 4 is " +s4.totalMark(90, 70, 85));
		System.out.println("The Precentage of Student 4 is " +s4.percentage(90,70, 85) +"%");
	}

}
