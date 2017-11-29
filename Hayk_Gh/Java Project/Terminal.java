import java.io.File;
import java.util.*;

public class Terminal {
    public static void main(String[] args){
        File firstly = new File("C:\\");
        System.out.println(firstly.getPath());
        File moveright = null;
        File current = null;
        File after = null;
        Scanner[] array = new Scanner[50];
        for (int n = 0; n < array.length; n++) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            if(command.startsWith("cd")) {
                String substring = command.substring(3);
                after = new File(substring);
                moveright = new File(firstly.getPath() + "/" + after.getPath());
                System.out.println(moveright.getPath());
                firstly = moveright;
                System.out.println();
            } else if (command.equals("ls") && firstly.exists()) {
                String[] files = firstly.list();
                if (files.length == 0) {
                    System.out.println("The folder is Empty");
                }
                for (int i = 0; i < files.length; i++) {
                    System.out.println(files[i]);
                }
                System.out.println();
            }
            else if (command.equals("pwd")) {
                current = new File(firstly.getPath());
                System.out.println(current.getPath());
            }
            else {
                System.out.println("Please input valid command");
            }
        }
    }
}


