import com.sun.org.apache.bcel.internal.generic.ARETURN;
import sun.plugin2.message.GetAppletMessage;

import java.awt.geom.Area;

public class Calculator {
    public static void main(String[] args) {

        try {
            System.out.println(gumarum(2147483647, 18));
        } catch (ArithmeticException diapason) {
            System.out.println(diapason.getMessage());
        }


        try {
            System.out.println(hanum(0.00001, 999999999));
        } catch (ArithmeticException diapason) {
            System.out.println(diapason.getMessage());
        }

        try {
            System.out.println(bazmapatkum(999999999, 999999999));
        } catch (ArithmeticException diapason) {
            System.out.println(diapason.getMessage());
        }

        try {
            System.out.println(bajanum(1, 0));
        } catch (ArithmeticException zero) {
            System.out.println(zero.getMessage());
        }
    }

    public static double gumarum(double a, double b) {
        if ((long) a + b > Double.MAX_VALUE || (long) a + b < Double.MIN_VALUE) {
            throw new ArithmeticException("Out of 'int' diapason: a + b");
        }
        double c = a + b;
        return c;
    }

    public static int gumarum(int a, int b) {
        if ((long) a + b > Integer.MAX_VALUE || (long) a + b < Integer.MIN_VALUE) {
            throw new ArithmeticException("Your result օut of 'int' diapason: a + b");
        }
        int c = a + b;
        return c;
    }

    public static int hanum(int a, int b) {
        if ((long) a - b > Integer.MAX_VALUE || (long) a - b < Integer.MIN_VALUE) {
            throw new ArithmeticException("Your result is out of 'int' diapason: a - b");
        }
        int c = a - b;
        return c;
    }

    public static double hanum(double a, double b) {
        if ((long) a - b > Double.MAX_VALUE || (long) a - b < Double.MIN_VALUE) {
            throw new ArithmeticException("Your result is out of 'double' diapason: a - b");
        }
        double c = a - b;
        return c;
    }

    public static double bazmapatkum(double a, double b) {
        if ((long) a * b > Double.MAX_VALUE || (long) a * b < Double.MIN_VALUE) {
            throw new ArithmeticException("Your result is out of 'double' diapason: a * b");
        }
        double c = a * b;
        return c;
    }

    public static int bazmapatkum(int a, int b) {
        if ((long) a * b > Integer.MAX_VALUE || (long) a * b < Integer.MIN_VALUE) {
            throw new ArithmeticException("Your result is out of 'int' diapason: a * b");
        }
        int c = a * b;
        return c;
    }

    public static double bajanum(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by zero: a !/ 0");
        }
        double c = a / b;
        return c;
    }

    public static int bajanum(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by zero: a !/ 0");
        }
        int c = a / b;
        return c;
    }
}
