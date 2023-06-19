package com.codecool.polishdraughts;

import com.codecool.polishdraughts.Util;
import com.codecool.polishdraughts.TerminalView;
import com.codecool.polishdraughts.PolishDraughts;

import java.io.File;
import java.io.IOException;

public class IntroScreen implements Screen {



    private boolean isMenuInputValid(String userInput) {
        return userInput.matches("^[1-9]$");
    }

    @Override
    public void display() {
        try {
            File fileTitle = new File("src/main/resources/gametitle.txt");
            Util.readFile(fileTitle);
        } catch (IOException ioe) {
            System.out.println("File does not exist!");
        }
    }

    public void menu() {
        System.out.println("\uD83D\uDC49\uD83C\uDFFBWelcome(!) to the Polish Draughts game");
        System.out.println(" 1️⃣ Rules of this battle\uD83D\uDCD4");
        System.out.println(" 2️⃣ Let's play \uD83C\uDFB8");
        System.out.println(" Tape anythink else - Exit! (So why are u here?)\uD83D\uDEB7");
        System.out.println();
        System.out.print("\uD83D\uDC49\uD83C\uDFFBChoose the number:");
        String userInput;
        boolean isInputValid;
        do {
            userInput = TerminalView.readInput("");
            isInputValid = isMenuInputValid(userInput);
            if (!isInputValid) System.out.print("\uD83D\uDC49\uD83C\uDFFBInvalid input. Please retry:");
        } while (!isInputValid);
        switch (userInput) {
            case "1":
                GameRules.gameRules();
                break;
            case "2":
                ;
                break;
            default:
                System.exit(0);
        }
    }
}





