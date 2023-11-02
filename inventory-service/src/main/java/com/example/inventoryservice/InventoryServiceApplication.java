package com.example.inventoryservice;

import com.example.inventoryservice.entity.InventoryItem;
import com.example.inventoryservice.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);

	}

	//add defaults items to inventory_db
	@Bean
	CommandLineRunner run(ItemRepository itemRepository){
		return args ->{

			if(itemRepository.existsById(1))return;

			itemRepository.save(new InventoryItem(1,  "tikiri mari","Biscuits", "Classic Oreo sandwich cookies", "https://example.com/oreo.jpg", 60, 7.4));
			itemRepository.save(new InventoryItem(5, "cheese-bits","Biscuits", "Buttery shortbread cookies", "https://example.com/shortbread.jpg", 35, 3.49));
			itemRepository.save(new InventoryItem(10, "cream cracker","Biscuits", "Spicy ginger snap cookies", "https://example.com/ginger.jpg", 45, 2.99));


		};

	}


}


