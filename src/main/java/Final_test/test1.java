package Final_test;



public class test1 {
    public static void main(String[] args) {
        outer outer = new outer();
        outer.show();
        Person person = new Person();
        person.say();


    }
}


class outer{
    private int n1=10;
    public void show(){
        Person person = new Person(){
            public String name="hello";
            @Override
            public void say(){
                System.out.println(name);
                super.say();
            }
        };
        person.say();
    }

}

class Person{
    private String name="fuck you";
    public void say(){
        System.out.println(name);
    }
}