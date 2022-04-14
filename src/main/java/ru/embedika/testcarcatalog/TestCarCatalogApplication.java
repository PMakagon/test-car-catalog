package ru.embedika.testcarcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableCaching
public class TestCarCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCarCatalogApplication.class, args);
    }

}
