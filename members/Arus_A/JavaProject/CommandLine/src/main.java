import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.File;

public class main {
    public static void main(String[] args) throws UnknownHostException {

        Scanner userInput = new Scanner(System.in);
        String fullPath = System.getProperty("user.home");
        String command = userInput.nextLine();
        String[] path;
        File f1=new File(fullPath);

        while (true) {
            if (command.startsWith("cd")) {
                path = command.split(" ");
                fullPath = f1.getPath() + "/" + path[1] + "/";
                f1 = new File(fullPath);
                if(path[1].equals("..")){
                    f1 = f1.getParentFile();
                    f1=f1.getParentFile();
                }
                if(f1.exists() && f1.isDirectory()){
                    System.out.println(f1);
                } else {
                    f1=f1.getParentFile();
                    System.out.println("no such file or directory");
                }
                command = userInput.nextLine();
            }

            else if (command.startsWith("ls")) {
                    String[] files = f1.list();
                try{
                for (int i = 0; i < files.length; i++) {
                    if (files[i].startsWith(".")) {
                        continue;
                    } else {
                        System.out.println(files[i]);
                    }
                }
            }
            catch (NullPointerException e){
                e.getMessage();
            }
                command = userInput.nextLine();
            } else if (command.startsWith("pwd")) {
                if (f1.exists() && f1.isDirectory()) {
                    System.out.println(f1);
                } else {
                    System.out.println(f1.getParentFile());
                }
                command = userInput.nextLine();
            } else if (command.startsWith("mkdir")) {
            //    mkdir(file)
                command = userInput.nextLine();
            } else if (command.startsWith("touch")) {

            } else {
                System.out.println("command not found");
                System.exit(0);
            }

        }

        // public static void mkdir(File file, String name)
        /** First try
         *  System.out.println("Enter please the path: ");
         Scanner s1=new Scanner(System.in);
         String userInput=s1.nextLine();

         String[] path = userInput.split(" ");
         String fullPath=System.getProperty("user.home")+"/" + path[1]+"/";
         File f1 = new File(fullPath);

         System.out.println("Enter the 'ls' or 'pwd' commands to see the files in the corresponding path or to define the current path: ");
         Scanner s2=new Scanner(System.in);
         String command=s2.next();

         //   Scanner s3=new Scanner(System.in);

         if(command.equals("ls")){
         String[] files=f1.list();
         for (int i = 0; i <files.length ; i++) {
         System.out.println(files[i]);
         }
         //     command=s3.next();
         }else if (command.equals("pwd")){
         System.out.println(fullPath);
         //    command=s3.next();
         }
         else{
         System.out.println("command not found");
         }**/
    }
}
