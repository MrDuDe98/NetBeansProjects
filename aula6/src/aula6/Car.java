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
public class Car extends Vehicle{
     
 
    public Car() {
        super();
    } 
    
    
     public Car( int year, String brand, String model, double price, String color) {
            super(year, brand, model, price, color); 
    }
     
           @Override
    public String toString() {
       return "(" + getYear() + ", " + getBrand() + ", " + getModel() + ", " + getPrice() + ", " + getColor() + ")";
    }
}
