package memberinnerclass;

public class test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.t1();

    }
}

class Outer{
    private int n1=10;
    public String name="test";

    class Inner{
        public void say(){
            System.out.println(n1+" "+name);
        }
    }

    public void t1(){
        Inner inner=new Inner();
        inner.say();
    }
}
