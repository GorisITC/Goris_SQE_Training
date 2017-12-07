import java.awt.*;
import java.util.Iterator;

class TriangleShape extends Shapes {
    public void draw(java.util.List list,Graphics g){
        Point point=null;
        Iterator it=list.iterator();
        if(list.size()<3){
            return;
        }
        Polygon p=new Polygon();
        for (int i = 0; i < 3; i++) {
            point=(Point)it.next();
            p.addPoint((int)point.getX(), (int)point.getY());
        }
        g.drawPolygon(p);
        list.clear();
    }
}
