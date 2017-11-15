public class Main {
    public static void main(String []args){
        Visa v1=new Visa();
       // Master m1=new Master();
        v1.AddMoney(100);
        v1.CurrentCount();

        v1.GetMoney(1000);
        v1.CurrentCount();
    }
}
