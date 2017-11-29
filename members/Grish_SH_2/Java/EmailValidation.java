import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class EmailValidation {
 
    public static void main(String[] args) {
        Scanner mail = new Scanner(System.in);
        System.out.print("Email adress: ");
        String input = mail.next();
        String regex = "(\\w+\\d*[_.-]*\\w*\\d*){3,256}@([a-z]{3,256}.[a-z]{2,6})";
        Pattern l = Pattern.compile(regex);
        Matcher m = l.matcher(input);
        if (m.matches()) {
       	    System.out.println("Valid Email adress:");       
	}
	else {
	    System.out.println("Invalid Email adress. Please try again:");
	}
	System.out.print("Password: ");
	input = mail.next();
        regex = "^.*(?=.{6,256})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!^&+=]).*$";
	if (m.matches()) {
	    System.out.println("Valid Password:");
	}
	else {
	    System.out.println("Invalid password:");
        }
	  
    }

}
