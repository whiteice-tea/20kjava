package block;

public class normal {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(AA.n);
        System.out.println(aa.m);

    }
}

class BB{
    static{
        System.out.println("static BB");
    }
}


class AA extends BB{
    public static int n = 99;
    public int m=100;

    static{
        System.out.println("normal static block");
    }

    {
        System.out.println("normal instance block");
    }


}