public class CalculatorSimple {

    public static void main(String[] args) {

        System.out.println("Gumar = " + sum(5.0f, 6.0f));
        System.out.println("Artadryal = " + bazm(5.0f, 8.0f));
        System.out.println(baj(9.0f, 0.0f));
        System.out.println("Hanum = " + han(9.0f, 1.0f));

    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static float sum(float a, float b) {
        return a + b;
    }
    public static int bazm(int a, int b) {
        return a * b;
    }
    public static float bazm(float a, float b) {
        return a * b;
    }
    public static int baj(int a, int b) {
        if (b == 0) {
            System.out.print("Can't divide on ");
            return b;
        }
        System.out.println("Bazhanum = ");
        return a / b;
    }
    public static float baj(float a, float b) {
        if (b == 0) {
            System.out.print("Can't divide on ");
            return b;
        }
        System.out.println("Bazhanum = ");
        return a / b;
    }
    public static int han(int a, int b) {
        return a - b;
    }
    public static float han(float a, float b) {
        return a - b;
    }
}
