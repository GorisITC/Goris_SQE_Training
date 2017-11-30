import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Terminal {

    private static File file = new File(System.getProperty("user.home"));
    private static Scanner input;
    private static String command;
    private static boolean terminal = true;

    public static void main(String[] args) {
        System.out.print(file.getPath() +":" +
        		"~$ ");
        input = new Scanner(System.in);
        String command = input.nextLine();
        while (terminal == true) {
            if (command.equals("ls")) {
                ls(file);
                command = input.nextLine();
            } else if (command.equals("pwd")) {
                pwd(file);
                command = input.nextLine();
            } else if (command.startsWith("cd")) {
                cd(command);
                command = input.nextLine();
            } else if (command.startsWith("mkdir ")) {
                mkdir(command);
                command = input.nextLine();
            } else if (command.startsWith("touch ")) {
                try {
                    touch(command);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                command = input.nextLine();
            } else if (command.equals("close")) {
                close();
            } else {
                System.out.println("Command not found.");
                System.out.print(file.getPath() +" :~$ ");
                command = input.nextLine();
            }
        }
    }

    public static void ls(File file) {
        String[] files = file.list();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
        System.out.print(file.getPath() +":~$ ");
    }

    public static void pwd(File file) {
        System.out.println(file.getPath());
        System.out.print(file.getPath() +":~$ ");
    }

    public static void cd(String command) {
    	if (command.length() > 3 && command.startsWith("cd ")) {
            String newPath = "/" + command.substring(3);
            File newFile = new File(file.getPath() + newPath + "/");
            file = newFile;
        } else if (command.equals("cd")) {
            file = new File(System.getProperty("user.home"));
        } else {
            System.out.println("Command not found.");
        }
        System.out.print(file.getPath() +":~$ ");
    }

    public static void mkdir(String command) {
        String newPath = "/" + command.substring(6);
        File newFile = new File(file.getPath() + newPath + "/");
        if (!newFile.exists()) {
            newFile.mkdir();
        }
        file = newFile;
        System.out.print(file.getPath() +":~$ ");
    }

    public static void touch(String command) throws IOException {
        String newPath = "/" + command.substring(6);
        File newFile = new File(file.getPath() + newPath + "/");
        if (!newFile.exists()) {
            newFile.createNewFile();
        }
        System.out.print(file.getPath() +":~$ ");
    }

    public static void close() {
        terminal = false;
    }

}