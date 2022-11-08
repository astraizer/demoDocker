package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    @Autowired
    private Environment env;

    @Primary
    @Bean(name = "dbDataSource")
    public DataSource dbDataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        dataSource.setUrl(System.getenv("MIDDLE_URL") !=null ? System.getenv("MIDDLE_URL") : env.getProperty("spring.datasource.url"));
        dataSource.setUsername(System.getenv("MIDDLE_USERNAME") != null ? System.getenv("MIDDLE_USERNAME") : env.getProperty("spring.datasource.username"));
        dataSource.setPassword(System.getenv("MIDDLE_PASSWORD") != null ? System.getenv("MIDDLE_PASSWORD") : env.getProperty("spring.datasource.password"));

        return dataSource;
    }
}
