/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

/**
 *
 * @author Turma A
 */
public class Aluno implements Comparable<Aluno> {
    private int number;
    private String name;

    public Aluno(){
    
    }
    
    public Aluno(int number, String name){
    this.number = number;
    this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return this.number + ", " + this.name;
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        Aluno other = (Aluno)obj;
        return this.number == other.number;
    }


    
    
    @Override
    public int compareTo(Aluno o) {
        return this.number - o.number;
    }
    
}
