/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 * 
 *
 * @author Turma A
 */
public class Derived extends Base{
    @Override
    public String className(){
    return "Derived";
    
    }
    public void testCalls(){
        Base base = (Base)this;
        System.out.println("Through this : " + this.className());
        System.out.println("Through this : " + base.className());
        System.out.println("Through super : " + super.className());
    }
    
}

