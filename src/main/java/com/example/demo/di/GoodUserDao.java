package com.example.demo.di;

public class GoodUserDao {
    public ConnectionMaker connectionMaker;

    public GoodUserDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}
