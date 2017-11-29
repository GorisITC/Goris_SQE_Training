public class Triangle {
    public double areatriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((x1 == x2 && x2 == x3 && x1 == x3) || (y1 == y2 && y2 == y3 && y1 == y3)) {
            double Area = 0;
            System.out.println("The Area of a Triangle  " + Area);
            return Area;
        }
        double TriangleArea = (1/2)*(x1*(y2 - y3 )+x2*(y3 - y1) + x3*(y1 - y2));
        System.out.println(TriangleArea);
        return TriangleArea;
    }
    public boolean pointintriangle(double x1, double y1, double x2, double y2, double x3, double y3,double px,double py) {
        if ((x1 == x2 && x2 == x3 && x1 == x3) || (y1 == y2 && y2 == y3 && y1 == y3)) {
            System.out.println("The is no Triangle");
            return false;
        }
        double area = 1 / 2 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        double area1 = 1 / 2 * (px * (y1 - y2) + x1 * (y2 - py) + x2 * (py - y1));
        double area2 = 1 / 2 * (px * (y2 - y3) + x2 * (py - y3) + x3 * (py - y2));
        double area3 = 1 / 2 * (px * (y1 - y3) + x1 * (py - y3) + x3 * (py - y1));
        if (area == area1 + area2 + area3) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}