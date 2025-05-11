package logger;

public class LoggerMain {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        assert System.identityHashCode(logger1) == System.identityHashCode(logger2) : "Le istanze non sono uguali!";

        // Esempio di utilizzo
        Logger logger = Logger.getInstance();
        logger.log("Ciao, sono un Logger!");
    }
}
