package homework6;

public class Computer {
    private String videocard;


    private String CPU;
    private String RAM;
    public Computer() {
    }


    public void setVideocard(String videocard ) {
        this.videocard = videocard;
    }

    public String  getVideocard() {
        return videocard;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getCPU() {
        return CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getRAM() {
        return RAM;

    }
    public static void main(String[] args) {
        Computer components = new Computer();
        components.setVideocard("RTX 3060");
        components.setCPU("Intel core i5");
        components.setRAM("16 GB");

        System.out.println(components.getVideocard());
        System.out.println(components.getCPU());
        System.out.println(components.getRAM());
    }


}
