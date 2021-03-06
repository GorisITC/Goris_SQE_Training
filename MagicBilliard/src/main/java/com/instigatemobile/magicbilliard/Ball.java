/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.instigatemobile.magicbilliard;

import static java.lang.Math.sqrt;

/**
 *
 * @author areg.gareginyan
 */
public class Ball {
    
    public double x;
    public double y;
    public double vx;
    public double vy;
    public double radius;
    public String name;
    
    public Ball(double x, double y, double radius, String name) {
        this.x = x;
        this.y = y;
        this.vx = 0;
        this.vy = 0;
        this.radius = radius;
        this.name = name;
    }
    
    public Ball(double x, double y, double vx, double vy, double radius, String name) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.radius = radius;
        this.name = name;
    }
    
    public void move(double time) {
        this.x += vx * time;
        this.y += vy * time;
    }
    
    public boolean didTouchBall(Ball ball) {
        double dx = this.x - ball.x;
        double dy = this.y - ball.y;
        double distance = sqrt(dx * dx + dy * dy);
        if (this.radius + ball.radius >= distance) {
            return true;
        } else {
            return false;
        }
    }
    
    public void updateAfterTouch(Ball ball) {
        this.vx = -this.vx;
        this.vy = -this.vy;
        ball.vx = -ball.vx;
        ball.vy = -ball.vy;
    }
    
}
