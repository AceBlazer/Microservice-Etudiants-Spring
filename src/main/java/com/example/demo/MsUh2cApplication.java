package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MsUh2cApplication implements CommandLineRunner{

	@Autowired
	private EtudiantRepository er;
	
	@Autowired
	private FormationRepository fr;
	
	@Autowired
	private RepositoryRestConfiguration rrc;
	
	public static void main(String[] args) {
		SpringApplication.run(MsUh2cApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
		Formation f1 = fr.save(new Formation("PHP",30,null));
		Formation f2 = fr.save(new Formation("JAVA",30,null));
		Formation f3 = fr.save(new Formation("ORACLE",30,null));
		
		er.save(new Etudiant("Hassan","assan",new Date(),f1));
		er.save(new Etudiant("Med","assan",new Date(),f1));
		er.save(new Etudiant("Khaled","assan",new Date(),f2));
		er.save(new Etudiant("HJasser","assan",new Date(),f2));
		er.save(new Etudiant("Helmi","assan",new Date(),f3));
		
	}
}
