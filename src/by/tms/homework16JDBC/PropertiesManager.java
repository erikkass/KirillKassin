package by.tms.homework16JDBC;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public final class PropertiesManager {

    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(Files.newInputStream(Path.of("resources", "HomeDB.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private PropertiesManager() {
    }

    public static String getPropertyByKey(String key) {
        return properties.getProperty(key);
    }
}
