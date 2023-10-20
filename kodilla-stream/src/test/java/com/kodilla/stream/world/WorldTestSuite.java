package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
//        Given
        Country poland = new Country("Poland",new BigDecimal("12000000"));
        Country usa = new Country("USA",new BigDecimal("130000000"));
        Country italy = new Country("Italy", new BigDecimal("14000000"));
        Country china = new Country("China", new BigDecimal("150000000"));

        Continent europe = new Continent("Europe", Arrays.asList(poland, italy));
        Continent northAmerica = new Continent("North America", Arrays.asList(usa));
        Continent asia = new Continent("Asia", Arrays.asList(china));

        World world = new World(Arrays.asList(europe,northAmerica,asia));

//        When
        BigDecimal expectedPopulation = new BigDecimal("306000000");
        BigDecimal actualPopulation = world.getPeopleQuantity();

//        Then
        assertEquals(expectedPopulation, actualPopulation);

    }
}
