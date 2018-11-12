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
public class Menu {
    public enum Command{
        Start, SaveGame, LoadGame, HighScores, Quit;
    }


    public void printCommands(){
        Command[] commands = Command.values();
        for (int i = 0; i < commands.length; i++) {
            System.out.println(commands[i]);
        }
    }

    public void selectCommandSwitch(Command command){
        switch(command) {
                case Start:
                    System.out.println("Game Started");
                break;
                case SaveGame:
                    System.out.println("Game Saved!");
                break;
                case LoadGame:
                    System.out.println("Game Load!");
                break;
                case HighScores:
                    System.out.println("High Scores");
                break;
                case Quit:
                    System.out.println("Quit Game");
                break;
        }
    }

    public void selectCommandIf(Command command){
        if(command == Command.Start) {
            System.out.println("Game Started");
        }
        else if(command == Command.SaveGame){
            System.out.println("Game Saved!");
        }
        else if(command == Command.LoadGame){
            System.out.println("Game Load!");
        }
        else if(command == Command.HighScores){
            System.out.println("High Scores");
        }
        else if(command == Command.Quit){
            System.out.println("Quit Game");
        }
    }
}


