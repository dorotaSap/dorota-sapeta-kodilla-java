package com.kodilla.rps;

import java.util.Random;

public class RpsGame {
    private final String playerName;
    private final int roundsToWin;
    private int playerScore;
    private int computerScore;
    private boolean end;

    public RpsGame(String playerName, int roundsToWin) {
        this.playerName = playerName;
        this.roundsToWin = roundsToWin;
        this.playerScore = 0;
        this.computerScore = 0;
        this.end = false;
    }
    public boolean isEnd() {
        return end;
    }

    public void playRound(char playerChoice) {
        if (playerChoice == 'x') {
            end = true;
        } else if (playerChoice == 'n') {
            startNewGame();
        } else if (playerChoice >= '1' && playerChoice <= '3') {
            int computerChoice = new Random().nextInt(3) + 1;

            System.out.println("\n--- Wyniki rundy ---");
            System.out.println(playerName + " wybrał: " + convertToMove(playerChoice));
            System.out.println("Komputer wybrał: " + convertToMove((char) ((char) computerChoice + '0')));

            int result = checkWinner(playerChoice, computerChoice);
            if (result == 0) {
                System.out.println("Remis w rundzie!");
            } else if (result == 1) {
                System.out.println(playerName + " wygrywa rundę!");
                playerScore++;
            } else {
                System.out.println("Komputer wygrywa rundę!");
                computerScore++;
            }

            System.out.println("Wynik gry: " + playerName + " " + playerScore + " - Komputer " + computerScore);

            if (playerScore >= roundsToWin || computerScore >= roundsToWin) {
                end = true;
            }
        }
    }

    private String convertToMove(char choice) {
        return switch (choice) {
            case '1' -> "Kamień";
            case '2' -> "Papier";
            case '3' -> "Nożyce";
            default -> "";
        };
    }

    private int checkWinner(char playerMove, int computerMove) {
        if (playerMove == '1' && computerMove == 3 ||
                playerMove == '2' && computerMove == 1 ||
                playerMove == '3' && computerMove == 2) {
            return 1;
        } else if (playerMove == '1' && computerMove == 2 ||
                playerMove == '2' && computerMove == 3 ||
                playerMove == '3' && computerMove == 1) {
            return -1;
        } else {
            return 0;
        }
    }

    private void startNewGame() {
        this.playerScore = 0;
        this.computerScore = 0;
        this.end = false;
    }

    public void printGameResult() {
        if (playerScore >= roundsToWin) {
            System.out.println("\nGratulacje! " + playerName + " wygrał grę!");
        } else {
            System.out.println("\nKomputer wygrał grę. Spróbuj ponownie!");
        }
    }
}

