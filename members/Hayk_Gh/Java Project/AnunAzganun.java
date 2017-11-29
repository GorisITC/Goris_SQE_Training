import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.*;

public class AnunAzganun {

    public static void main(String[] args) {

        try {
            kardacac("C:\\Users\\christine\\Desktop\\Input.txt");
        } catch (FileNotFoundException p) {

        } catch (IOException l) {

        } catch (NullPointerException f) {

        }
    }
    public static void kardacac(String path) throws FileNotFoundException, IOException,NullPointerException {

        File a = new File(path);
        FileReader b = new FileReader(a);
        BufferedReader c = new BufferedReader(b);
        String d = "";
        String tox = "";
        while ((d = c.readLine()) != null) {
            tox += d + ",";
            System.out.println(d);
        }
        int x = 0;
        String[] v = tox.split(",");
        for (int i = 0; i < v.length; i++) {
            for (int j = x; j < v.length - 1; j += 2) {
                if (v[j].compareToIgnoreCase(v[j + 1]) > 0) {
                    String u = v[j + 1];
                    v[j + 1] = v[j];
                    v[j] = u;
                }
            }
            if (x == 0) {
                x = 1;
            } else {
                x = 0;
            }
        }
        for (int j = 0; j < v.length; j++) {
            System.out.println(v[j]);
        }
    }
}












