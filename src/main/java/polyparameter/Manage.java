package polyparameter;

public class Manage extends employee {
    private double bonus;
    private String manage;

    public Manage(String name, double salary, double bonus, String manage) {
        super(name, salary);
        this.bonus = bonus;
        this.manage = manage;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getManage() {
        return manage;
    }

    public void setManage(String manage) {
        this.manage = manage;
    }

    @Override
    public double getAnnual(){
        return (getSalary()*12)+getBonus();
    }

    public void manage(){
        System.out.println(getManage());
    }
}
