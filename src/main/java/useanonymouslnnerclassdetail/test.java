package useanonymouslnnerclassdetail;

public class test {
    public static void main(String[] args) {
        outer o1 = new outer();
        o1.f1();
    }
}
//匿名内部类

//外部其他类--不能访问---匿名内部类
//如果要访问外部类的成员，可以使用（外部类名.this.成员）去访问
class outer{
    private int n1=99;
    public void f1(){
        //这个是可重复调用写法
        //不能添加访问修饰符
        //作用域：仅仅定义在它的方法和代码块中
        Person p = new Person(){
            private int n2=100;
            @Override
            public void hi(){
                System.out.println("n1"+"内部n2="+n2+" 外部n1="+outer.this.n1);
            }
        };
        p.hi();

        //可以直接调用
        //这是一次性写法
        //只能调用一个
        new Person(){
            @Override
            public void hi(){
                System.out.println("n2");
            }

            @Override
            public void ok(String str){
//                System.out.println(str);
//                super.ok(str);
            }

        }.ok("nihao");

    }
}

class Person {
    public void hi(){
        System.out.println("hi");
    }
    public void ok(String str){
        System.out.println(str+"1");
    }
}

//抽象类/接口