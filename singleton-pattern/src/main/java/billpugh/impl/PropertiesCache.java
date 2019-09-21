package billpugh.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesCache {

    private final Properties properties = new Properties();

    private PropertiesCache() {
        // Private constructor to restrict new instances
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("app.properties");
        System.out.println("Read all properties from file");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Bill Pugh Solution for singleton pattern
    private static class LazyHolder {
        private static final PropertiesCache INSTANCE = new PropertiesCache();
    }

    public static PropertiesCache getInstance() {
        return LazyHolder.INSTANCE;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public Set<String> getAllPropertyNames() {
        return properties.stringPropertyNames();
    }

    public boolean containsKey(String key) {
        return properties.containsKey(key);
    }
}