package computer;

public class BuilderMain {
        public static void main(String[] args) {
                Computer lenovo = Computer.newBuilder()
                                .cpu("Intel i9")
                                .hdd(2000)
                                .ram(32)
                                .inches(13.3f)
                                .vendor("Lenovo")
                                .os("Windows 11 PRO")
                                .build();
                System.out.println(lenovo);
                System.out.println("\n");

                Computer hp = Computer.newBuilder()
                                .cpu("Intel i7")
                                .hdd(1000)
                                .ram(16)
                                .inches(16f)
                                .vendor("HP")
                                .os("Windows 11 Home")
                                .build();
                System.out.println(hp);
                System.out.println("\n");

                Computer macbook = Macbook.newBuilder(Flavour.PRO)
                                .inches(16f)
                                .cpu("M4 Max")
                                .build();
                System.out.println(macbook);
                System.out.println("\n");
        }
}
