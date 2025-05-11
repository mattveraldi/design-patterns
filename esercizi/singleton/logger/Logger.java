package logger;

public class Logger {
    private static volatile Logger instance;

    private Logger() {
        // Costruttore privato per impedire l'instanziazione esterna
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }

}