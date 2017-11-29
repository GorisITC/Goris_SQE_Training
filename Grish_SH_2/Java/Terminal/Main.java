import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String currentPath = "/home/grish/";
        Scanner scanner = new Scanner(System.in);
        File file = new File(currentPath);
        while (true) {
            System.out.print(file.getPath() + ":~$ ");
            String command = scanner.nextLine();
            if (command.contains("cd ")) {
                if (command.contains("..")) {
                    file = file.getParentFile();
                } else {
                    File file1 = new File((file.getPath().endsWith("/") ? file.getPath() : file.getPath() + "/") + command.replaceAll("cd ", "").trim());
                    if (file1.exists() && file1.isDirectory()) {
                        file = file1;
                    } else System.out.println("--No such file or directory--");
                    currentPath = file.getPath();
                }
            }
            if (command.equals("pwd")){
                System.out.print(currentPath + "\n");
            }
            if (command.equals("ls")) {
                ls(file);
            }
            if (command.equals("touch")) {
                touch(file);

            }

        }

    }

    private static void ls(File file) {
        String[] files = file.list();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
    private static void touch (File file) throws IOException {
        if(!file.exists()){
            file.createNewFile();
        }

    }

}
