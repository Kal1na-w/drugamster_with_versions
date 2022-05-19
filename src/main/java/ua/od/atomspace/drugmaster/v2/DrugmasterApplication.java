package ua.od.atomspace.drugmaster.v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ua.od.atomspace.drugmaster.v2.model.Drug;
import ua.od.atomspace.drugmaster.v2.service.DrugPurposeService;

@SpringBootApplication
public class DrugmasterApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DrugmasterApplication.class, args);
		DrugPurposeService bean = run.getBean(DrugPurposeService.class);
		Drug noshpa = bean.findPurpose("Noshpa");
		System.out.println(noshpa.getPurposeList());
	}

}
