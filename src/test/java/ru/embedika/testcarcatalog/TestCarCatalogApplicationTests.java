package ru.embedika.testcarcatalog;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import ru.embedika.testcarcatalog.controller.CatalogController;
import ru.embedika.testcarcatalog.domain.Car;
import ru.embedika.testcarcatalog.domain.CatalogStatistics;

import java.util.List;

import static constants.CarConstants.CAR_LIST;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TestCarCatalogApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturnCarsWhenGetAllIsCalled() throws Exception {
        Assertions
                .assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/catalog/all", List.class))
                .isEqualTo(CAR_LIST);
    }

    @Test
    void contextLoads(){
    }
}
