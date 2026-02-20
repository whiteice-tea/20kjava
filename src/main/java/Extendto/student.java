package Extendto;

public class student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void print() {
        System.out.println("Name: " + name+"\nAge: " + age+"\nScore: " + score);
    }
}
