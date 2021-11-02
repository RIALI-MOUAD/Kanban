package com.example.kanban;

import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;
@Component
class RunnerTest {

    @Test
    public void run(String... args){
        System.out.println("Hi from Runner");
    };
}