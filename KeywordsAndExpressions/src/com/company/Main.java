package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        String nameOne = "Jordan";
        String nameTwo = "Birdy";
        String nameThree = "Grant";
        String nameFour = "Joe";

        displayHighScorePosition(nameOne, calculateHighScorePosition(1500));
        displayHighScorePosition(nameTwo, calculateHighScorePosition(900));
        displayHighScorePosition(nameThree, calculateHighScorePosition(400));
        displayHighScorePosition(nameFour, calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        }
        else if (score >= 500){
            return 2;
        }
        else if (score >= 100) {
            return 3;
        }
        else {
            return 4;
        }
    }
}
