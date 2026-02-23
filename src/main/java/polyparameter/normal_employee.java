package polyparameter;

public class normal_employee extends employee {
    private String work;

    public normal_employee(String name, double salary, String work) {
        super(name, salary);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public double getAnnual(){
        return super.getAnnual()+12000;
    }

    public void work(){
        System.out.println(getWork());
    }
}
