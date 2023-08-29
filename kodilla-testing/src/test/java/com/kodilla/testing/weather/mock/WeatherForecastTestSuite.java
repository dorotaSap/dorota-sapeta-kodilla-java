package com.kodilla.testing.weather.mock;
import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;                                                        // [6]
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;

    private WeatherForecast weatherForecast;

  @BeforeEach
    void testCalculateForecastWithMock() {
        //Given

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
       Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    public void testCalculateAverageTemperature() {
//      Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        Temperatures mockTemperatures = mock(Temperatures.class);
        when(mockTemperatures.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(mockTemperatures);
//        When
        double averageTemperature = weatherForecast.calculateAverageTemperature();
//        Then
        Assertions.assertEquals(25.56, averageTemperature, 0.01);
    }

    @Test
    public void testCalculateMedianTemperature() {
//      Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        Temperatures mockTemperatures = mock(Temperatures.class);
        when(mockTemperatures.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(mockTemperatures);
//        When
        double medianTemperature = weatherForecast.calculateMedianTemperature();
//        Then
        Assertions.assertEquals(25.5, medianTemperature, 0.01);
    }

}
