package interclass;


//局部内部类
public class test {
    public static void main(String[] args) {
        outer outer = new outer();
        outer.m1();

    }
}


class outer{//外部类

    private int x=100;
    private void m2(){
        System.out.println("m2");
    }
    public void m1(){
        //局部内部类是定义在外部类的局部位置，通常在方法
        //不能添加修饰符，但是可以使用final修饰
        //作用域：仅仅在定义它的方法或代码块中
        class Inner{//局部内部类(本质是类）
            //可以访问外部类的所有成员，包括私有的
            private int x=200;
            public void f1(){
                System.out.println(x);
                //如果外部类和局部类重名，就近原则，如果想访问外部类的成员，使用 外部类名.this.成员 去访问
                System.out.println(outer.this.x);

                m2();
            }
        }
        //外部类在方法中，可以创建inner对像，然后调用方法即可
        Inner i=new Inner();
        i.f1();
    }
}