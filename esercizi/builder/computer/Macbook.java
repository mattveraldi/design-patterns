package computer;

public class Macbook extends Computer {
    private Flavour flavour;

    private Macbook(Builder builder) {
        super(builder);
        this.flavour = builder.flavour;
        this.os = "MacOS";
        this.vendor = "Apple";
    }

    public static class Builder extends Computer.Builder<Builder> {
        private Flavour flavour;

        public Builder(Flavour flavour) {
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
                this.cpu = "M4 Max";
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
        public Macbook build() {
            return new Macbook(this);
        }
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append("\nflavour: ")
                .append(this.flavour)
                .toString();
    }

    public static Builder newBuilder(Flavour flavour) {
        return new Builder(flavour);
    }
}

enum Flavour {
    AIR,
    PRO
}
