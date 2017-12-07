import java.util.Arrays;

public class Main_ParzTver {
    public static void main(String args[]) {
        int qanak = 30;
        int zangN=0;
        String str;
        int[] zang = new int[qanak];

        for (int i = 1; i < zang.length; i++) {
            String war = "simple";
            System.out.println("i=" + i);

            for (int j = 5; j < zang.length-1; j++) {
                System.out.println("j="+j);
                if (i % j == 0 || i%(j-2)==0 || i%(j-3)==0 && i!= j && j!=1) {
                    war = "not simple number";
                    System.out.println("j=" + j);
                    break;
                }

            if (war.equals("simple")) {
                zang[zangN] = i;
                System.out.println("hi");
                zangN++;
                break;
            }
        }
        }
        str = Arrays.toString(zang);
        System.out.println(str);
    }
}