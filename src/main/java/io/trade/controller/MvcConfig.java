package io.trade.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/403").setViewName("403");
    }

//    @Bean(name = "dataSource")
// public DriverManagerDataSource dataSource() {
//     DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//     driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
//     driverManagerDataSource.setUrl("dbc:postgresql://localhost:5432/TradeIO");
//     driverManagerDataSource.setUsername("postgres");
//     driverManagerDataSource.setPassword("postgres");
//     return driverManagerDataSource;
// }
    
}