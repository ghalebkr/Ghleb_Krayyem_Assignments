package String_Assignment;

public class StringAssg {

	public static void main(String[] args) {
		String t = "Delhi";    // 1 in S.P
		String o = "Mumbai";   // 1 in S.P
		String k = "delhi";    // 1 in S.P
		
		String y = new String ("Mumbai");	// 1 in Heap and already found in S.P
		String l = new String ("delhi");	// 1 in Heap and already found in S.P
		String p = new String ("Hello");	// 1 in Heap and 1 in S.P
		
		// So we have 4 objects in S.P and 3 objects in Heap 
		
	if (o.equals(l)) {
		System.out.println(" O and L are Equal using equals"); }
	else {
		System.out.println("O and L are Not Equal using equals");
	}
	if (o == l) {
		System.out.println(" O and L are Equal using =="); }
	else {
		System.out.println("O and L are Not Equal using ==");
	}
		
	
	if (t.equals(o)) {
		System.out.println(" t and o are Equal using equals"); }
	else {
		System.out.println("t and o are Not Equal using equals");
	}
	if (t == o) {
		System.out.println(" t and o are Equal using =="); }
	else {
		System.out.println( "t and o are Not Equal using ==");
	}
	
	
	if (y.equals(p)) {
		System.out.println(" y and p are Equal using equals"); }
	else {
		System.out.println("y and p are Not Equal using equals");
	}
	if (y == p) {
		System.out.println(" y and p are Equal using =="); }
	else {
		System.out.println( "y and p are Not Equal using ==");
	}
	
	
	if (k.equals(y)) {
		System.out.println(" k and y are Equal using equals"); }
	else {
		System.out.println("k and y are Not Equal using equals");
	}
	if (k == y) {
		System.out.println(" k and y are Equal using =="); }
	else {
		System.out.println( "k and y are Not Equal using ==");
	}
	
	if (p.equals(y)) {
		System.out.println(" p and y are Equal using equals"); }
	else {
		System.out.println("p and y are Not Equal using equals");
	}
	if (p == y) {
		System.out.println(" p and y are Equal using =="); }
	else {
		System.out.println( "p and y are Not Equal using ==");
	}
	}
}
