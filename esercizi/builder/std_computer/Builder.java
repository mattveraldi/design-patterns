package std_computer;

public interface Builder {
    Builder vendor(String vendor);

    Builder inches(float inches);

    Builder cpu(String cpu);

    Builder ram(int ram);

    Builder hdd(int hdd);

    Builder os(String os);

    Computer build();
}
