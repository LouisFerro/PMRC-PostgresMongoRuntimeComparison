package at.pmrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableMongoRepositories(basePackages = "at.pmrc.mongo.persistence")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}