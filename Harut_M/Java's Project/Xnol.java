import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.util.Scanner;

public class Xnol {
    public static void main(String[] args) {
        String[][] board = {{"*", "*", "*"}, {"*", "*", "*"}, {"*", "*", "*"}};
        Scanner input = new Scanner(System.in);
        int xa = 0;
        int xb = 0;
        int oa =0;
        int ob =0;

        String iks = "X";
        String nol = "O";

        while(true){
            System.out.println("tpi x-i a");
            int q = input.nextInt();
            xa = q;
            System.out.println("tpi x-i b");
            int t = input.nextInt();
            xb = t;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[xa][xb] = iks;
                    System.out.print("  " + board[i][j] + "  ");
                }

                System.out.println();
                System.out.println();

            }
            System.out.println("tpi y-i a");
            int l = input.nextInt();
            oa = l;
            System.out.println("tpi y-i b");
            int k = input.nextInt();
            ob = k;
            if(xa==oa && xb==ob){
                System.out.println("chi kareli");


            }else{
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[oa][ob] = nol;
                    System.out.print("  " + board[i][j] + "  ");
                }
                System.out.println();
                System.out.println();
            }


            }




            if (board[0][0]==iks && board[0][1]==iks && board[0][2]==iks ||
                    board[1][0]==iks && board[1][1]==iks && board[1][2]==iks ||
                    board[2][0]==iks && board[2][1]==iks && board[2][2]==iks ||
                    board[0][0]==iks && board[1][0]==iks && board[2][0]==iks ||
                    board[0][1]==iks && board[1][1]==iks && board[2][1]==iks ||
                    board[0][2]==iks && board[1][2]==iks && board[2][2]==iks ||
                    board[0][0]==iks && board[1][1]==iks && board[2][2]==iks ||
                    board[2][0]==iks && board[1][1]==iks && board[0][2]==iks ||
                    board[0][0]==nol && board[0][1]==nol && board[0][2]==nol ||
                    board[1][0]==nol && board[1][1]==nol && board[1][2]==nol ||
                    board[2][0]==nol && board[2][1]==nol && board[2][2]==nol ||
                    board[0][0]==nol && board[1][0]==nol && board[2][0]==nol ||
                    board[0][1]==nol && board[1][1]==nol && board[2][1]==nol ||
                    board[0][2]==nol && board[1][2]==nol && board[2][2]==nol ||
                    board[0][0]==nol && board[1][1]==nol && board[2][2]==nol ||
                    board[0][2]==nol && board[1][1]==nol && board[2][0]==nol

                    ){
                System.out.println("You win");
                break;}
        }


    }
}



