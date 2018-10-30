package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class ConfigRest extends RepositoryRestConfigurerAdapter{

	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	
	config.exposeIdsFor(Formation.class, Etudiant.class);
	config.setReturnBodyOnCreate(true);
	config.setReturnBodyOnUpdate(true);
	config.exposeIdsFor(Etudiant.class, Formation.class);
	config.getCorsRegistry()
		.addMapping("/**")
		.allowedOrigins("*")
		.allowedHeaders("*")
		.allowedMethods("OPTIONS","GET","POST","PUT","PATCH","DELETE","HEAD");
	}
}
