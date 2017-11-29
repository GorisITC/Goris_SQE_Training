import java.io.File;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args){
        File current = new File("C:\\");
        System.out.println(current.getPath());
        String command = null;
        while (true){
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            if(command.startsWith("cd")){
                if(command.contains("..")){
                    current = new File(String.valueOf(current.getParentFile()));
                }   String string = command.substring(3);
                    File secondFile = new File(current.getPath() + "\\" + string);
                    if (!secondFile.exists() || !secondFile.isDirectory()) System.out.println("No such file or directory:" + string );
                    else current = secondFile;
                    System.out.println(current.getPath());
            }else if(command.equals("ls")){
                String [] files = current.list();
                if(files.length==0){
                    System.out.println("Your folder is Empty");
                }
                for (int i = 0;i<files.length;i++){
                    System.out.println(files[i]);
                }
            }else if(command.equals("pwd")){
                System.out.println(current.getPath());
            }else {
                System.out.println("Please input valid command");
            }
        }
    }
}



