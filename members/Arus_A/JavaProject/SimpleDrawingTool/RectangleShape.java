import java.awt.*;
import java.util.Iterator;

class RectangleShape extends Shapes {
    Point sPoint=null;
    Point ePoint=null;
    public void draw(java.util.List list, Graphics g){
        Iterator it=list.iterator();
        //if the list does not contain the required two points, return.
        if(list.size()<2){
            return;
        }
        sPoint=(Point)it.next();
        ePoint=(Point)it.next();
        if(sPoint==null || ePoint==null){
            return;
        }
        else{
            g.drawRect((int)sPoint.getX(), (int)sPoint.getY(), (int)(ePoint.getX()-sPoint.getX()),(int)(ePoint.getY()-sPoint.getY()));
        } //end of if
        list.clear();
    }//end of draw for rectangle
}//rectangle
