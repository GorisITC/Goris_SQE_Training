import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerSimple {
    public static void main(String[] args) {
      try {
          Scanner path = new Scanner(System.in);
          System.out.println("Enter your folder path");
          File a = new File(path.nextLine());
          System.out.println("Enter your output file path");
          File c = new File(path.nextLine());
          FileWriter e = new FileWriter(c);
          BufferedWriter f = new BufferedWriter(e);
          if(a.isDirectory()){
              File[] b = a.listFiles();
              for (int i = 0; i<b.length; i++){
                  f.write(b[i].getName() + " " + b[i] + " ");
                  f.newLine();
              }
              f.flush();
          }
          System.out.println("Done");
      } catch (IOException q){
          q.getCause();
      }
    }
}

//C:\Users\christine\Desktop\New folder
//‪C:\Users\christine\Desktop\Input.txt