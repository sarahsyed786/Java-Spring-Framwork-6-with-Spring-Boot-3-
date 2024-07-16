
package com.first.SpringBootFirst.repo;

import com.first.SpringBootFirst.model.Laptop;
import org.springframework.stereotype.Component;

@Component
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database...");
    }
}
