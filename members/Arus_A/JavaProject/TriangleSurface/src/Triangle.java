public class Triangle {

    double p;
    double ab;
    double bc;
    double ac;

    public double trianglePerimeter(Point a, Point b, Point c) {
        ab = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
        bc = Math.sqrt(Math.pow((c.x - b.x), 2) + Math.pow((c.y - b.y), 2));
        ac = Math.sqrt(Math.pow((c.x - a.x), 2) + Math.pow((c.y - a.y), 2));
        p = ab + bc + ac;
        return p;
    }

    public double triangleSurface(Point a, Point b, Point c) {
        double ps = p / 2;
        double s = Math.sqrt(ps * (ps - ab) * (ps - bc) * (ps - ac));
        return s;
    }
}
