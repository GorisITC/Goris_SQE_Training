import java.util.Scanner;
import java.lang.Math;

// TBD: Add overloaded methods 
public class Equation{
    public static void main(String[] args) {
    int a, b, c;
    double x1, x2, d;
    Scanner s = new Scanner(System.in);
    System.out.println("Given quadratic equation:ax^2 + bx + c");
    System.out.print("Enter a:");
    a = s.nextInt();
    System.out.print("Enter b:");
    b = s.nextInt(); 
    System.out.print("Enter c:");
    c = s.nextInt();
    d = b * b - 4 * a * c;
    if (d == 0){
     	System.out.println("x1 = x2 ="+ (-b/(2*a)));
    }
    if (d > 0){
	x1 = (-b + Math.sqrt(b))/2 * a;
        x2 = (-b - Math.sqrt(b))/2 * a;
        System.out.println("x1 = "+ x1);
        System.out.println("x2 = "+ x2);
     }	
    //'if' is redundant here
        else if (d < 0){
     	    System.out.println("Error");
             }
    }
}
