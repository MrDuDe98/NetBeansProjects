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
public class Rectangle {
     private Point topLeftPoint;
     private double height;
     private double width;

public Rectangle(){
    this.topLeftPoint = new Point();
    this.height = 0;
    this.width = 0;
}

public Rectangle(Point topLeftPoint, double height, double width){
    this.topLeftPoint = topLeftPoint;
    this.height = height;
    this.width = width;
}
public Point gettopLeft() {
        return topLeftPoint;
    }
public double getHeight(){
    return height;
}
public double getWidth(){
    return width;
}
public void setTopLeft(Point newTopLeftPoint){
    topLeftPoint = newTopLeftPoint;
}
public void setHeigth(double newHeight){
    height = newHeight;
}
public void setWidth(double newWidth){
    width = newWidth;
}
}
