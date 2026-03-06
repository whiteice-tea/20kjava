package innerclass;

public class exercise2 {
    public static void main(String[] args) {
        cellphone cellphone = new cellphone();
        cellphone.alarmclock(new bell() {
            @Override
            public void ring() {
                System.out.println("ring.pig,wake up!");
            }
        });
        cellphone.alarmclock(new bell() {
            @Override
            public void ring() {
                System.out.println("ring.student,go school!");
            }
        });
    }

}

interface bell{
    void ring();
}

class cellphone{
    public void alarmclock(bell b){
        b.ring();
    }
}