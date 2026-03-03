package finallylt;

public class test {
    public static void main(String[] args) {

    }
}

//final 要求某类不能被其他类继承

//final class A{
//
//}
//
//class B extends A{}
class AA{

//    final 可以在定义时，构造器，代码块中赋值
    //而static final只能在定义时和静态代码块中赋值

    public final double tax=0.08;
    public final double tax2;
    public final double tax3;

    public AA(){
        tax2=0.07;
    }
    {
        tax3=0.08;
    }
}