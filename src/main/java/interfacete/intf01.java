package interfacete;

public class intf01 {
    public static void main(String[] args) {
        camera camera = new camera();
        phone phone = new phone();

        computer computer = new computer();

        computer.work(phone);

        computer.work(camera);
    }
}
