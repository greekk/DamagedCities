package com.greekk.damaged.cities;

import java.util.*;

public final class CitiesUtil {

    private CitiesUtil(){ }


    //adding the city
    public static void addCity(String cityName, Map cities){

        cities.put(cityName, new City(cityName));
    }

    public static float calculateDamage(Collection<? extends Damagable> entities){
        float commonDamage = 0;
        for(Damagable item : entities) {
            commonDamage += item.getDamage();
        }
        return commonDamage;
    }

    public static float getArea(Collection<? extends Measurable> entities){
        float area = 0;
        for (Measurable entity : entities) {
            area += entity.getArea();
        }
        return area;
    }


}
