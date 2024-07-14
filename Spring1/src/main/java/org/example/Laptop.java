package org.example;


import org.springframework.stereotype.Component;


public class Laptop implements Computer {

    @Override
    public void run(){
        System.out.println("Compiling using laptop...");
    }
}