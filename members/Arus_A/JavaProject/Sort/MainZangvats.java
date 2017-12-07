import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainZangvats {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int n=10;
        int [] s=new int[n];
        int temp;
        String str;

        System.out.println("Enter " + n + " numbers Please:");
        for (int i=0; i<s.length; i++) {
            s[i] = scanner.nextInt();
        }

        for (int j=0;j<s.length-1;j++){
            for (int p = 0; p <s.length-1; p++) {
                if (s[p] < s[p + 1]) {
                    temp = s[p+1];
                    s[p+1] = s[p];
                    s[p] = temp;
                }
            }
        }

        str= Arrays.toString(s);
        System.out.println(str);
    }
}
