import java.io.*;

public class hamarakalel {

    public static void main(String[] args) throws IOException {
        File a = new File("/home/ubuntu/Desktop/folder/1");
        FileReader b = new FileReader(a);
        BufferedReader c = new BufferedReader(b);

        String tox;
        int hamar =0;
        while ((tox = c.readLine()) != null) {

            hamar++;

            System.out.println(hamar+" "+ tox);


        }

    }
}