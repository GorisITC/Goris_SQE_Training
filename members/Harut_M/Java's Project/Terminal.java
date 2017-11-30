package com.company;

import javafx.scene.Parent;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Terminal {
    private static final String userName = System.getProperty("user.name");
    private static final String userHome = System.getProperty("user.home");
    private static File file = new File(userHome);
    public static void main(String[] args) throws UnknownHostException {

        String computerName = InetAddress.getLocalHost().getHostName();



        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(userName + "@" + computerName + ":" +
                    file.getPath().replaceFirst(userHome, "~") + "$ ");
            String command = scanner.nextLine();
            if (command.startsWith("ls")) {
                Terminal.shown(file, command.replaceAll("ls", ""));
            }
            if (command.startsWith("cd")){
                Terminal.move(file,command);

            }



        }

    }

    public static void shown(File file, String command) {

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
        public static void move(File file, String command){
        String space = command.substring(3);
         if (command.startsWith("cd")){
             if (command.contains(" ")&& command.contains(space)){

              File secondFile = new File(file.getPath()+"/"+space);
                    Terminal.file =secondFile;
             }

         }
            System.out.println(Terminal.file.getPath());

        }

        }

















