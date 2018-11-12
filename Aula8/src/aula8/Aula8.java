/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Turma A
 */
public class Aula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1000, "Pedro");
        Aluno a2 = new Aluno(1001, "Joaquim");
        Aluno a3 = new Aluno(1002, "Ana");
        Aluno a4 = new Aluno(1003, "David");
            
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>(); 
        
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        listaAlunos.add(a4);
        
        Collections.sort(listaAlunos, new ComparadorAluno());
    
        for(Aluno aluno : listaAlunos){
            System.out.println(aluno.toString());
        }
    
    
    }
    
}
