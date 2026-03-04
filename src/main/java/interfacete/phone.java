package interfacete;

//phone 实现 usb
public class phone implements  usb{

    @Override
    public void start(){
        System.out.println("phone start");
    }

    @Override
    public void stop(){
        System.out.println("phone stop");
    }
}
