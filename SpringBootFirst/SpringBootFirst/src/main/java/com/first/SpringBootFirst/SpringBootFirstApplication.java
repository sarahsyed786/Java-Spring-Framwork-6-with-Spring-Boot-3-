package com.first.SpringBootFirst;

import com.first.SpringBootFirst.model.Alien;
import com.first.SpringBootFirst.model.Laptop;
import com.first.SpringBootFirst.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringBootFirstApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

//		System.out.println("Hello World!");
//		Alien obj = context.getBean(Alien.class);
//		obj.problem();

	}

}
