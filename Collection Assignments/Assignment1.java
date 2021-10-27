package Queue;
import java.util.*;
public class Assignment1 {

	public static void main(String[] args) {
		LinkedHashSet l1 = new LinkedHashSet();
		
		l1.add(60);
		l1.add(90);
		l1.add(1.254f);
		l1.add(0.008f);
		l1.add('r');
		l1.add('s');
		l1.add(true);
		
		
		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		
		l2.add(3);
		l2.add(1);
		l2.add(6);
		l2.add(8);
		l2.add(5);
		l2.add(4);
		l2.add(2);
		l2.add(7);
		
		System.out.println("First LinkedHashSet is " +l1);
		System.out.println("Second LinkedHashSet is " +l2);
	}

}
