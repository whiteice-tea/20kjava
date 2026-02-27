package House_for_rent;

public class house {
    private String house_name;
    private String house_address;
    private String house_phone;
    private double house_money;
    private String house_state;

    public house(String house_name, String house_address, String house_phone, double house_money, String house_state) {
        this.house_name = house_name;
        this.house_address = house_address;
        this.house_phone = house_phone;
        this.house_money = house_money;
        this.house_state = house_state;
    }

    public String getHouse_name() {
        return house_name;
    }

    public String getHouse_address() {
        return house_address;
    }

    public String getHouse_phone() {
        return house_phone;
    }

    public double getHouse_money() {
        return house_money;
    }

    public String getHouse_state() {
        return house_state;
    }

    public void show_house() {
        System.out.println("--------------展示房屋------------");
        System.out.println("姓名" + house_name);
        System.out.println("地址" + house_address);
        System.out.println("电话" + house_phone);
        System.out.println("月租" + house_money);
        System.out.println("出租状态" + house_state);
        System.out.println("--------------展示完毕------------");
    }


}
