package House_for_rent;

import java.util.*;

public class test {
    private house[] houses = new house[3];
    private int count=0;
    private Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        test obj = new test();

        obj.run();
    }

    public void run(){
        boolean flag = true;
        while (flag) {
            showmenu();

            int choice = in.nextInt();
            in.nextLine(); // 吃掉回车（必须）
            switch (choice) {
                case 1:
                    addHouse();
                    break;
                case 2:
                    searchHouse();
                    break;
                case 3:
                    deleteHouse();
                    break;
                case 4:
                    modifyHouse();
                    break;
                case 5:
                    showHouse();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("无效选项");
            }
        }
    }

    public void addHouse() {
        if (count >= houses.length) {
            System.out.println("房源已满，无法新增！");
            return;
        }
        System.out.print("请输入房屋内容 (输入1确定，0取消): ");
        int choice = in.nextInt();
        in.nextLine(); // 吃回车
        if(choice!=1){
            System.out.println("取消成功");
            return;
        }

        System.out.print("请输入姓名: ");
        String name = in.nextLine();

        System.out.print("请输入地址: ");
        String address = in.nextLine();

        System.out.print("请输入电话: ");
        String phone = in.nextLine();

        System.out.print("请输入月租: ");
        double money = in.nextDouble();
        in.nextLine(); // 吃掉回车

        System.out.print("请输入出租状态(未出租/已出租): ");
        String state = in.nextLine();

        houses[count] = new house(name, address, phone, money, state);
        count++;

        System.out.println("新增成功！当前房源数量: " + count);
    }

    public void searchHouse() {
        if (count == 0) {
            System.out.println("暂无房源。");
            return;
        }

        System.out.print("请输入要查找的编号(1-" + count + ", 输入0取消): ");
        int idx = in.nextInt();
        in.nextLine(); // 吃回车

        if (idx == 0) {
            System.out.println("已取消查找。");
            return;
        }
        if (idx < 1 || idx > count) {
            System.out.println("编号非法。");
            return;
        }

        house h = houses[idx - 1];
        System.out.println("已找到房源 No. " + idx);
        h.show_house();
    }

    public void deleteHouse() {
        if (count==0) {
            System.out.println("暂无房源，无法删除。");
            return;
        }
        System.out.print("请输入要删除的编号(1-" + count + ", 输入0取消): ");
        int idx = in.nextInt();
        in.nextLine(); // 吃回车
        if (idx == 0) {
            System.out.println("已取消删除。");
            return;
        }
        if (idx < 1 || idx > count) {
            System.out.println("编号非法。");
            return;
        }
        int delete = idx-1;
        System.out.print("确认删除该房源？(y/n): ");
        String confirm = in.nextLine();
        if (!confirm.equalsIgnoreCase("y")) {
            System.out.println("已取消删除。");
            return;
        }
        for (int i = delete; i < count - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[count - 1] = null;
        count--;
        System.out.println("删除成功！当前房源数量: " + count);

    }

    public void modifyHouse() {
        if (count==0) {
            System.out.println("暂无房源，无法修改。");
            return;
        }
        System.out.print("请输入要修改的编号(1-" + count + ", 输入0取消): ");
        int mdidx = in.nextInt();
        in.nextLine(); // 吃回车
        if (mdidx == 0) {
            System.out.println("已取消修改。");
            return;
        }
        if (mdidx < 1 || mdidx > count) {
            System.out.println("编号非法。");
            return;
        }
        int delete = mdidx-1;
        System.out.print("确认修改该房源？(y/n): ");
        String confirm = in.nextLine();
        if (!confirm.equalsIgnoreCase("y")) {
            System.out.println("已取消修改。");
            return;
        }

        System.out.print("请输入姓名: ");
        String mdname = in.nextLine();

        System.out.print("请输入地址: ");
        String mdaddress = in.nextLine();

        System.out.print("请输入电话: ");
        String mdphone = in.nextLine();

        System.out.print("请输入月租: ");
        double mdmoney = in.nextDouble();
        in.nextLine(); // 吃掉回车

        System.out.print("请输入出租状态(未出租/已出租): ");
        String mdstate = in.nextLine();

        houses[mdidx-1] = new house(mdname, mdaddress, mdphone, mdmoney, mdstate);
        System.out.println("修改成功！");
    }

    public void showHouse() {
        if (count == 0) {
            System.out.println("暂无房源。");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("house found No. " + (i + 1));
            houses[i].show_house();
        }
    }


    public void showmenu(){
        System.out.println("--------------House rental system-------------");
        System.out.println("                 1.add new listing");
        System.out.println("                 2.search house");
        System.out.println("                 3.delete house");
        System.out.println("                 4.Modify house");
        System.out.println("                 5.show house");
        System.out.println("                 6.quit system");
        System.out.println("--------------House rental system-------------");
    }
}
