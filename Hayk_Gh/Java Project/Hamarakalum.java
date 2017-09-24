import java.io.*;

public class Hamarakalum {
    public static void main(String[] args) {
        File m = new File("C:\\Users\\Hayk\\Desktop\\Inputs");
        File[] files = m.listFiles();
        try {
            for (int i = 0; i < files.length; i++) {
                File a = new File(String.valueOf(files[i]));
                FileReader b = new FileReader(a);
                BufferedReader c = new BufferedReader(b);
                String text = "";
                String tox = "";
                int j = 0;
                while ((text = c.readLine()) != null) {
                    text += tox;
                    j++;
                    System.out.println(j + " " + text);
                }
                System.out.println();
            }
        }
        catch (IOException e) {
        }
    }
}
