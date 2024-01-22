import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("August Lam", 123456, 200.00, 1250.00);

        // Deposit into checking account
        customer.deposit(400.00, new Date(2022, 11, 04,0,0,0), Customer.CHECKING);
        // Deposit into savings account
        customer.deposit(500.00, new Date(2022,8,16,10,52,17), Customer.SAVING);

        // Display all deposits
        System.out.println("Deposits:");
        customer.displayDeposits();


        //------------------------------------------------------------------
        System.out.println ( "\n------------------------- \nWithdrawals:" );

        // Withdraw from checking account
        double withdrawnFromChecking = customer.withdraw(100.00, new Date(), Customer.CHECKING);
        if (withdrawnFromChecking == 0) {
            System.out.println("Overdraft Alert! Cannot withdraw from Checking account.");
        }

        // Withdraw from savings account
        double withdrawnFromSaving = customer.withdraw(2000.00, new Date(), Customer.SAVING);
        if (withdrawnFromSaving == 0) {
            System.out.println("Overdraft Alert! Cannot withdraw from Saving account.");
        }

        // Display all withdrawals
        System.out.println("\nSuccessful withdrawals:");
        customer.displayWithdraws();

    }
}