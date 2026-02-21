package extend02;

public class Sub extends Base{
    public Sub(){
        super();//默认调用父类的无参构造器
        System.out.println("Sub");
    }
    //非私有的属性和方法可以直接访问，私有的要通过公共的方法去询问
    //super在使用时候，必须放在构造器第一行

    //super和this都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
    public Sub(String name){
        super(0);//指定使用哪个父类的构造器
        System.out.println("Sub,"+name);
    }

    public void Sayok(){
        System.out.println(n1+" "+n2+" "+n3+" "+getN4());
    }

}
