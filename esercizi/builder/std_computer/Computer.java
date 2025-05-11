package std_computer;

/**
 * Classe Computer che rappresenta un computer con varie specifiche.
 * <p>
 * Il pattern Builder permette di creare oggetti complessi separando il processo
 * di costruzione dalla rappresentazione.
 */
public class Computer {
    protected float inches;
    protected String cpu;
    protected int ram;
    protected int hdd;
    protected String os;
    protected String vendor;

    public Computer(
            float inches,
            String cpu,
            int ram,
            int hdd,
            String os,
            String vendor) {
        this.inches = inches;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.vendor = vendor;
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
}