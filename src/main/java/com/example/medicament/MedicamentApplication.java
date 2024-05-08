package com.example.medicament;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.lamis.medicament.entities.medicament;
import com.lamis.medicament.service.medicamentService;
@SpringBootApplication
public class MedicamentApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(MedicamentApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(medicament.class);
	}

}
