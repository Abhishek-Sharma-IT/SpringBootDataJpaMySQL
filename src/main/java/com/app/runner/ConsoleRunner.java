package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		/*repo.save(new Product(10,"A",3.3));
		  repo.save(new Product(11,"B",4.3));
		  repo.save(new Product(12,"C",5.3));
		  repo.save(new Product(13,"D",6.3));*/
		
		//--Update Call--
		//repo.save(new Product(13,"E",8.8));
		
		//--Bulk Insert--
		/*List<Product> list=Arrays.asList(
				new Product(101,"R",9.9),
				new Product(102,"S",8.9),
				new Product(103,"T",7.9),
				new Product(104,"U",6.9)
				);
             repo.saveAll(list);*/
             
             //--Fetch One Row--
            /* Optional<Product> p=repo.findById(102);
		        if(p.isPresent()) {
		        	System.out.println(p);
		        }
		        else {
		        	System.out.println("Row Not Found");
		        }*/
		
		//--Fetch All Rows--
		/*List<Product> list=repo.findAll();
		list.forEach(System.out::println);*/
		
		//--Delete Operation--
		//repo.deleteById(104);
		
		//--Delete All Rows--
		   //repo.deleteAll();
		   repo.deleteAllInBatch();
	}

}
