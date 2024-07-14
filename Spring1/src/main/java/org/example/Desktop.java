package org.example;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public Desktop(){
        System.out.println("Desktop Object created");
    }

    @Override
    public void run() {
        System.out.println("Compiling using Desktop...");
    }
}
