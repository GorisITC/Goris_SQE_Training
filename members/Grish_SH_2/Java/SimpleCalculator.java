public class SimpleCalculator {
    public static void main(String[] args) {
        gumarum(5.5, 6);
        hanum(168, 6.5);
        bazmapatkum(12, 25);
        bajanum(5.6, 0);

    }

    public static double gumarum(double a, double b) {
        double c = a + b;
        System.out.println(c);
        return c;
    }

    public static int gumarum(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }

    public static int hanum(int a, int b) {
        int c = a - b;
        System.out.println(c);
        return c;
    }

    public static double hanum(double a, double b) {
        double c = a - b;
        System.out.println(c);
        return c;
    }

    public static double bazmapatkum(double a, double b) {
        double c = a * b;
        System.out.println(c);
        return c;
    }

    public static int bazmapatkum(int a, int b) {
        int c = a * b;
        System.out.println(c);
        return c;
    }

    public static double bajanum(double a, double b) {
        double c = a / b;
        if (b == 0) {
            System.out.println("Error");
            return b;
        }
        System.out.println(c);
        return c;
    }

    public static int bajanum(int a, int b) {
        int c = a / b;
        if (b == 0) {
            System.out.println("Error");
            return b;
        }
        System.out.println(c);
        return c;
    }
}

