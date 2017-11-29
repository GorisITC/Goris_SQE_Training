import java.util.Scanner;
import java.io.File;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter please the path: ");
        Scanner s1=new Scanner(System.in);
        String userInput=s1.nextLine();

        String[] path = userInput.split(" ");
        File f1 = new File("/home/arus/" + path[1]+"/");

        System.out.println("Enter the 'ls' command to see the files in the corresponding path: ");
        Scanner s2=new Scanner(System.in);
        String ls=s2.next();

        if(ls.equals("ls")){
            String[] files=f1.list();
            for (int i = 0; i <files.length ; i++) {
                System.out.println(files[i]);
            }
        }else {
            System.out.println("command not found");
        }
    }
}
