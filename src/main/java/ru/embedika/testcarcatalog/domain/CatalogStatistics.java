package ru.embedika.testcarcatalog.domain;

import java.time.LocalDate;
import java.util.Date;

public class CatalogStatistics {
    private final Long TotalCarsAmount;
    private final Date lastCarAddedDate;

    public CatalogStatistics(Long carCount, Date lastCarAddedDate) {
        this.TotalCarsAmount = carCount;
        this.lastCarAddedDate = lastCarAddedDate;
    }

    public Long getTotalCarsAmount() {
        return TotalCarsAmount;
    }

    public Date getLastCarAddedDate() {
        return lastCarAddedDate;
    }
}
