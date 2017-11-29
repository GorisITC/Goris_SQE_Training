import java.awt.*;
import java.util.Iterator;

class OvalShape extends Shapes {
    Point sPoint=null;
    Point ePoint=null;
    public void draw(java.util.List list, Graphics g){
        Iterator it =list.iterator();
        if(list.size()<2){
            return;
        }
        sPoint=(Point)it.next();
        ePoint=(Point)it.next();
        if(sPoint==null || ePoint==null){
            return;
        }
        else{
            g.fillOval((int)sPoint.getX(), (int)sPoint.getY(), (int)(ePoint.getX()-sPoint.getX()), (int)(ePoint.getY()-sPoint.getY()));
        }
        list.clear();
    }
}
