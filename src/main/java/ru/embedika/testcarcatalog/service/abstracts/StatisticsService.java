package ru.embedika.testcarcatalog.service.abstracts;

import ru.embedika.testcarcatalog.domain.CatalogStatistics;

import java.time.LocalDate;
import java.util.Date;

public interface StatisticsService {
    Long getTotalCarAmount();
    Date getLastAddedCarDate();
    CatalogStatistics getStatistics();
}
