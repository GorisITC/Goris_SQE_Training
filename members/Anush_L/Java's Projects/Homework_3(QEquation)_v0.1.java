import java.lang.Math;
import java.util.Scanner;
class QEquation {

    public double Quadratic(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        double xa = (-b + Math.sqrt(b)) / 2 * a;
        double xb = (-b - Math.sqrt(b)) / 2 * a;
        if (d == 0) {
            return(-b / 2 * a);
        }
        if (d > 0){
            return (xa);
        }
        return (xb);
    }
    public double Quadratic(double a, double b) {
            //TBD: Add implementation here
        }

    public static void main (String[] args) {
        QEquation qe = new QEquation();
        qe.Quadratic(2,15,2);
    }
}
