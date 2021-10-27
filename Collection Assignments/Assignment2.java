package Queue;

import java.util.TreeSet;

public class Assignment2 {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Python");
		ts.add("Java");
		ts.add("C++");
		ts.add("PHP");
		ts.add("JavaScript");
		ts.add("Visual Basic");
		
		System.out.println(ts);
		
		ts.remove("Visual Basic");
		ts.remove("C++");
		
		System.out.println(ts);
		
		ts.add("SQL");
		ts.add("Groovy ");
		ts.add("C#");
		
		System.out.println(ts);
		
		System.out.println("In Java in the list or not? "+ts.contains("Java"));
		
		ts.clear();
		System.out.println(ts);
	}

}
