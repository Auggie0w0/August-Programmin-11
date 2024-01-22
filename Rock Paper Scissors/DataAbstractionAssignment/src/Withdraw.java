import java.text.SimpleDateFormat;
import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    @Override
    public String toString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat ( "EEE MMM dd HH:mm:ss z yyyy");
        return "Withdrawal of: $"+ amount + " Date: " + dateFormat.format(date) + " from account: " + account;
    }
}
