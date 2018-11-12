/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author Turma A
 */
public class Point {
    
    private double x;
    private double y;

    /**
     * construtor por omissão
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Construtor com parâmetros
     *
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double newX) {
        x = newX;
    }

    public void setY(double newY) {
        y = newY;
    }

    public void setXandY(double newX, double newY) {
        x = newX;
        y = newY;

    }

    public double calculateDistance(Point other) {
        double calcX = Math.pow(other.x - this.x, 2);
        double calcY = Math.pow(other.y - this.y,2);
        
        double distance = Math.sqrt(calcX+calcY);
        return distance;
    }

    @Override
    public String toString() {
        String str = "x: " + this.x + ", y: " + this.y;
        return str;
    }
    

}
