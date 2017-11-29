import sun.management.HotspotMemoryMBean;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String currentPath = System.getProperty("user.home");
        Scanner scanner = new Scanner(System.in);
        File file = new File(currentPath);
        while (true) {
            System.out.print(file.getPath() + ":~$ ");
            String command = scanner.nextLine();
            if (command.startsWith("cd ")) {
                String fileName = command.replaceAll("cd ","");
                if (fileName.equals("..")) {
                    file = file.getParentFile();
                } else {
                    File file1 = new File((file.getPath().endsWith("/") ? file.getPath() : file.getPath() + "/") + command.replaceAll("cd ", "").trim());
                    if (file1.exists() && file1.isDirectory()) {
                        file = file1;
                    } else System.out.println("--Command not found--");
                    currentPath = file.getPath();
                }
            }
            if (command.equals("pwd")){
                System.out.print(currentPath + "\n");
            }
            if (command.equals("ls")) {
                ls(file);
            }
            if (command.startsWith("touch ")) {
                touch(file,command.replaceAll("touch ",""));

            }
            if (command.startsWith("mkdir ")) {
                mkdir(file,command.replaceAll("mkdir ",""));

            }

        }

    }
    private static void ls(File file) {
        String[] files = file.list();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
    private static void touch (File file,String name) throws IOException {
        File newFile  =  new File(file.getPath() + "/" + name);
        if(!newFile.exists()){
            newFile.createNewFile();
        }
    }
    private static void mkdir (File file,String name) throws IOException {
        File newFile = new File(file.getPath() + "/" + name);
        if (!newFile.exists()) {
            newFile.mkdir();
        }
    }
}
