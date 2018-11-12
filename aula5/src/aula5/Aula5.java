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
public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator c = new Calculator();

        c.add(20);

        System.out.println(c.getValue());
        c.setValue(10);
        c.remove(20);
        System.out.println(c.getValue());
        Math.sqrt(2);
        
// ficha de exercicios aula 5
        Point p2 = new Point();
        System.out.println(p2.getX());
        Point p1 = new Point(3,3);
        System.out.println(p1.getX());
        p1.setX(2);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        p1.setY(4);
        System.out.println(p1.getY());
        p1.setXandY(10, 6);
     
        System.out.println(p1.toString());
        
        double calcDistance = p1.calculateDistance(p2);
        System.out.println(calcDistance);
        
        // exercice Triangle
        Point pointA = new Point (0,0);
        Point pointB = new Point (4,0);
        Point pointC = new Point (0,4);
        Triangle t1 = new Triangle(pointA, pointB, pointC);
        Triangle t2 = new Triangle();
        String str = t1.toString();
        String str2 = t2.toString();
        System.out.println(str);
        System.out.println(str2);
        double calcLength = t1.calcBase();
        double calcH = t1.calcHeight();
        System.out.println(calcLength);
        System.out.println(calcH);
        double calcA = t1.calcArea();
       
        Object obj = new Object();
    }

}