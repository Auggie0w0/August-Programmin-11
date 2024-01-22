//import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        this.deposits = new ArrayList<> (  );
        this.withdraws = new ArrayList<> (  );
        this.checkBalance = 0;
        this.savingBalance = 0;
        this.savingRate = 0;
        this.name = "";
        this.accountNumber = 0;
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
        this.deposits = new ArrayList<> (  );
        this.withdraws = new ArrayList<> (  );
    }

    /**
     * FOR ALL THE METHODS:
     * --------------------------
     * The amount of money to be deposited must be above 0 or else it will be invalid
     * @param amt += amt will add however much amount of money deposited into either Checkings or Savings
     *            -= amt will subtract however much amount of money withdrew from Checkings or savings
     * @param date refers to the current time (date) of the withdrawal/ deposit
     * @param account a string that specifies which account the withdrawal/ deposit is being made from (CHECKING or SAVING)
     * @return amount of money
     */

    public double deposit(double amt, Date date, String account){
        if (amt <= 0) {
            return 0; // invalid deposit amount :(
        }

        /**
         * withdrawal money from checking/ savings (subtracting amt = the amount of money withdrew)
         * the method bellow keeps a record of each withdrawal
         * @param deposit a new deposit will be added to the deposit class
         * @param checkBalance Checkings total balance
         * @param savingBalance Savings total balance
         */
        if(account.equalsIgnoreCase ( CHECKING )) {
            checkBalance += amt;
            deposits.add ( new Deposit ( amt,date,CHECKING ) );
        } else if (account.equalsIgnoreCase ( SAVING )) {
            savingBalance += amt;
            deposits.add(new Deposit ( amt,date,SAVING ));
        }
        return  amt;
    }
    public double withdraw(double amt, Date date, String account){
        if (amt <= 0 || checkOverdraft ( amt, account )) {
            return 0; // invalid deposit amount :(
        }
        /**
         * withdrawal money from checking/ savings (subtracting amt = the amount of money withdrew)
         * the method bellow keeps a record of each withdrawal while making sure it does not exceed Overdraft
         * @param withdraws a new withdrawal will be added to the withdraw class
         * @param checkBalance Checkings total balance
         * @param savingBalance Savings total balance
         */
        if(account.equalsIgnoreCase ( CHECKING )) {
            checkBalance -= amt;
            withdraws.add ( new Withdraw (amt,date,CHECKING ) );
        } else if (account.equalsIgnoreCase ( SAVING )) {
            savingBalance -= amt;
            withdraws.add(new Withdraw ( amt,date,SAVING ));
        }
        return  amt;
    }

    /**
     * Literal meaning - a method to prevent overdrafting upon a withdrawal
     * @return true if the withdrawal would cause overdraft (meaning the balance after withdrawal is less than the overdraft limit)
     *         false if the withdrawal does not cause overdraft (meaning the balance after withdrawal is more than the overdraft limit)
     */
    private boolean checkOverdraft(double amt, String account){
        if(account.equalsIgnoreCase ( CHECKING )){
            return (checkBalance - amt) < OVERDRAFT;
        } else if (account.equalsIgnoreCase ( SAVING )) {
            return (savingBalance - amt) < OVERDRAFT;
        }
        return false;
    }

    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
