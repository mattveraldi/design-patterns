package config_manager;

import java.util.HashMap;
import java.util.Map;

public enum ConfigManager {
    INSTANCE;

    private final Map<String, String> configMap = new HashMap<>();

    public void set(String key, String value) {
        configMap.put(key, value);
    }

    public String get(String key) {
        return configMap.get(key);
    }

    public boolean contains(String key) {
        return configMap.containsKey(key);
    }
}
