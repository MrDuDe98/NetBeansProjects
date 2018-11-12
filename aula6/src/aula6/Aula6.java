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
public class Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car carro =  new Car(2018, "Ford", "Fiesta", 20000, "Blue");
        carro.toString();
        System.out.println(carro.toString());
        Motorcycle moto =  new Motorcycle(2018, "Yamaha", "MT-09", 10500, "Race-blue");
        moto.toString();
        System.out.println(moto.toString());
    }
    
}
