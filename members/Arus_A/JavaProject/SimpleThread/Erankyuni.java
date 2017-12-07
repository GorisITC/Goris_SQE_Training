public class Erankyuni implements Runnable {
    @Override
    public void run(){
        for (int j = 0; j <10; j++) {
            System.out.println("");
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
        }
    }
}
