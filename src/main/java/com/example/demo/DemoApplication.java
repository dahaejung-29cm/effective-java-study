package com.example.demo;

import com.example.demo.clone.ExceptionClone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        SpringApplication.run(DemoApplication.class, args);
        ExceptionClone e = new ExceptionClone();
        e.getClass();

    }

}
