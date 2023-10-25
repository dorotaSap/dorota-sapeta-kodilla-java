package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    private Map<String, Boolean> aiportMap;

    public FlightSearch(){
        aiportMap = new HashMap<>();
        aiportMap.put("Krakow", true);
        aiportMap.put("JFK", false);
        aiportMap.put("Heatrow", true);
        aiportMap.put("AMS", true);
    }
    public void findFilght(Flight flight) throws RouteNotFoundException{
        String arrivalAirport = flight.getArrivalAirport();
        if (aiportMap.containsKey(arrivalAirport) && aiportMap.get(arrivalAirport)){
            System.out.println("Lot znaleziony z " + flight.getDepartureAirport() + " do " + arrivalAirport);
        }else {
            throw new RouteNotFoundException("Nie można znależć trasy na lotnisko " + arrivalAirport);
        }
    }
}
