package overrideex;

public class Student extends person {
    private int id;
    private int score;

    public Student(String name,int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say(){
        return super.say()+"\tid:"+id+"\tscore:"+score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
