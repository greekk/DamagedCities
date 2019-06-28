package com.greekk.damaged.cities;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class City {

    private Set<Street> streets;

    private List<Park> parks;

    private final String cityName;

    public City(String cityName){
        this.cityName = cityName;
        streets = new HashSet<Street>();
        this.parks = new ArrayList<Park>();
    }

    public Street getStreet(String streetName){
        for (Street street: this.streets) {
            if(street.getName().equals(streetName))
                return street;
        }
        return null;
    }

    public List<Street> getStreets(){
        return this.streets.stream()
                .collect(Collectors.toList());
    }

    public List<Park> getParks(){
        return this.parks.stream()
                .collect(Collectors.toList());
    }

    public String getCityName(){
        return this.cityName;
    }

    //adding street to the sity
    public void addStreet(String streetName, float length, float width){
        Street street = new Street(streetName , length, width);
        this.streets.add(street);
    }

    //adding park on the street
    public void addPark(String name, float length, float width, Street street){

        this.parks.add(new Park(name, length, width, street));
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
