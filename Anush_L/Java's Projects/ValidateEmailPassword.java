import java.util.Scanner;
import java.util.regex.Pattern;

class ValidateEmailPassword {
    public static void main(String[] args) {
        String em, pw;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an email: ");
        em = sc.nextLine();
        System.out.println("Please enter a password: ");
        pw = sc.nextLine();
        String regex = ("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
        if (em.matches(regex)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
        String pattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!.#$@_=,?-]).{4,25})";
        if (pw.matches(pattern)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
