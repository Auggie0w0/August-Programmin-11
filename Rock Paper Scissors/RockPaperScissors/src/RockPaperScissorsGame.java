import java.util.Scanner;
import java.util.Random;

import static java.lang.Thread.sleep;

public class RockPaperScissorsGame {
    // so ppl know where the code starts, public - accessible everywhere, static - like the floor structure for the code, void - to return nothing
    public static void main(String[] args) {
        // so I can use the scanner and random
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // for the aesthetics and INSTRUCTIONS + rules of the game:)
        System.out.printf("You are now playing the Rock, Paper, Scissors game with the Computer :>\n *******************************************\n Enter your choice please: \n 1 for Rock \n 2 for Paper \n 3 for Scissors \n or 'Q' to quit%n");

        // setting up the score variables
        int wins = 0;
        int losses = 0;

//        -----------------------------------------------------------------------------------
        // the LOOP for the whole game!
        while (true) {

            //Aesthetic purposes
            System.out.println("\n -----------------------------------------------");

            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // the score updates
            System.out.println("\t \t \t Player Wins: " + wins + "\t Losses: " + losses + "\n");

            //for any user input
            System.out.println("Player Choice:");
            String userChoice = scanner.nextLine().toLowerCase();

            //for quiting the game
            if (userChoice.equals("q")) {
                System.out.println("You have quit the game, thank you for playing! I hope you had fun.");
                scanner.close();
                break;
            }

            //to establish the computer's choice: The random selection between 1, 2 or 3 (= rock paper or scissors)
            int computerChoice = random.nextInt(3)+1;

            //to establish that any of the user's inputs will be converted to a string
            int userIntChoice = Integer.parseInt(userChoice);

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //computer choice
            System.out.println("Player > " + getChoiceName(userIntChoice) + "\t vs. \t"+ getChoiceName(computerChoice) + "\t<Computer");

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //basically if establishes that the input HAS to be 1, 2 or 3 or else it will be invalid
            if (userIntChoice < 1 || userIntChoice > 3) {
                System.out.println("Invalid choice. Please enter 1 for Rock, 2 for Paper, and 3 for Scissors");
            }
            // (FINALLY) but here if it was a tie, meaning the input and random selection is the same
            else if (userIntChoice == computerChoice) {
                System.out.println("It's a tie!");
            }
            // then here is the list of the win combos
            else if (
                    (userIntChoice ==1 && computerChoice == 3) ||
                    (userIntChoice ==2 && computerChoice == 1) ||
                    (userIntChoice ==3 && computerChoice == 2)
            ) {
                wins += 1;
                System.out.println("Congrats, you have won against the computer! I am impressed.");
            }
            // for everything else, losses
            else {
                losses += 1;
                System.out.println("How unfortunate, but it seems that the computer has won yet again!");
            }

            // also for interactive game purposes, according to the internet: try and catch work "gracefully" together.
            // It is used for troubleshooting potential errors during the pause
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    // This is written outside the static void function and as its own so that I can pull this method conveniently
    //This is the part where the 3 randomly generated numbers are assigned to the string/ text versions - rock, paper and scissors
    public static String getChoiceName(int choice) {
        if (choice == 1) {
            return "Rock";
        } else if (choice == 2) {
            return "Paper";
        } else if (choice == 3) {
            return "Scissors";
        }
        return "invalid";
    }

}