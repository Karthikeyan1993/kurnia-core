package com.kgfsl;

import com.kgfsl.entity.Product;
import com.kgfsl.repository.ProductRepository;
import org.h2.server.web.WebServlet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class KurniaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KurniaApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(@Qualifier("productRepository") ProductRepository productRepository) {
        return (args) -> {
            Arrays.asList("Motor,Health,HomeOwners,Personal Accident".split(","))
                    .forEach(p -> productRepository.save(new Product(p)));
            productRepository.findAll().forEach(System.out::println);
        };
    }

    @Bean
    ServletRegistrationBean servletRegistrationBean( ) {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
}
