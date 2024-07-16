package com.first.SpringBootFirst.service;

import com.first.SpringBootFirst.repo.LaptopRepository;
import com.first.SpringBootFirst.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        System.out.println("Method Called");
        repo.save(lap);

    }

    public boolean isGoodForPro(Laptop lap){
            return true;
    }
}
