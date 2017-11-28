import java.io.IOException;

public class MainGame {
    public static void main(String[] args) throws IOException{

/** read args from Run-> Edit Configurations
 ** args - width: 1000 height: 1000 time: 50
 ** files - input: NewStartBalls.scv output: end_balls.csv*/
        int width=0;
        int height=0;
        double time=0.1;
        String input=null;
        String output=null;

        for (int i = 0; i <args.length ; i++) {
            if(args[i].equals("TableWidth:")){
                width=Integer.valueOf(args[++i]);
                System.out.println(args[i-1]+" "+width);
            }
            if(args[i].equals("TableHeight:")){
                height=Integer.valueOf(args[++i]);
                System.out.println(args[i-1]+" "+height);
            }
            if(args[i].equals("GameTime:")){
                time=Double.valueOf(args[++i]);
                System.out.println(args[i-1]+" "+time);
            }
            if(args[i].equals("input:")){
                input=args[++i];
              //  System.out.println(args[i-1]+" "+input);
            }if(args[i].equals("output:")){
                output=args[++i];
              //  System.out.println(args[i-1]+" "+output);
            }
        }

        Read.readBallInfo(input);
        //Table t1=new Table(width,height);
        GamePlay g1=new GamePlay();
        g1.letsStart();
        g1.run(time);
        GameOverWrite.grel(output);
    }

}
