package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args){
        FlightSearch flightSearch = new FlightSearch();
        try {
            Flight validFlight = new Flight("Krakow", "AMS");
            flightSearch.findFilght(validFlight);
            Flight invalidFlight = new Flight("Krakow", "JFK");
            flightSearch.findFilght(invalidFlight);
        }catch (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
