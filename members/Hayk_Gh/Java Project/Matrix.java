public class Matrix {

        public static void main(String[] args){
//1
            int i = 0;
            do {
                i++;
                System.out.print(i);
            }while(i !=3);
            if (i == 3)
                System.out.print("0");
//1
            System.out.println();
//2
            for ( i = 2;i<4;i++){
                System.out.print(i);
            }
            for (i = 0;i<2;i++){
                System.out.print(i);
            }
//2
            System.out.println();
//3
            System.out.print("3");
            for (i = 0;i<3;i++){
                System.out.print(i);
            }
//3
//4
            System.out.println();
            for(i = 0;i<4;i++){
                System.out.print(i);
                if (i == 4){
                    System.out.print("0");
                }
            }
//4
        }
}


