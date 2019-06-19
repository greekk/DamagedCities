package com.greekk.damaged.cities;

import java.util.ArrayList;
import java.util.List;

public class Street extends CityEntity {

    public List<Park> parks;

    public void addPark(String name, float length, float width){
        this.parks.add(new Park(name, length, width));
    }

    //constructor
    public Street(String name, float length, float width){
        super(name, length, width);
        parks = new ArrayList<Park>();
    }

}
