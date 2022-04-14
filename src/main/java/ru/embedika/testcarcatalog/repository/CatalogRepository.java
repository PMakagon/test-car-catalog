package ru.embedika.testcarcatalog.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.embedika.testcarcatalog.domain.Car;
import java.util.List;

public interface CatalogRepository extends JpaRepository<Car, Long> {

    @Cacheable("car_catalog")
    List<Car> findAllByColorOrderByPublicationDateDesc(String color);

    @Cacheable("car_catalog")
    List<Car> findAllByModelOrderByPublicationDateDesc(String model);

    @Cacheable("car_catalog")
    Car findFirstByStateNumber(String stateNumber);

    Car findTopByOrderByIdDesc();
}
