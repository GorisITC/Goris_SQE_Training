import java.awt.*;
import java.util.Iterator;

class PolygonShape extends Shapes{
    public void draw(java.util.List list, Graphics g){
        Point point=null;
        Iterator it=list.iterator();
        if(list.size()<3){
            return;
        }
        Polygon p=new Polygon();
        for(;it.hasNext();){
            point=(Point)it.next();
            p.addPoint((int)point.getX(),(int)point.getY());
        }
        g.fillPolygon(p);
        list.clear();
    }
}
