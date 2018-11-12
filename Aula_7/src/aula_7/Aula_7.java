/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_7;

import java.util.Scanner;

/**
 *
 * @author Turma A
 */
public class Aula_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printCommands();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza um comando: ");
        String line = scanner.nextLine();
        Menu.Command command = Menu.Command.valueOf(line);
        
        menu.selectCommandIf(command);
        

    }
    
}
