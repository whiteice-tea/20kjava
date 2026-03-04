package interfacete;

public interface alnterface {

    public int n1=10;
    public  void hi();
    //接口中抽象方法可以省略abstract

    //实现静态默认方法可以使用default或者static
    default public void ok(){
        System.out.println("ok");
    }

    public static void cry(){
        System.out.println("cry");
    }
}
//接口不能被实例化
//接口中所有的方法都是public方法，接口中抽象方法，可以不用abstract修饰
//一个普通类实现窗口，就必须将该接口的所有方法都实现，可以用alt+enter来解决
//接口不能继承其他的类，但可以继承别的接口

