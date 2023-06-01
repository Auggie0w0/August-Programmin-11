import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Scanner is used for the input of the user
        Scanner scanner = new Scanner(System.in);

        // this list is for the choices in which the computer can generate from (later used in the random generator)
        String[] choices = {"Rock", "Paper", "Scissor"};

        // the interface (+ instructions)
        System.out.println("Let's play Rock, Paper, Scissors! \n Type 'r' for rock, 'p' for paper, or 's' for scissors:");

        // the user's input is forced to lower case and it is assigned to the string user choice
        String userChoice = scanner.nextLine().toLowerCase();

        // random is used for the computer's choice in this game
        Random random = new Random();

        // in this case, it pulls out the choices string list to be randomized here: between rock paper and scissor
        int computerIndex = random.nextInt(choices.length);
        // then the choice is assigned to the string computerChoice
        String computerChoice = choices[computerIndex];

        // the interface (question)
        System.out.println("Rock Paper or Scissors?  " + userChoice);

        // these following conditions are what determines if you win or the computer wins by applying the Rock Paper Scissors game rules,
        // there are basically three results: you win, no one wins and the computer wins, since the conditions for your win and no one wins is already laid out, the rest of the conditions are the wins of computers
        if (userChoice.equals(computerChoice)) {
            System.out.println("No one wins, try again! \n \n Your choice: ");

            System.out.print(userChoice);
            System.out.println(" \n Computer's choice: ");
            System.out.print(computerChoice);

        } else if ((userChoice.equals("r") && computerChoice.equals("Scissor"))
                || (userChoice.equals("p") && computerChoice.equals("Rock"))
                || (userChoice.equals("s") && computerChoice.equals("Paper"))) {

                System.out.println("Congrats! You won :> \n \n Your choice: ");
            System.out.print(userChoice);
            System.out.println(" \n Computer's choice: ");
            System.out.print(computerChoice);

        } else {
            System.out.println("Computer wins :< \n \n Your choice: ");

            System.out.print(userChoice);
            System.out.println(" \n Computer's choice: ");
            System.out.print(computerChoice);
        }

        // so that it doesn't run forever
        scanner.close();
    }
}