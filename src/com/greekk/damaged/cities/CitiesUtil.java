package com.greekk.damaged.cities;

import java.util.*;

public final class CitiesUtil {

    private CitiesUtil(){ }

    public static void <? extends CityEntity>addEntity(){

    }

    //adding the city
    public static void addCity(String cityName){
        cities.put(cityName, new City());
    }

    //returns the total damage on the streets in the cities
    public static float calculateStreetDamageInCities(){
        float streetsDamage = 0;
        for(Map.Entry<String, City> item : cities.entrySet()) {
            City city = item.getValue();
            for(Street street : city.streets){
                streetsDamage += street.getDamageArea();
            }
        }

        return streetsDamage;
    }
    //returns the total damage in the parks in the cities
    public static float calculateParkDamageInCities(){
        float parksDamage = 0;
        for(Map.Entry<String, City> item : cities.entrySet()) {
            City city = item.getValue();
            for(Street street : city.streets){
                for (Park park: street.parks) {
                    parksDamage += park.getDamageArea();
                }
            }
        }
        return parksDamage;
    }

    public static float getStreetsArea(Set<? extends Measurable> entitySet){
        float area = 0;
        for (Measurable enity : entitySet) {
            area += enity.getArea();
        }
        return area;
    }

}
