public class Factorial {
    public static void main(String[] argss) {
        try {
            System.out.println(fact(-5));
        } catch (ArithmeticException minus) {
            System.out.println(minus.getMessage());
        }
    }

    public static int fact(int n) {
        if (n < 0) {
            throw new ArithmeticException("Incorrect input");
        }
        int factorial = 0;
        if (n == 0) {
            factorial = 1;
        } else {
            factorial = n * fact(n - 1);
        }
        return factorial;
    }
}
