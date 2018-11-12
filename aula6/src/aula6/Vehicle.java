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
public abstract class Vehicle {
    private int year;
    private String brand;
    private String model;
    private double price;
    private String color;
    
       public Vehicle() {
        this.year = 0;
        this.brand = "";
        this.model = "";
        this.price = 0;
        this.color = "";
        
    }
      public Vehicle(int year, String brand, String model, double price, String color) {
          this.year = year;
          this.brand = brand;
          this.model = model;
          this.price = price;
          this.color = color;
      }
      
      public int getYear() {
        return year;
    }
      public String getBrand(){
        return brand;
    }
      public String getModel(){
        return model;
    }  
      public double getPrice(){
        return price;
    }
      public String getColor(){
        return color;  
    }
    
      public void setYear(int newYear){
          year = newYear;
    }
      public void setBrand(String newBrand){
          brand = newBrand;
    }
        public void setModel(String newModel){
          model = newModel;
    }  
        public void setPrice(double newPrice){
          price = newPrice;
    }  
        public void setColor(String newColor){
          color = newColor;
    }
           
       @Override
    public String toString() {
       return "(" + getYear() + ", " + getBrand() + ", " + getModel() + ", " + getPrice() + ", " + getColor() + ")";
    }
    
}
