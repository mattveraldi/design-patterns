package std_computer;

public class ComputerBuilder implements Builder {
    protected float inches = 13.3f;
    protected String cpu = "AMD Ryzen 5";
    protected int ram = 16;
    protected int hdd = 1000;
    protected String os = "Ubuntu";
    protected String vendor = "";

    public Builder vendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    public Builder inches(float inches) {
        this.inches = inches;
        return this;
    }

    public Builder cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public Builder ram(int ram) {
        this.ram = ram;
        return this;
    }

    public Builder hdd(int hdd) {
        this.hdd = hdd;
        return this;
    }

    public Builder os(String os) {
        this.os = os;
        return this;
    }

    public Computer build() {
        return new Computer(
                inches,
                cpu,
                ram,
                hdd,
                os,
                vendor);
    }
}
