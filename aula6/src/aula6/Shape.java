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
public abstract class Shape {
    private Point position; 
    
    public Shape(){
        this.position = new Point();      
    }
    
    public Shape(Point position){
        this.position = position;      
    }
    public Point getPosition() {
        return position;
    }
    public abstract double getArea();
      
    public abstract double getPerimeter();       
    
    public void setPosition(Point newPosition){
        position = newPosition;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Point other = (Point)obj;
//    }
//  public int compareTo(Point o) {
//      int subX = this.x - o.x;
//      int subY = this.y - o.y;
//      return subX + subY;
//  }
}
