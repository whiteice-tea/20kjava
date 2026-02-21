package extendec;

public class PC extends computer{
    private String brand;

    public PC(String CPU,int memory,int disk,String brand){
        super(CPU,memory,disk);
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void print(){
        System.out.println(getCPU()+"\t"+getMemory()+"\t"+getDisk()+"\t"+brand);
    }
}
