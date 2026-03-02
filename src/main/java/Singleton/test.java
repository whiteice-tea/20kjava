package Singleton;
//单例模式
//单例模式（Singleton）就是：一个类在整个程序运行期间只允许有一个对象实例，并提供一个全局访问入口。
//
//常见用途：配置中心、日志器、线程池、数据库连接池管理器、缓存管理器等（这些东西通常不希望被 new 一堆）。
//你必须记住的 3 个点
//构造器私有：外部不能 new
//自己持有唯一实例
//对外提供获取实例的方法：getInstance()

//饿汉式
//1.私有化构造器
//2.在类的内部直接创建对象（对象是static）
//3.提供一个公共的static方法，返回对象
public class test {
    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        System.out.println(s1.getId());
        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s1 == s2);
    }
}
class Singleton{
    private String id;

    private static Singleton instance = new Singleton("BT-7274");
    private Singleton(String id) {
        this.id = id;
    }

    public static Singleton getInstance() {
        return instance;
    }
}

//懒汉式
//1.私有化构造器
//2.在类的内部直接创建对象（对象是static）
//3.提供一个公共的static方法，可以返回一个Singleton2对象
//4.只有用户使用时，才会返回对象，后面再次调用，会返回上一次创建的对象
class Singleton2{
    private String id;

    private static Singleton2 instance ;
    private Singleton2(String id) {
        this.id = id;
    }
    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2("BT-7274");
        }
        return instance;
    }
    public String getId() {
        return id;
    }
}