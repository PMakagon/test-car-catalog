package ru.embedika.testcarcatalog.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.embedika.testcarcatalog.domain.CatalogStatistics;
import ru.embedika.testcarcatalog.repository.CatalogRepository;
import ru.embedika.testcarcatalog.service.abstracts.StatisticsService;

import java.util.Date;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    private final CatalogRepository catalogRepository;

    public StatisticsServiceImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Cacheable("statistics")
    @Override
    public CatalogStatistics getStatistics() {
        return new CatalogStatistics(getTotalCarAmount(),getLastAddedCarDate());
    }

    @Override
    public Long getTotalCarAmount() {
        return catalogRepository.count();
    }

    @Override
    public Date getLastAddedCarDate() {
       return catalogRepository.findTopByOrderByIdDesc().getPublicationDate();
    }

}
