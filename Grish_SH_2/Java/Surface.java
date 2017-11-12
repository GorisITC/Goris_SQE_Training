public class Surface {
    public static void main(String[] args) {
        surface(4, 6, 2, 9);
        surface(10, 3, 2, 2, 2, 2);
        surface(4, 2, 5, 5, 2, 2, 4, 14);

    }

    public static double surface(int x1, int x2, int y1, int y2) {
        if (x1 == x2 && y1 == y2) {
            int Area = 0;
            System.out.println("The Area of a Circle  " + Area);
            return Area;
        }
        double length = Math.sqrt((x1 - x2) * (x1 - x2) + (y2 - y1) * (y2 - y1));
        double radius = length / 2;
        double CircleArea = (3.14159 * (radius * radius));
        System.out.println("The Area of a Circle  " + CircleArea);
        return CircleArea;
    }

    public static double surface(int x1, int x2, int y1, int y2, int x3, int y3) {
        if ((x1 == x2 && x2 == x3 && x1 == x3) || (y1 == y2 && y2 == y3 && y1 == y3)) {
            int Area = 0;
            System.out.println("The Area of a Triangle  " + Area);
            return Area;
        }
        double length1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y2 - y1) * (y2 - y1));
        double lenght2 = Math.sqrt((x2 - x3) * (x2 - x3) + (y3 - y2) * (y3 - y2));
        double lenght3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y3 - y1) * (y3 - y1));
        double KisaParagic = ((length1 + lenght2 + lenght3) / 2);
        double TriangleArea = Math.sqrt(KisaParagic * (KisaParagic - length1) * (KisaParagic - lenght2) * (KisaParagic - lenght3));
        System.out.println("The Area of a Triangle  " + TriangleArea);
        return TriangleArea;
    }

    public static double surface(int x1, int x2, int y1, int y2, int x3, int y3, int x4, int y4) {
        if (x1 != x4 && x2 != x3 && y4 != y3 && y2 != y1) {
            int Square = 0;
            System.out.println("The Area of a Square  " + Square);
            return Square;
        }
        double length1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y2 - y1) * (y2 - y1));
        double length2 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double length3 = Math.sqrt((x3 - x4) * (x3 - x4) + (y3 - y4) * (y3 - y4));
        double length4 = Math.sqrt((x4 - x1) * (x4 - x1) + (y4 - y1) * (y4 - y1));
        double length = length1 = length2 = length3 = length4;
        double SquareArea = (length * length);
        System.out.println("The Area of a Square  " + SquareArea);
        return SquareArea;
    }
}
