public class CalculatorWithoutAnyIssue {

    public static void main(String[] args) {

        //try {
        System.out.println("Gumar = " + sum(5, 2));
        // } catch (Exception q) {
        //      q.getMessage();

        System.out.println("Artadryal = " + bazm(9, 9));
        try {
            System.out.println(baj(9, 0));
        } catch (ArithmeticException e) {
            e.getMessage();
        }
        System.out.println("Hanum = " + han(-9, 1));

    }

    public static int sum(int a, int b) {
        // if ((a > -2147483648 && a < 2147483647) && (b > -2147483648 && b < 2147483647))
        // return a + b;
        //  else

        //  try {
        //       return a + b;
        //  } catch (Exception q) {
        //       System.out.println("Sahmanic durs");
        return a + b;
    }

    public static int bazm(int a, int b) {
        return a * b;
    }

    public static int baj(int a, int b) {
        System.out.println("Bazhanum = ");
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("\"Can't divide on 0\"");
        }
        return a / b;
    }

    public static int han(int a, int b) {
        return a - b;
    }
}
