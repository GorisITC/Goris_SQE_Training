public class Circle {
    public double areacircle(double o1, double o2,double y1, double y2) {
        if (o1 == o2 && y1 == y2) {
            double Area = 0;
            System.out.println("The Area of a Circle  " + Area);
            return Area;
        }
        double length = Math.sqrt((o1 - o2) * (o1 - o2) + (y2 - y1) * (y2 - y1));
        double radius = length / 2;
        double CircleArea = (3.14159 * (radius * radius));
        System.out.println("The Area of a Circle  " + CircleArea);
        return CircleArea;
    }
    public boolean pointincircle(double kentron1, double kentron2 , double y1, double y2,double px,double py){
        if (kentron1 == kentron2 && y1 == y2) {
            System.out.println("There is no Circle");
            return false;
        }
        double radius = Math.sqrt((kentron1 - kentron2) * (kentron1 - kentron2) + (y2 - y1) * (y2 - y1));
        double pointlength = Math.sqrt((kentron1 - px) * (kentron1 - px) + (y2 - py) * (y2 - py));
        if (pointlength > radius) {
            System.out.println(false);
            return false;
        }
        System.out.println(true);
        return true;
    }
}
