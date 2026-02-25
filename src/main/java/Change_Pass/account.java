package Change_Pass;

import java.util.ArrayList;
import java.util.List;

public class account {
    double balance;
    List<Record> records = new ArrayList<>();
    public account(double balance) {
        this.balance = balance;
    }

    public void addamount(double money,String time,String note) {
        if (money <=0 ) {
            System.out.println("Invalid money");
            return;
        }else{
            balance += money;
            records.add(new )
        }
    }
}
