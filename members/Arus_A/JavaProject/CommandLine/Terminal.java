import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Terminal {

    public void run() {
        Scanner userInput = new Scanner(System.in);
        String fullPath = System.getProperty("user.home");
        String command = userInput.nextLine();
        String[] path;
        File f1 = new File(fullPath);
        String[] newFileName;
        boolean exit = false, back = false;

        while (exit != true) {
            String[] exactCommand = command.split(" ");
            if (exactCommand[0].equals("cd")) {
                Commands com = Commands.cd;
                try {
                    if (com == Commands.cd) {
                        path = command.split(" ");
                        if (!path[1].startsWith("..")) {
                            fullPath = f1.getPath() + "/" + path[1] + "/";
                            f1 = new File(fullPath);
                            if (f1.exists() && f1.isDirectory()) {
                                System.out.println(fullPath);
                            } else {
                                f1 = f1.getParentFile();
                                System.out.println("no such file or directory");
                            }
                        } else if (path[1].endsWith("..")) {
                            f1 = f1.getParentFile();
                            System.out.println(f1);

                            back = true;
                        } else {
                            System.out.println("no such file or directory");
                        }
                    }
                    command = userInput.nextLine();
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.getMessage();
                    command = userInput.nextLine();
                }
            } else if (command.equals("pwd")) {
                Commands com = Commands.pwd;
                if (com == Commands.pwd && back == false) {
                    System.out.println(f1);
                    command = userInput.nextLine();
                } else if (back == true) {
                    System.out.println(f1);
                    command = userInput.nextLine();
                }
            } else if (command.equals("ls")) {
                Commands com = Commands.ls;
                try {
                    if (com == Commands.ls) {
                        String[] files = f1.list();
                        for (int i = 0; i < files.length; i++) {
                            if (files[i].startsWith(".")) {
                                continue;
                            } else {
                                System.out.println(files[i]);
                            }
                        }
                    } else {
                        System.out.println("ls: cannot access " + "'" + exactCommand[1] + "':" + " No such file or directory");
                    }
                } catch (NullPointerException e) {
                    e.getMessage();
                }
                command = userInput.nextLine();
            } else if (exactCommand[0].equals("mkdir")) {
                Commands com = Commands.mkdir;
                try {
                    if (com == Commands.mkdir) {

                        newFileName = command.split(" ");
                        File newFile = new File(f1.getPath() + "/" + newFileName[1] + "/");
                        if (!newFile.exists()) {
                            newFile.mkdir();
                            f1 = newFile;
                        } else if (newFile.exists()) {
                            System.out.println("cannot create directory " + "'" + newFileName[1] + "':" + " File exists");
                        }
                        command = userInput.nextLine();
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("mkdir: missing operand");
                    command = userInput.nextLine();
                }
            } else if (exactCommand[0].equals("touch")) {
                try {
                    Commands com = Commands.touch;
                    try {
                        if (com == Commands.touch) {

                            newFileName = command.split(" ");
                            File newFile = new File(f1.getPath() + "/" + newFileName[1] + "/");
                            if (!newFile.exists()) {
                                newFile.createNewFile();
                                f1 = newFile;
                            } else if (newFile.exists()) {
                                System.out.println("cannot create directory " + "'" + newFileName[1] + "':" + " File exists");
                            }
                            command = userInput.nextLine();
                        }
                    } catch (IOException e) {
                        System.out.println("touch: missing file operand");
                        command = userInput.nextLine();
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("touch: missing file operand");
                    command = userInput.nextLine();
                }
            } else if (command.equals("exit")) {
                Commands com = Commands.exit;
                if (com == Commands.exit) {
                    exit = true;
                }
            } else {
                System.out.println("command not found");
                command = userInput.nextLine();
            }
        }
    }
}