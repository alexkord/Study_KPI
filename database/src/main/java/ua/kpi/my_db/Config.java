package ua.kpi.my_db;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private String url;
    private String user;
    private String password;
    private String factoryClassname;

    public Config() {
        load();
    }

    public String getFactoryClassname() {
        return factoryClassname;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    private static class Holder {
        private static Config INSTANCE = new Config();
    }

    public static Config getInstance() {
        return Holder.INSTANCE;
    }

    private void load() {
        try (InputStream is = this.getClass().getResourceAsStream("/db.properties")) {
            Properties properties = new Properties();
            user = properties.getProperty("db.user");
            password = properties.getProperty("db.password");
            url = properties.getProperty("db.url");
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
