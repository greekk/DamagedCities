package com.greekk.damaged_cities;


import java.util.HashSet;
import java.util.Set;

public class City {

    Set<Street> streets;

    public City(){
        streets = new HashSet<Street>();
    }

    public Street getStreet(String streetName){
        for (Street street: this.streets) {
            if(street.name == streetName)
                return street;
        }
        return null;
    }

}
