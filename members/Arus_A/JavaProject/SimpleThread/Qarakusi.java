public class Qarakusi extends Thread {
    @Override
    public void run() {
        for (int j = 10; j > 0; j--) {
            System.out.println("");
            for (int i = 0; i < 10; i++) {
                System.out.print("* ");
            }
        }
    }
}
