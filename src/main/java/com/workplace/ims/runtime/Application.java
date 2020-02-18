package com.workplace.ims.runtime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackages = {"com.workplace.ims"})
public class Application {
    public static void main(String [] args){
        SpringApplication.run(Application.class,args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context){
        return args -> {
          System.out.println("Hello Ims");
        };
    }
}
