package com.greekk.damaged.cities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Street extends EntitySize {

    private String name;

    private List<Park> parks;

    //adding park on the street
    public void addPark(String name, float length, float width){
        this.parks.add(new Park(name, length, width));
    }

    //constructor
    public Street(String name, float length, float width){
        this.length = length;
        this.width = width;
        this.name = name;
        parks = new ArrayList<Park>();
    }

    public List<Park> getParks(){
        return this.parks.stream().collect(Collectors.toList());
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return name.equals(street.name) &&
                Objects.equals(parks, street.parks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parks);
    }
}
