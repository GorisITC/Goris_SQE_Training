import com.sun.org.apache.xpath.internal.SourceTree;

public class Street {
    String s_name;
    int MaxSpeed;
    Car c;
    Aragachap a;


    public void setCar(int speed, String name, String brand){
        this.c=new Car();
        c.setCar(speed, name, brand);
    }

    public void setAragachap(int MaxSpeed){
        this.a=new Aragachap();
        a.setAragachap(MaxSpeed);
        a.nkarel(c);
    }
}