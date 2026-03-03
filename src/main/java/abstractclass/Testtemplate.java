package abstractclass;

public class Testtemplate {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.makeDrink();
    }
}

abstract class Drinktemplate{
    public final void makeDrink(){
        pourwater();
        addMain();
        stir();
    }
    private void pourwater(){
        System.out.println("pourwater");
    }
    private void stir(){
        System.out.println("stir");
    }

    protected abstract void addMain();
}

class Tea extends Drinktemplate {
    @Override
    protected void addMain(){
        System.out.println("tea");
    }
}

class Coffee extends Drinktemplate {
    @Override
    protected void addMain(){
        System.out.println("coffee");
    }
}