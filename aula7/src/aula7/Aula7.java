/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 *
 * @author Turma A
 */
public class Aula7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(b.className());
        Derived d = new Derived();
        System.out.println(d.className());
        d.testCalls();
    }
    
}
