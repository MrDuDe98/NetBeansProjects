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
public class Calculator {
    private double value;

public Calculator(){
    value = 0.0;
}
public double getValue(){
    return value;
}
public void setValue(double newValue){
    value = newValue;
}
public void clear(){
    value = 0.0;
}
public void add(double term){
    value += term;
}
public void remove(double term) {
    value -= term;
}
}