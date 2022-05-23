package com.PruebaTecnica.Springboot.serviceUserTask.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class GeneralConfiguration {
    @Bean
    public DataSource dataSource() {

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:prueba");
        dataSourceBuilder.username("ema");
        dataSourceBuilder.password("123");
        return dataSourceBuilder.build();
    }
}
