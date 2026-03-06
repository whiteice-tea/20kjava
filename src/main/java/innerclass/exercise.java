package innerclass;

public class exercise {
    public static void main(String[] args) {

        //当作实参直接传递，简洁高效
        f1(new IL(){
            @Override
            public void show(){
                System.out.println("Hello World");
            }
        });

        //传统方法
        f1(new hello());

    }
    //静态方法，形参是接口类型
    public static void f1(IL il){
        il.show();
    }
}

//接口

interface IL{
    int a=10;//接口里的属性默认是 public static final
    void show();//接口里的方法默认是 public abstract
}

class hello implements IL{
    @Override
    public void show(){
        System.out.println("Hello World,tradition");
    }
}