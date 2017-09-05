public class PairNumbers {
    public static void main(String[] argss){
        int num = 0;
        int [][]a  = {{1,5,6},{2,3,4},{3,1,9}};
        for (int i = 0; i <a.length; i++) {
            if ((a[i][i] % 2 == 0) && (i == i)){
                num++;
            }
        }
        System.out.println(num);
    }
}
