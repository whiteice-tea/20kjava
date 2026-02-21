package overrideex;

public class test {
    public static void main(String[] args) {
        person p1 = new person("jack",18);
        Student s1 = new Student("tom",15,1,100);
        System.out.println(s1.say());
        System.out.println(p1.say());
    }
}
