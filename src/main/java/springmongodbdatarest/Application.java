package springmongodbdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		productRepository.deleteAll();
		
		productRepository.save(new Product("first", "title", "description"));
		productRepository.save(new Product("first1", "title1", "description1"));
		
		
		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Product product : productRepository.findAll()) {
			System.out.println(product);
		}
		System.out.println();
		
	}
}
