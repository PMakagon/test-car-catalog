package ru.embedika.testcarcatalog.service.abstracts;

import ru.embedika.testcarcatalog.domain.Car;
import ru.embedika.testcarcatalog.domain.CatalogStatistics;

import java.util.Collection;
import java.util.List;

public interface CatalogService {
    Collection<Car> getAll();
    Car getByStateNumber(String stateNumber);
    Collection<Car> getAllByColor(String color);
    Collection<Car> getAllByModel(String model);
    Car addCar(Car car);
    Car addCar(String stateNumber,String model,String color,int releaseYear);
    Car deleteCar(Long id);
}
