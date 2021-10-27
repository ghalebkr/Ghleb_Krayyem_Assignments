package Queue;

import java.util.Iterator;
import java.util.LinkedList;

public class Assignment3 {

	public static void main(String[] args) {
		
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("May");
		ls.add("June");
		ls.add("July");
		ls.add("August");
		ls.add("April");
		ls.add("November");
		
		System.out.println(ls);
		
		ls.addLast("December");
		ls.addFirst("January");
		ls.add(2,"March");
		ls.add(1,"February");
		ls.add(8,"September");
		ls.add(9,"October");
		
		System.out.println(ls);
		
		ls.remove("March");
		ls.add(2,"March");
		ls.remove("April");
		ls.add(3,"April");
		
		System.out.println(ls);
		// for odd numbers
		System.out.println("Odd months are");
		for (int i=0; i<11;i+=2){
			System.out.println( ls.get(i));
		}
		// for even numbers
		System.out.println("Even months are");
		for (int n=1; n<13;n+=2){
			System.out.println( ls.get(n));
		}
		
		Iterator  itr = ls.iterator();
		while (itr.hasNext()) {
			System.out.println("List is "+itr.next());
		}
		
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		
		//Birthday month is May
		
		ls.remove("May");
		System.out.println("May");
		
		if(ls.contains("December") || ls.contains("October") || ls.contains("November")){
			System.out.println("Winter Month Available");
		}
		else{
			System.out.println("Winter Month not Available");
		}
	}

}
