/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.instigatemobile.magicbilliard;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author areg.gareginyan
 */
public class Table {
    
    private double width;
    private double length;
    private final ArrayList<Ball> balls = new ArrayList<>();
    
    public Table(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    void run(double time, String output) throws IOException {
        while (time > 0) {
            for (Ball ball : balls) {
                ball.move(0.1);
            }
            for (int i = 0; i < balls.size(); ++i) {
                for (int j = i + 1; j < balls.size(); ++j) {
                    Ball first = balls.get(i);
                    Ball second = balls.get(j);
                    if (first.didTouchBall(second)) {
                        System.out.println("URAX BAN");
                        first.updateAfterTouch(second);
                    }
                }
            }
            time -= 0.1;
        }
        System.out.println("verj");
        FileWriter writer = new FileWriter(output);
        BufferedWriter bf = new BufferedWriter(writer);
        for (Ball ball: balls) {
            String ballString = ball.x + "," + ball.y + "," + ball.vx + "," 
                    + ball.vy + "," + ball.name;
            bf.write(ballString);
            bf.newLine();
        }
        bf.close();
    }

    
}
