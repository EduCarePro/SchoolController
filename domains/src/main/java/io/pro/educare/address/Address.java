package io.pro.educare.address;

import io.pro.educare.Entity;

import java.util.UUID;

public class Address {
    private String road;
    private String neighborhood;
    private Integer number;
    private String reference;
    private Country country;
    private Double[] geoPoint;

    public Address(
            final String road,
            final String neighborhood,
            final Integer number,
            final String reference,
            final Country country,
            final Double[] geoPoint
    ) {
        this.road = road;
        this.neighborhood = neighborhood;
        this.number = number;
        this.reference = reference;
        this.country = country;
        this.geoPoint = geoPoint;
    }

    public String getRoad() {
        return road;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public Integer getNumber() {
        return number;
    }

    public String getReference() {
        return reference;
    }

    public Country getCountry() {
        return country;
    }

    public Double[] getGeoPoint() {
        return geoPoint;
    }
}
