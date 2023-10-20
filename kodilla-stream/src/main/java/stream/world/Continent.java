package stream.world;

import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countries;

    public Continent(final String continentName, final List<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
    }
    public List<Country> getCountries(){
        return countries;
    }
}
