import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Table  {

    static double width;
    static double length;

    private final ArrayList<Ball> balls = new ArrayList<>();

    public Table(double width,double length){
        this.width = width;
        this.length = length;
    }
    public void addBall(Ball ball){
        balls.add(ball);
    }
    void run(double time,String output) throws IOException {
        while (time>0){
            for (Ball ball:balls) {
               ball.move(0.1);
                if(ball.x + ball.radius>=Table.length){
                    ball.vx *= -1;
                    System.out.println("Gndak@ kpav sahmanin X eri arancqov");
                }else if(ball.y + ball.radius>=Table.width){
                    ball.vy *= -1;
                    System.out.println("Gndak@ kpav sahmanin Y eri arancqov");
                }
            }
            for (int i = 0;i< balls.size();++i){
                for (int j = i+1;j<balls.size();++j){
                    Ball first = balls.get(i);
                    Ball second = balls.get(j);
                    if(first.didTouchBall(second) && (first.name.equals("simpleball")) && (second.name.equals("simpleball"))){
                        System.out.println("Simple and Simple");
                        first.updateAfterTouch(second);
                    }else if(first.didTouchBall(second)&& (first.name.equals("simpleball")) && second.name.equals("ghostball")){
                        System.out.println("Simple and Ghost");
                        first.updateAfterTouchGhost(second);
                    }
                    else if(first.didTouchBall(second)&& (first.name.equals("simpleball")) && second.name.equals("bombball")){
                        System.out.println("Simple and Bomb");
                        first = null;
                        second = null;
                    }
                    else if(first.didTouchBall(second) && first.name.equals("bombball") && second.name.equals("ghostball")){
                        System.out.println("Bomb and Ghost");
                        first.updateAfterTouchGhost(second);
                    }
                    else if(first.didTouchBall(second) && first.name.equals("ghostball") && second.name.equals("ghostball")){
                        System.out.println("Ghost and Ghost");
                        first.updateAfterTouchGhost(second);
                    }
                    else if(first.didTouchBall(second) && first.name.equals("bombball") && second.name.equals("bombball")){
                        System.out.println("Bomb and Bomb");
                        first = null;
                        second = null;
                    }
                }
            }
            time-=0.1;
        }
        System.out.println("End");
        FileWriter writer = new FileWriter(output);
        BufferedWriter bf = new BufferedWriter(writer);
        for (Ball ball:balls){
            String ballstring = ball.x + "," + ball.y + "," + ball.vx + "," + ball.vy + "," +  ball.name;
            bf.write(ballstring);
            bf.newLine();
        }
        bf.close();
    }
}
