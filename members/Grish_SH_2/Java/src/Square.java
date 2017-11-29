public class Square {

    public double areasquare(double x1, double x2, double y1, double y2, double x3, double y3, double x4, double y4) {
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
    public boolean pointinsquare(double x1, double x2, double y1, double y2, double x3, double y3, double x4, double y4, double px, double py){
        if (x1 != x4 && x2 != x3 && y4 != y3 && y2 != y1) {
            int square = 0;
            System.out.println("There is no square");
            return false;
        }
        double length1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y2 - y1) * (y2 - y1));
        double area = length1 * length1;
        double area1 = 1 / 2 * (x1 * (py - y2) + px * (y1 - y2) + x2 * (y1 - py));
        double area2 = 1 / 2 * (x1 * (py - y3) + px * (y1 - y3) + x3 * (y1 - py));
        double area3 = 1 / 2 * (x2 * (py - y4) + px * (y2 - y4) + x4 * (y2 - py));
        double area4 = 1 / 2 * (x3 * (py - y4) + px * (y3 - y4) + x4 * (y3 - py));
        if (area == area1 + area2 + area3 + area4) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

}
