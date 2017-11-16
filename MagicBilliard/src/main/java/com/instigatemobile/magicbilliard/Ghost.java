/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.instigatemobile.magicbilliard;

/**
 *
 * @author areg.gareginyan
 */
public class Ghost extends Ball {
    
    public Ghost(double x, double y, double radius, String name) {
        super(x, y, radius, name);
    }
    
    public Ghost(double x, double y, double vx, double vy, double radius, String name) {
        super(x, y, vx, vy, radius, name);
    }
    
}
