package com.greekk.damaged.cities;

import java.util.ArrayList;
import java.util.List;

public class Street extends EntitySize {

    private List<Park> parks;

    //adding park on the street
    public void addPark(String name, float length, float width){
        this.parks.add(new Park(name, length, width));
    }

    //constructor
    public Street(String name, float length, float width){
        super(name, length, width);
        parks = new ArrayList<Park>();
    }

    public String getName(){
        return this.name;
    }



}
