package ru.embedika.testcarcatalog.domain;

import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

//    @Column(name="stateNumber", unique=true)
    private String stateNumber;
    private String model;
    private String color;
    private int releaseYear;


    @Column(updatable = false)
    @CreationTimestamp
    private Date publicationDate;

    public Car() {
    }

    public Car(String stateNumber, String model, String color, int releaseYear) {
        this.stateNumber = stateNumber;
        this.model = model;
        this.color = color;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", stateNumber='" + stateNumber + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }
}
