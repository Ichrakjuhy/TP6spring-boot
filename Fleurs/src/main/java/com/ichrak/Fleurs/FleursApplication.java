package com.ichrak.Fleurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.ichrak.Fleurs.entities.Fleur;

@SpringBootApplication
public class FleursApplication implements CommandLineRunner {
@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;
public static void main(String[] args) {
SpringApplication.run(FleursApplication.class, args);
}
public void run(String... args) throws Exception {
repositoryRestConfiguration.exposeIdsFor(Fleur.class);
}
}