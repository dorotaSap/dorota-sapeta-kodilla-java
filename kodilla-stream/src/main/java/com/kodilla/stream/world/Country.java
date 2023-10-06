package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Country {
    private final String countryName;
    private final BigDecimal population;

    public Country(final String countryName, final BigDecimal population) {
        this.countryName = countryName;
        this.population = population;
    }
    public BigDecimal getPeopleQuantity(){
        return population;
    }
}
