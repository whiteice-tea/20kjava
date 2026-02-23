package polyparameter;

public class test {
    public static void main(String[] args) {
        employee e1 = new employee("jack",10000);
        employee e2 = new normal_employee("jane",20000,"engineer");
        employee e3 = new Manage("jane",20000,1000,"fontengineer");

        test emp = new test();

        emp.showempannual(e1);
        emp.showempannual(e2);
        emp.showempannual(e3);

        System.out.println("------");

        emp.testwork(e1);
        emp.testwork(e2);
        emp.testwork(e3);

    }

    public  void showempannual(employee e){
        System.out.println(e.getAnnual());
    }

    public void testwork(employee e){
        if(e instanceof normal_employee){
            ((normal_employee) e).work();
        }else if(e instanceof Manage){
            ((Manage) e).manage();
        }else {
            System.out.println(e.getName() + " no special work method");
        }
    }


}


