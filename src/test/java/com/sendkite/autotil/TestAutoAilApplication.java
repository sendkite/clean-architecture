package com.sendkite.autotil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.MySQLContainer;

@Configuration
public class TestAutoAilApplication {

    @Bean
    @RestartScope
    @ServiceConnection
    MySQLContainer mySQLContainer() {
        return new MySQLContainer("mysql:8.0.33");
    }

    public static void main(String[] args) {
        SpringApplication
                .from(AutoTilApplication::main)
                .with(TestAutoAilApplication.class)
                .run(args);
    }
}
