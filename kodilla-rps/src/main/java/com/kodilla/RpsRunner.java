package com.kodilla;

import com.kodilla.rps.RpsGame;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoje imię: ");
        String playerName = scanner.nextLine();

        System.out.print("Podaj liczbę wygranych rund potrzebnych do zwycięstwa: ");
        int roundsToWin = scanner.nextInt();

        RpsGame game = new RpsGame(playerName, roundsToWin);
        while (!game.isEnd()) {
            System.out.println("\nKlawisze:");
            System.out.println("1 - Kamień");
            System.out.println("2 - Papier");
            System.out.println("3 - Nożyce");
            System.out.println("x - Zakończ grę");
            System.out.println("n - Rozpocznij nową grę");

            System.out.print("\nWybierz swój ruch: ");
            char playerChoice = scanner.next().charAt(0);

            game.playRound(playerChoice);
        }

        game.printGameResult();

        scanner.close();
    }
}