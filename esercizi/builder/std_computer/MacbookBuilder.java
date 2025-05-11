package std_computer;

public class MacbookBuilder implements Builder {
    private Flavour flavour;
    protected float inches = 13.3f;
    protected String cpu = "M4";
    protected int ram = 32;
    protected int hdd = 2000;
    protected String os = "MacOS";
    protected String vendor = "Apple";

    public MacbookBuilder(Flavour flavour) {
        super();
        this.flavour = flavour;
        // Macbook AIR base configuration
        if (this.flavour == Flavour.AIR) {
            this.cpu = "M4";
            this.ram = 16;
            this.hdd = 256;
        }
        // Macbook PRO base configuration
        else {
            this.cpu = "M4 Pro";
            this.ram = 16;
            this.hdd = 512;
        }
    }

    @Override
    public Builder inches(float inches) {
        if (inches >= 13.6f && inches <= 16f) {
            this.inches = inches;
        }
        return this;
    }

    @Override
    public Builder cpu(String cpu) {
        if (cpu.startsWith("M") || !cpu.startsWith("Intel")) {
            this.cpu = cpu;
        }
        return this;
    }

    @Override
    public Builder vendor(String vendor) {
        this.vendor = "Apple";
        return this;
    }

    @Override
    public Builder ram(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public Builder hdd(int hdd) {
        this.hdd = hdd;
        return this;
    }

    @Override
    public Builder os(String os) {
        this.os = "MacOS";
        return this;
    }

    @Override
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

enum Flavour {
    AIR,
    PRO
}