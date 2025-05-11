package computer;

/**
 * Classe Computer che rappresenta un computer con varie specifiche.
 * <p>
 * Il pattern Builder permette di creare oggetti complessi separando il processo
 * di costruzione dalla rappresentazione.
 */
public class Computer {
    protected float inches = 13.3f;
    protected String cpu = "AMD Ryzen 5";
    protected int ram = 16;
    protected int hdd = 1000;
    protected String os = "Ubuntu";
    protected String vendor = "";

    protected Computer(Builder<?> builder) {
        this.inches = builder.inches;
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.os = builder.os;
        this.vendor = builder.vendor;
    }

    public static class Builder<T extends Builder<T>> {
        protected float inches = 13.3f;
        protected String cpu = "AMD Ryzen 5";
        protected int ram = 16;
        protected int hdd = 1000;
        protected String os = "Ubuntu";
        protected String vendor = "";

        @SuppressWarnings("unchecked")
        protected T self() {
            return (T) this;
        }

        public T vendor(String vendor) {
            this.vendor = vendor;
            return self();
        }

        public T inches(float inches) {
            this.inches = inches;
            return self();
        }

        public T cpu(String cpu) {
            this.cpu = cpu;
            return self();
        }

        public T ram(int ram) {
            this.ram = ram;
            return self();
        }

        public T hdd(int hdd) {
            this.hdd = hdd;
            return self();
        }

        public T os(String os) {
            this.os = os;
            return self();
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Computer@")
                .append(System.identityHashCode(this))
                .append("\n")
                .append("OS: ")
                .append(os)
                .append("\n")
                .append("Vendor: ")
                .append(vendor)
                .append("\n")
                .append("CPU: ")
                .append(cpu)
                .append("\n")
                .append("RAM: ")
                .append(ram)
                .append("\n")
                .append("HDD: ")
                .append(hdd)
                .append("\n")
                .append("Display inches: ")
                .append(inches)
                .toString();
    }

    public static Builder<?> newBuilder() {
        return new Builder<>();
    }
}