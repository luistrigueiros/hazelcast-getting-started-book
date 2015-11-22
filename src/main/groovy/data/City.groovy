package data

import groovy.transform.Canonical

@Canonical
class City implements Serializable {
    private String name;
    private String country;
    private int population;

    City(String name, String country, int population) {
        this.name = name
        this.country = country
        this.population = population
    }
}
