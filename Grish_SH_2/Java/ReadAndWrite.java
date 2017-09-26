import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) {
        try {
            Scanner a = new Scanner(System.in);
            System.out.print("Please enter your folder path: ");
            File folder = new File(a.nextLine());
            System.out.print("Please enter the file path where you want to write something: ");
            File file = new File(a.nextLine());
            if (!file.exists()) {
                System.out.println("There is no existing file to write something");
            }
            a.close();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            File[] listOfFiles = folder.listFiles();
            bw.write("Your file path is :" + file.getAbsolutePath() + "\n");
            for (int i = 0; i < listOfFiles.length; i++) {
                String name = listOfFiles[i].getName();
                String extention = "";
                int j = name.lastIndexOf('.');
                if (j >= 0) {
                    extention = name.substring(j + 1);
                }
                bw.write("File name is: " + listOfFiles[i].getName() + "   extension " + "(" + extention + ")" + "\n");
            }
            bw.close();
        } catch (NullPointerException e) {

        } catch (IOException e) {

        }
    }
}
