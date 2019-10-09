package com.greggsetzer.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DashboardRestApplication {
    public static void main(String args[]) {
        SpringApplication.run(DashboardRestApplication.class, args);
    }
}