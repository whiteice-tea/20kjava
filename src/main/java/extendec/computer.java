package extendec;

public class computer {
    private String CPU;
    private int memory;
    private int disk;

    public computer(String CPU,int memory,int disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    public void getDetails(){
        System.out.println("CPU:"+CPU+"\nMemory:"+memory+"\nDisk:"+disk);
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
