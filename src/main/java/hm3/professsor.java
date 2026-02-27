package hm3;

public class professsor extends teacher{


    public professsor(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary);
        this.level=level;
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
