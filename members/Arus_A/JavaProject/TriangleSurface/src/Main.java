import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] p = new double[6];
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 0);

        for (int i = 0; i < p.length; i++) {
            p[i] = s.nextDouble();
            a = new Point(p[0], p[1]);
            b = new Point(p[2], p[3]);
            c = new Point(p[4], p[5]);
        }
        Triangle t1 = new Triangle();
        System.out.println(t1.trianglePerimeter(a, b, c));
        System.out.println(t1.triangleSurface(a, b, c));
    }
}
