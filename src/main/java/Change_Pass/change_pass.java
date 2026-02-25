package Change_Pass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class change_pass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        account ac1 = new account(0.0);

        boolean flag = true;

        while(flag) {
            show_menu();
            int choice = in.nextInt();
            switch(choice){
                case 1:
                    ac1.showRecords();
                    break;
                case 2:
                    System.out.println("请输入收入金额：");
                    double inmoney = in.nextDouble();
                    in.nextLine();//吃掉回车
                    System.out.println("请输入收入说明：");
                    String inNote = in.nextLine();
                    ac1.addamount(inmoney,nowTime(),inNote);
                    break;
                case 3:
                    System.out.println("请输入消费金额：");
                    double paymoney = in.nextDouble();
                    in.nextLine();
                    System.out.println("请输入消费说明：");
                    String payNote = in.nextLine();
                    ac1.pay(paymoney,nowTime(),payNote);
                    break;
                case 4:
                    System.out.println("程序退出");
                    flag = false;
                    break;
            }
        }
    }

    public static void show_menu() {
        System.out.println("-----------------零钱通菜单-----------------");
        System.out.println("               1.零钱通明细");
        System.out.println("               2.收益入账");
        System.out.println("               3.消费");
        System.out.println("               4.退     出");
        System.out.println("请选择（1-4）：");
        System.out.println("------------------------------------------");
    }

    public static String nowTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
}
