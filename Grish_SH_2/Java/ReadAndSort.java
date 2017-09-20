import java.io.*;

public class ReadAndSort {
    public static void main(String[] args) {
        File anunner  = new File("/home/grish/Desktop/Anunner.txt");
        String b ;
        try {
            String name = "";
            FileReader reader = new FileReader(anunner);
            BufferedReader ff = new BufferedReader(reader);
            String a = "";
            while ((a = ff.readLine()) != null) {
                name += a + ",";
            }
            String[] names = name.split(",");
            for (int i = 0; i < names.length; i++) {
                for (int j = i + 1; j < names.length; j++) {
                    if (names[i].compareTo(names[j]) > 0) {
                        b = names[i];
                        names[i] = names[j];
                        names[j] = b;
                    }
                }
            }
            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }

        }catch (FileNotFoundException e){

        }catch (IOException e ){

        }

    }
}
