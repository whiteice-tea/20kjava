package testtt;

public class Account {
    private String name;
    private double balance;
    private String password;



    public Account() {

    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=4){
            this.name = name;
        }else{
            System.out.println("name is too long(2-4),normal tt");
            this.name = "tt";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>20){
            this.balance = balance;
        }else{
            System.out.println("不够至少20, 0");
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()==6){
            this.password = password;
        }else{
            System.out.println("moren:123456");
        }

    }

    public void showac(String password){
        if(this.password==password){
            System.out.println("name:"+this.getName()+" balance:"+this.getBalance()+" password:"+this.getPassword());
        }else{
            System.out.println("alert");
        }
    }
}
