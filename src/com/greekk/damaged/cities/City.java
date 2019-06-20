package com.greekk.damaged.cities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class City {

    private Set<Street> streets;

    private String cityName;

    public City(String cityName){
        this.cityName = cityName;
        streets = new HashSet<Street>();
    }

    public Street getStreet(String streetName){
        for (Street street: this.streets) {
            if(street.name == streetName)
                return street;
        }
        return null;
    }
    public String getName(){
        return this.cityName;
    }

    //adding street to the sity
    public void addStreet(String streetName, float length, float width){
        Street street = new Street(streetName , length, width);
        this.streets.add(street);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(streets, city.streets) &&
                cityName.equals(city.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streets, cityName);
    }
}
