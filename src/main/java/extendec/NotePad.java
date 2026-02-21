package extendec;

public class NotePad extends computer{
    private String color;

    public NotePad(String CPU,int memory,int disk,String color) {
        super(CPU,memory,disk);
        this.color=color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void print(){
        System.out.println(getCPU()+"\t"+getMemory()+"\t"+getDisk()+"\t"+color);
    }
}
