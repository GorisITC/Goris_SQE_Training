public class Transparent extends Ball {
    public Transparent(int x, int y, int vx, int vy, String type){
        super(x, y, vx, vy, type);
    }
    @Override
    public void updateAfterTouch(Ball ball){
        System.out.println("Balls continues their way without any change.");
        System.exit(0);
    }
}
