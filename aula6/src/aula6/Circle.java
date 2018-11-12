/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author Turma A
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle(){
        super();
        this.radius = 0;
    }
    public Circle(double radius, Point position){
        super(position);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    @Override
    public double getArea() {
       return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
       return 2.0 * Math.PI * getRadius();
    }
    
}
