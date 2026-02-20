package extend02;

public class Sub extends Base{
    public Sub(){
        System.out.println("Sub");
    }
    //非私有的属性和方法可以直接访问，私有的要通过公共的方法去询问

    public void Sayok(){
        System.out.println(n1+" "+n2+" "+n3+" "+getN4());
    }

}
