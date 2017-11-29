public class Diagonal {
    public static void main(String[] argss){
        int matrix [][] = {{2,4,6},{3,5,7},{1,2,3}};
        int sum = 0;
        int a = 0;
        int mijintvabanakn;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                if(i+j > matrix.length-1){
                    a++;
                    sum+=matrix[i][j];
                }
            }
        }
        mijintvabanakn = sum/a;
        System.out.println(mijintvabanakn);
    }
}
