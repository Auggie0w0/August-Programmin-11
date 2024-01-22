import java.text.SimpleDateFormat;
import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    @Override
    public String toString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat ( "EEE MMM ddd HH:mm:ss z yyyy");
        return "Deposit of: $" + amount + " Date: " + dateFormat.format ( date ) + " into account: " + account;
    }
}
