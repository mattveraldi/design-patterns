package config_manager;

public class Main {
    public static void main(String[] args) {
        ConfigManager config1 = ConfigManager.INSTANCE;
        ConfigManager config2 = ConfigManager.INSTANCE;
        assert System.identityHashCode(config1) == System.identityHashCode(config2) : "Le istanze non sono uguali!";

        ConfigManager config = ConfigManager.INSTANCE;
        config.set("api_url", "https://api.miosito.com");
        config.set("timeout", "30");

        System.out.println("API URL: " + config.get("api_url"));
        System.out.println("Timeout: " + config.get("timeout") + "s");
    }
}
