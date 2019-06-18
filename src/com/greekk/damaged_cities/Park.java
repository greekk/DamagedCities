package com.greekk.damaged_cities;

public class Park extends CityEntity{
    //add for fun
    private int amountOfBenches;

    public Park(String parkName, float parkLength, float parkWidth){
        super(parkName, parkLength, parkWidth);
        this.amountOfBenches = 200;
    }

}
