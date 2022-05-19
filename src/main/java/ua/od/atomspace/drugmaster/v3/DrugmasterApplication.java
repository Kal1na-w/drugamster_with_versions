package ua.od.atomspace.drugmaster.v3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.od.atomspace.drugmaster.v3.model.Drug;
import ua.od.atomspace.drugmaster.v3.service.DrugPurposeService;

@SpringBootApplication
public class DrugmasterApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DrugmasterApplication.class, args);
	}

}
