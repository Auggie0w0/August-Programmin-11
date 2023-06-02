import java.util.*;
public class iterations {
    public static void main(String[] args) {
        int hotdogCount = 0;
        double hotdogPrice = 2.50;
        int drinkCount = 0;
        double drinkPrice = 1.25;
        double totalCost = 0;
        double payment = 0;
        Scanner scan = new Scanner(System.in);

        do  {
            System.out.println("How many hotdogs would you like to buy");
            hotdogCount = Integer.parseInt(scan.next());
        } while (hotdogCount < 0);

        totalCost += hotdogCount*hotdogPrice;

        do {
            System.out.println("How many drinks would you like to buy?");
            drinkCount = Integer.parseInt(scan.next());
        } while (drinkCount < 0);

        totalCost += drinkPrice*drinkCount;
        System.out.println("You have to pay " + totalCost);
        System.out.println("How would you like to pay?");
        payment = Double.parseDouble(scan.next());
        if(payment > totalCost) {
            System.out.println("Your change is " + (payment - totalCost));
        } else if (payment == totalCost) {
            System.out.println("Exact change way to go");
        } else {
            System.out.println("Not enough money you owe us " + (totalCost - payment));
        }
    }
}
