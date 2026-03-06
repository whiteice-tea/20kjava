package anonymousinnerclass;


//演示匿名内部类


public class test {
    public static void main(String[] args) {
        outer outer = new outer();
        outer.method();

    }
}

class outer{
    private int n1=10;
    public void method(){
        //基于接口的匿名内部类
        //使用IA接口，并创建对象
        //传统：写一个类，实现接口，并创建对象
        //需求是只是使用一次，后面不再使用
//        IA dog=new dog();
//        dog.cry();
        //可以使用匿名内部类
        /*底层
        class dog$1 implements IA{
            @Override
            public void cry() {
                System.out.println("dog");
            }
        }
        jdk底层在创建匿名内部类outer$1，马上就创建了outer$1实例，并且
        把地址返还给dog
        匿名内部类使用一次，就不能再使用

         */

        IA dog=new IA(){
            @Override
            public void cry(){
                System.out.println("dog");
            }
        };
        dog.cry();


        //演示基于类的匿名内部类
        //（“jack”）参数列表会传递给构造器
        Father father = new Father("jack"){
            @Override
            public void test(){
                System.out.println("father rementhod");
            }
        };
        father.test();

        //基于抽象类的匿名内部类
        Animal animal=new Animal(){
            @Override
            void method(){
                System.out.println("animal method");
            }
        };
    }
}

interface IA{
    public void cry();
}
//class dog implements IA{
//    @Override
//    public void cry() {
//        System.out.println("dog");
//    }
//}



class Father{
    public Father(String name){
        super();
        System.out.println(name);
    }
    public void test(){
        System.out.println("father");
    }

}

abstract class Animal{
    abstract void method();
}