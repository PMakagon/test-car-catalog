package ru.embedika.testcarcatalog.service;

import org.springframework.stereotype.Service;
import ru.embedika.testcarcatalog.Exceptions.CarNotFoundException;
import ru.embedika.testcarcatalog.Exceptions.SameCarExistException;
import ru.embedika.testcarcatalog.domain.Car;
import ru.embedika.testcarcatalog.repository.CatalogRepository;
import ru.embedika.testcarcatalog.service.abstracts.CatalogService;

import java.util.Collection;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository catalogRepository;

    public CatalogServiceImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Override
    public Collection<Car> getAll() {
        return catalogRepository.findAll();
    }

    @Override
    public Car getByStateNumber(String stateNumber) {
        return catalogRepository.findFirstByStateNumber(stateNumber);
    }
    @Override
    public Collection<Car> getAllByColor(String color) {
        return catalogRepository.findAllByColorOrderByPublicationDateDesc(color);
    }
    @Override
    public Collection<Car> getAllByModel(String model) {
        return catalogRepository.findAllByModelOrderByPublicationDateDesc(model);
    }

    @Override
    public Car addCar(Car car) {
        String stateNumber = car.getStateNumber();
        if (catalogRepository.findFirstByStateNumber(stateNumber) == null) {
            return catalogRepository.save(car);
        } else {
            throw new SameCarExistException("Car with " + stateNumber + " state number already exist");
        }
    }

    @Override
    public Car addCar(String stateNumber, String model, String color, int releaseYear) {
        if (catalogRepository.findFirstByStateNumber(stateNumber) == null) {
            return catalogRepository.save(new Car(stateNumber,model,color,releaseYear));
        } else {
            throw new SameCarExistException("Car with " + stateNumber + " state number already exist");
        }
    }

    @Override
    public Car deleteCar(Long id) {
        Car carToDelete = catalogRepository.findById(id).orElseThrow(() -> new CarNotFoundException("Car not found"));
        catalogRepository.deleteById(id);
        return carToDelete;

    }
}
