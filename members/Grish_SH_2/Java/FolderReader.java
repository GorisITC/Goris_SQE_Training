import java.io.*;

public class FolderReader {
    public static void main(String[] args) {
        File folder = new File("Folder path");
        try {
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    StringBuilder sb = new StringBuilder();
                    int count = 1;
                    String line;
                    while ((line = reader.readLine()) != null) {
                        sb.append(count++);
                        sb.append(". " + line + "\n");
                    }
                    reader.close();
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(sb.toString());
                    writer.flush();

                }
             }
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }

}
