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
public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    /**
     * Construtor por omissão
     */
    public Triangle() {
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }

    /**
     * construtor por parametros
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    /**
     * set para alterar atributo A
     *
     * @param newA
     */
    public void setA(Point newA) {
        a = newA;
    }

    public void setB(Point newB) {
        b = newB;
    }

    public void setC(Point newC) {
        c = newC;
    }

    public void setAandBandC(Point newA, Point newB, Point newC) {
        a = newA;
        b = newB;
        c = newC;
    }

    @Override
    public String toString() {
        String str = a.toString() + " - " + b.toString() + " - " + c.toString();
        return str;
    }


    public double calcBase() {
        return b.calculateDistance(c);
    }

    double calcHeight() {
        return b.calculateDistance(a);
    }

    double calcArea() {
        double area = ((calcBase()*calcHeight())/2);
        return area;
    }
    
    
    
    
    
    
}
