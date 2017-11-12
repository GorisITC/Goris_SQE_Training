public class Car {
    int speed;
    String N;
    String brand;

    public void setCar(int speed, String N, String brand){
        this.speed=speed;
        this.N=N;
        this.brand=brand;
    }

    public int getSpeed(){
        return speed;
    }

    public String getN(){
        return N;
    }

    public String getBrand(){
        return brand;
    }

}
