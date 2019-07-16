package com.simpleecommerce;

import java.text.DecimalFormat;
import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.simpleecommerce.model.Product;
import com.simpleecommerce.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {

            for(long i = 1; i < 16; i++)
            	productService.save(new Product(
            			i, 
            			"Product " + i, 
            			new Random().nextDouble() *1000, 
            			"http://lorempixel.com/200/100"
            			)
            		);
        };
    }

}
