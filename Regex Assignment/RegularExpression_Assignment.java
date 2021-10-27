package RegularExpression;

import java.util.regex.Pattern;

public class RegularExpression_Assignment {

	public static void main(String[] args) {
	
		
	System.out.println("=============== Email Validation===============");
		System.out.println(Pattern.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", "fisrname@gmail.com"));
		System.out.println(Pattern.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", "virendra@gmail.com"));
		System.out.println(Pattern.matches("[A-Za-z0-9._%+-]+@[A-Za-z]{2,4}+\\.[A-Za-z]{2,4}+\\.[A-Za-z]{2,4}", "test123prepare@co.edu.com"));
		
	System.out.println("=============== Phone Number Validation===============");
		System.out.println(Pattern.matches("\\D\\d{8,15}","+9154849112"));
		System.out.println(Pattern.matches("\\D\\d{2,3}-\\d{6,12}","+91-85494561254"));
	
		System.out.println("=============== Password Validation===============");
		System.out.println(Pattern.matches("[a-z{6}A-Z{1}0-9{3}]{10}","G1b45ryrsh"));
	}

}
