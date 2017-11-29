import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class RegexP{

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the text...");
        String input = sc.nextLine();
        String regex = "[A-Za-z0-9]*\\d+[A-z]*";
        Pattern l = Pattern.compile(regex);
        Matcher m = l.matcher(input);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
