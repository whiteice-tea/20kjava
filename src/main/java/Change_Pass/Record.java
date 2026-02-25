package Change_Pass;

public class Record {
    String type;//收入/支出
    double amount;//金额
    String time;//时间
    String note;//原因
    double balanceAfter;//交易后余额

    public Record(String type, double amount, String time, String note, double balanceAfter) {
        this.type = type;
        this.amount = amount;
        this.time = time;
        this.note = note;
        this.balanceAfter = balanceAfter;
    }
    @Override
    public String toString() {
        String sign = amount >= 0 ? "+" : "-";
        return type + " " + sign + Math.abs(amount) + " " + time + " " + note + " 余额:" + balanceAfter;
    }
}
