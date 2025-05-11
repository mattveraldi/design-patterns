public class SdkSingletonExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();

        assert System.identityHashCode(runtime) == System.identityHashCode(runtime2) : "Le istanze non sono uguali!";
        System.err.println("Runtime è un Singleton");
    }
}
