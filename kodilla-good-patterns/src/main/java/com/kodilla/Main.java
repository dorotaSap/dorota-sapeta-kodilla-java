package com.kodilla;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movies = movieStore.getMovies();

        String result = movies.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .reduce((title1, title2) -> title1 + "! " + title2)
                .orElse("");

        System.out.println(result);
    }
}