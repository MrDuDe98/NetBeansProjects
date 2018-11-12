/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

import java.util.Comparator;

/**
 *
 * @author Turma A
 */
public class ComparadorAluno implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getName().compareTo(o2.getName());
    }

  
    
}
