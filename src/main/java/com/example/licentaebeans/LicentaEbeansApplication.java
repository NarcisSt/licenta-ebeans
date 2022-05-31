package com.example.licentaebeans;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class LicentaEbeansApplication {

    public static void main(String[] args) {
        ServerConfig cfg = new ServerConfig();
        cfg.setDefaultServer(true);
        Properties properties = new Properties();
        properties.put("ebean.db.ddl.generate", "true");
        properties.put("ebean.db.ddl.run", "true");
        properties.put("datasource.db.username", "postgres");
        properties.put("datasource.db.password", "admin");
        properties.put("datasource.db.databaseUrl", "jdbc:postgresql://localhost:5432/postgres");
        properties.put("datasource.db.databaseDriver", "org.postgresql.Driver");
        cfg.loadFromProperties(properties);
        EbeanServer server = EbeanServerFactory.create(cfg);
        SpringApplication.run(LicentaEbeansApplication.class, args);
    }

}
