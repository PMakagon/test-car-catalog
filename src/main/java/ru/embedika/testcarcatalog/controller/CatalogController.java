package ru.embedika.testcarcatalog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.embedika.testcarcatalog.domain.Car;
import ru.embedika.testcarcatalog.domain.CatalogStatistics;
import ru.embedika.testcarcatalog.service.abstracts.CatalogService;
import ru.embedika.testcarcatalog.service.abstracts.StatisticsService;

import java.util.Collection;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private final CatalogService catalogService;
    private final StatisticsService statisticsService;

    public CatalogController(CatalogService catalogService, StatisticsService statisticsService) {
        this.catalogService = catalogService;
        this.statisticsService = statisticsService;
    }

    @GetMapping("/all")
    public Collection<Car> getAll() {
        return catalogService.getAll();
    }

    @GetMapping("{stateNumber}")
    public ResponseEntity<Car> getByStateNumber(@PathVariable String stateNumber) {
        return ResponseEntity.ok().body(catalogService.getByStateNumber(stateNumber));
    }

    @GetMapping("/all/color/{color}")
    public Collection<Car> getAllByColor(@PathVariable String color) {
        return catalogService.getAllByColor(color);
    }

    @GetMapping("/all/model/{model}")
    public Collection<Car> getAllByModel(@PathVariable String model) {
        return catalogService.getAllByModel(model);
    }

    @PostMapping
    public ResponseEntity<Car> addCar(@RequestParam @RequestBody Car car) {
        return ResponseEntity.ok(catalogService.addCar(car));
    }

    @PostMapping("/add")
    public ResponseEntity<Car> addCar(@RequestParam String stateNumber, @RequestParam String model, @RequestParam String color, @RequestParam int releaseYear) {
        Car newCar = catalogService.addCar(stateNumber, model, color, releaseYear);
        return ResponseEntity.ok().body(newCar);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Car> deleteCar(@PathVariable Long id) {
        return ResponseEntity.ok().body(catalogService.deleteCar(id));
    }
    @GetMapping("/statistics")
    public CatalogStatistics getStatistics(){
       return statisticsService.getStatistics();
    }
}
