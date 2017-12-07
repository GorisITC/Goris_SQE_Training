public class Aragachap {
    int MaxSpeed;

   public void setAragachap(int MaxSpeed){
       this.MaxSpeed=MaxSpeed;
   }

   public int getAragachap(){
       return MaxSpeed;
   }

   public void nkarel(Car car) {
       if (car.getSpeed() > MaxSpeed){
           System.out.println(car.getN());
           System.out.println(car.getBrand());
           System.out.println(car.getSpeed());
       }
       else {
           System.out.println("sagh normal a");
       }
   }
}
