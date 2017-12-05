package com.company;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class Terminal {
    private static final String userName = System.getProperty("user.name");
    private static final String userHome = System.getProperty("user.home");
    private static File file = new File(userHome);

    public static void main(String[] args) throws IOException {

        String computerName = InetAddress.getLocalHost().getHostName();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(userName + "@" + computerName + ":" +
                    file.getPath().replaceFirst(userHome, "~") + "$ ");
            String command = scanner.nextLine();
            if (command.startsWith("ls")) {
                Terminal.ls(file, command.replaceAll("ls", ""));
            }
            if (command.startsWith("cd")) {
                Terminal.cd(file, command);

            }
            if (command.startsWith("pwd")) {
                Terminal.pwd(command);
            }
            if (command.startsWith("touch")) {
                Terminal.touch(command);
            }
            if (command.startsWith("mkdir")) {
                Terminal.mkdir(command);
            }


        }

    }

    public static void ls(File file, String command) {

        File secondFile = file;
        if (command.length() > 0) {
            command = command.trim();
            if (command.startsWith("/") || command.startsWith("~")) {
                command = command.replaceAll("~", userHome);
                secondFile = new File(command);
            } else {
                secondFile = new File(file.getPath() + "/" + command.trim());
            }
            if (!secondFile.exists()) secondFile = file;
        }
        String[] content = secondFile.list();

        for (int i = 0; i < content.length; i++) {
            if (content[i].startsWith(".")) {
                if (command.replaceAll(" ", "").equals("-a"))
                    System.out.println(content[i]);
            } else {
                System.out.println(content[i]);
            }

        }


    }

    public static void cd(File file, String command) {
        String space = command.substring(3);

        if (command.startsWith("cd")) {
            if (command.contains(" ") && command.contains(space)) {
                if (space.startsWith("..")) {
                    File secondFile = new File(Terminal.file.getParent());
                    Terminal.file = secondFile;
                } else {
                    File secondFile = new File(file.getPath() + "/" + space);
                    if (!secondFile.exists() || !secondFile.isDirectory()) {
                        System.out.println("Command not found");
                    } else {
                        Terminal.file = secondFile;
                    }
                }
            }


        }
    }

    public static void pwd(String command) {
        if (command.length() > 3) {
            System.out.println("Command not found");
        } else {
            System.out.println(Terminal.file.getPath());
        }


    }

    public static void touch(String command) throws IOException {
        String newFile = command.substring(6);
        if (command.contains(" ") && command.contains(newFile)) {

            if (newFile.length() <= 0) {
                System.out.println("Command not found");
            }
            File secondFile = new File(Terminal.file.getPath() + "/" + newFile);
            if (secondFile.exists()) {
                System.out.println("You can't creat a file with" + " " + newFile + " " + "name");


            } else {
                secondFile.createNewFile();
            }


        }


    }

    public static void mkdir(String command) {
        String newFolder = command.substring(6);
        if (command.contains(" ") && command.contains(newFolder)) {
            File secondFile = new File(Terminal.file.getPath() + "/" + newFolder);
            if (!secondFile.exists()) {
                secondFile.mkdirs();
            } else {
                System.out.println("You can't create folders with same name  ");
            }


        }
    }
}




















