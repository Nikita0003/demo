package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello World!");
        List<Integer> list = Arrays.asList(1, 2, 3);
        Stream<Integer> stream = list.stream()
                .map(n -> n * n);
        List<Integer> newList = stream.toList();
        System.out.println(newList);
    }

}
