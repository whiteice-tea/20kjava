package Change_Pass;

import java.util.ArrayList;
import java.util.List;

public class account {
    double balance;
    List<Record> records = new ArrayList<>();
    public account(double balance) {
        this.balance = balance;
    }
    //收入
    public void addamount(double money,String time,String note) {
        if (money <=0 ) {
            System.out.println("Invalid money");
            return;
        }else{
            balance += money;
            records.add(new Record("收入入账",money,time,note,balance));
        }
    }
    //支出
    public void pay(double money, String time, String note) {
        if (money <= 0) {
            System.out.println("Invalid money");
            return;
        }
        if (money > balance) {
            System.out.println("Insufficient money");
            return;
        }
        balance -= money;
        records.add(new Record("消费", -money, time, note, balance));  // ✅ 存负数
    }
    //显示明细
    public void showRecords(){
        System.out.println("--------------------零钱通明细--------------------");
        if(records.isEmpty()){
            System.out.println("暂无交易记录");
        }
        for (Record r : records) {
            System.out.println(r);
        }
    }

    public double getBalance(){
        return balance;
    }

}
