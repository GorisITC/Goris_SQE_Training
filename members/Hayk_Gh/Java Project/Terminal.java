import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Terminal {

    static File current = new File(System.getProperty("user.home"));
    static String command = null;

   static void cd(String command) {
        if (command.startsWith("cd")) {
            if (command.contains("..")) {
                current = new File(String.valueOf(current.getParentFile()));
            }
            String string = command.substring(3);
            File secondFile = new File(current.getPath() + "\\" + string);
            if (!secondFile.exists()) {
                System.out.println("No such folder or directory:" + string);
            } else {
                current = secondFile;
            }
            System.out.println(current.getPath());
        }
    }

   static void ls(File file) throws Exception {
        String[] files = current.list();
        if(current.isDirectory()) {
            if (files.length == 0) {
                System.out.println("Your folder is Empty");
            }
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        }else {
            throw new Exception("This is not Directory");
        }
    }

    static void pwd(File file) {
        System.out.println(current.getPath());
    }

    static void mkdir(String command) {
        if (command.startsWith("mkdir")) {
            String command1 = command.substring(6);
            File file = new File(Terminal.current.getPath() + "\\" + command1);
            file.mkdir();
            current = file;
            System.out.println(current.getPath());
        }
    }

    static void touch(String command) throws IOException {
        if (command.startsWith("touch")) {
            String command1 = command.substring(6);
            File file = new File(Terminal.current.getPath() + "\\" + command1);
            file.createNewFile();
            current = file;
            System.out.println(current.getPath());
        }
    }

   public static void main(String[] args) throws Exception {
        System.out.println(current.getPath());
        while (true) {
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            if (command.equals("ls")) {
                ls(current);
            } else if (command.startsWith("cd")) {
                cd(command);
            } else if (command.equals("pwd")) {
                pwd(current);
            } else if (command.startsWith("mkdir")) {
                mkdir(command);
            } else if (command.startsWith("touch")) {
                touch(command);
            }
        }
    }
}




