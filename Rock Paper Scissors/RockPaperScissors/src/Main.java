import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Scanner is used for the input of the user
        Scanner scanner = new Scanner(System.in);

        // this list is for the choices in which the computer can generate from (later used in the random generator)
        String[] choices = {"rock", "paper", "scissor"};

        // the user's input is forced to lower case and it is assigned to the string user choice
        String userChoice = "";

        // to establish the wins and looses of the player
        int wins = 0;
        int losses = 0;

        // the while loop for the whole interactive parts of the game
        while (!userChoice.equals("q")) {
            if (userChoice.equals("q")) {
                break;
            }

            // the interface (+ instructions)
            System.out.println("Let's play Rock, Paper, Scissors! \n Type 'r' for rock, 'p' for paper, or 's' for scissors or 'q' to quit \n *************************************************************************");

            // the scores
            System.out.println("\t \t \t Player Wins: " + wins + "\t Losses: " + losses);


            for(;;) {
                // the interface (question)
                System.out.println("Rock Paper or Scissors?  ");

                // the user's input is forced to lower case and it is assigned to the string user choice
                userChoice = scanner.nextLine().toLowerCase();

                if (userChoice.equals("r")
                        || userChoice.equals("p")
                        || userChoice.equals("s")
                        || userChoice.equals("q")) {
                    break;
                }
                System.out.println("Invalid choice, try again.");


                // a switch (similar to if statements) that only stops when the right inputs are typed, r or p or s or q and assigns the inputs to a full name
                String choice;
                switch (userChoice) {
                    case "p":
                        choice = "paper";
                        break;
                    case "s":
                        choice = "scissor";
                        break;
                    case "r":
                        choice = "rock";
                        break;
                    default:
                        choice = "invalid";
                        break;
                }
            }

            // random is used for the computer's choice in this game
            Random random = new Random();

            // in this case, it pulls out the choices string list to be randomized here: between rock paper and scissor
            int computerIndex = random.nextInt(choices.length);
            // then the choice is assigned to the string computerChoice
            String computerChoice = choices[computerIndex];


            // these following conditions are what determines if you win or the computer wins by applying the Rock Paper Scissors game rules,
            // there are basically three results: you win, no one wins and the computer wins, since the conditions for your win and no one wins is already laid out, the rest of the conditions are the wins of computers
            if (userChoice.equals(computerChoice)) {
                System.out.println("No one wins, try again! \n");

                System.out.println("Player> " + userChoice + " vs. " + computerChoice + " <Computer \n \n \n");

            } else if ((userChoice.equals("r") && computerChoice.equals("scissor"))
                    || (userChoice.equals("p") && computerChoice.equals("rock"))
                    || (userChoice.equals("s") && computerChoice.equals("paper"))) {

                System.out.println("Congrats! You won :> \n");
                System.out.println("Player> " + userChoice + " vs. " + computerChoice + " <Computer \n \n \n");

                // to add the num of wins
                wins++;

            } else {
                System.out.println("Computer wins :< \n");
                System.out.println("Player> " + userChoice + " vs. " + computerChoice + " <Computer \n \n \n");

                // to add the num of losses
                losses++;
            }

        }

        System.out.println("Game ended" );
        // so that it doesn't run forever
        scanner.close();
    }
}