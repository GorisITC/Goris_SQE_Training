import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/arus/Desktop/PordzPPPPPPP.txt");
        file.createNewFile();

        FileWriter wr=new FileWriter(file);
        wr.write("barev dzeez");
        wr.flush();
        wr.close();
    }
}
