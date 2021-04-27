package com.example.demo.di;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoodUserDaoFactory {

    @Bean
    public GoodUserDao goodUserDao() {
        return new GoodUserDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }

    @Bean
    public ConnectionMaker realConnectionMaker() {
        return new AConnectionMaker();
    }
}
