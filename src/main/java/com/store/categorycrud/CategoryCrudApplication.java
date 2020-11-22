package com.store.categorycrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.store.categorycrud.entities"})
@EnableJpaRepositories(basePackages = {"com.store.categorycrud.repositories"})
public class CategoryCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryCrudApplication.class, args);
	}
}