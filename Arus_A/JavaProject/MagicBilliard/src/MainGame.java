import java.io.IOException;

public class MainGame {
    public static void main(String[] args) throws IOException{
        Read.Kardal();
        GamePlay.run(1000);
        GameOverWrite.Grel();

/** read args from Run-> Edit Configurations
 ** args - width: 1000 height: 1000 time: 50
 ** files - input: NewStartBalls.scv output: end_balls.csv*/
        int width=100;
        int height=100;
        double time=0.0;
        String input=null;
        String output=null;

        for (int i = 0; i <args.length ; i++) {
            if(args[i].equals("width:")){
                width=Integer.valueOf(args[++i]);
                System.out.println(args[i-1]+" "+width);
            }
            if(args[i].equals("height:")){
                height=Integer.valueOf(args[++i]);
                System.out.println(args[i-1]+" "+height);
            }
            if(args[i].equals("time:")){
                time=Double.valueOf(args[++i]);
                System.out.println(args[i-1]+" "+time);
            }
            if(args[i].equals("input:")){
                input=args[++i];
                System.out.println(args[i-1]+" "+input);
            }if(args[i].equals("output:")){
                output=args[++i];
                System.out.println(args[i-1]+" "+output);
            }
        }
    }

}
