package io.pro.educare.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;


@SpringBootApplication
@EnableNeo4jRepositories
@Profile("production")
public class Main {
  public static void main(String[] args) {
    //  System.setProperties(, "production");

    SpringApplication.run(Main.class, args);
  }

}