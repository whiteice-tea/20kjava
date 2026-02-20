package extend02;

public class Base {
    public int n1=100;
    protected int n2=200;
    int n3=300;
    private int n4=400;

    public Base() {
        System.out.println("Base Constructor");
    }
    public void test100(){
        System.out.println("Base test100");

    }
    protected void test200(){
        System.out.println("Base test200");
    }
     void test300(){
        System.out.println("Base test300");
    }
    private void test400(){
        System.out.println("Base test400");
    }

    public int getN4(){
        return n4;
    }
}
