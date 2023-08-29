package com.kodilla.testing.weather.stub;
import java.util.*;
import java.util.Collections;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature(){
        Map<String, Double>temperatureData = temperatures.getTemperatures();
        double totalTemperature = 0.0;

        for(double temperature: temperatureData.values()){
            totalTemperature += temperature;
        }
        return totalTemperature / temperatureData.size();
    }

    public double calculateMedianTemperature(){
        List<Double>temperatureList = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temperatureList);

        int size = temperatureList.size();

        if (size % 2 == 0){
            int middleIndex = 0;
            double middleValue1 = temperatureList.get(middleIndex - 1);
            double middleValue2 = temperatureList.get(middleIndex);
            return (middleValue1 + middleValue2) / 2;
        } else {
            int middleIndex = size / 2;
            return temperatureList.get(middleIndex);
        }

    }
}
