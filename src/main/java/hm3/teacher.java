package hm3;

public class teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double level;


    public teacher(String name, int age, String post, double salary, double level) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }

    public double getSalary() {
        return salary;
    }
    public double getLevel(){
        return level;
    }

    public void introduce() {
        System.out.println("教师名字：" + name + "教师年龄：" + age + "教师职称：" + post + "教师工资" + salary + "level:" + level  );
    }
}
