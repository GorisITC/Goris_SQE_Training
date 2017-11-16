/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.instigatemobile.magicbilliard;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author areg.gareginyan
 */
public class Game {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        double width = 0.0;
        double height = 0.0;
        double time = 0.0;
        String input = null;
        String output = null;
        
        for (int i = 0; i < args.length; ++i) {
            if (args[i].equals("--width")) {
                width = Double.valueOf(args[++i]);   
            }
            if (args[i].equals("--height")) {
                height = Double.valueOf(args[++i]);
            }
            if (args[i].equals("--time")) {
                time = Double.valueOf(args[++i]);
            }
            if (args[i].equals("--input")) {
                input = args[++i];
            }
            if (args[i].equals("--output")) {
                output = args[++i];
            }          
        }
        
        // java Game --width 1000 --height 1000 --time 50 --input start_balls.csv --output end_balls.csv
        
        Table table = new Table(width, height);
        
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            Ball ball = null;
            double x = Double.valueOf(values[1]);
            double y = Double.valueOf(values[2]);
            double vx = Double.valueOf(values[3]);
            double vy = Double.valueOf(values[4]);
            String name = values[5];
            if (values[0].equals("simple")) {
                ball = new Ball(x, y, vx, vy, 1, name);
            } else if (values[0].equals("bomb")) {
                ball = new Bomb(x, y, vx, vy, 1, name);
            } else if (values[0].equals("ghost")) {
                ball = new Ghost(x, y, vx, vy, 1, name);
            }
            table.addBall(ball);
        }
        
        table.run(time, output);
        
        
        
    }
    
}
