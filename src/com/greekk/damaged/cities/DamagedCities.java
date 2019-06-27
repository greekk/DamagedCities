package com.greekk.damaged.cities;

import java.util.HashMap;
import java.util.Map;

import static com.greekk.damaged.cities.CitiesUtil.*;

public class DamagedCities {

    static Map<String, City> cities = new HashMap<String, City>();

    String str = "String";

    public static void main(String[] args) {

        //adding of citiess
        addCity("Рудный", cities);
        addCity("Костанай", cities);
        addCity("Лисаковск", cities);
        //adding streets to the cities
        City rudny = cities.get("Рудный");
        City kostanay = cities.get("Костанай");
        City lisakovsk = cities.get("Лисаковск");
        rudny.addStreet("Ленина", 500f, 8f);
        rudny.addStreet("Свердлова", 600f, 4.5f);
        rudny.addStreet("Тарана", 400f, 9.5f);
        for (Street street : rudny.getStreets()) {
            street.setDamage( new Damage(street));
        }
        kostanay.addStreet("Василевского", 900f, 8.5f);
        kostanay.addStreet("Жукова", 500.56f, 7.6f);
        kostanay.addStreet("Победы", 800f, 8f);
        for (Street street : kostanay.getStreets()) {
            street.setDamage( new Damage(street));
        }
        lisakovsk.addStreet("Бородина", 500f, 9f);
        lisakovsk.addStreet("Плеханова", 300f, 7f);
        lisakovsk.addStreet("Чайковского", 1000f, 5f);
        for (Street street : lisakovsk.getStreets()) {
            street.setDamage( new Damage(street));
        }
        //adding parks on the streets of cities
        rudny.addPark("Центральный",500f, 600f, rudny.getStreet("Ленина"));
        kostanay.addPark("Центральный", 900f, 700f,  kostanay.getStreet("Василевского"));
        kostanay.addPark("Победы",500.56f, 300f, kostanay.getStreet("Жукова"));
        lisakovsk.addPark("Горняцкий" ,300f, 200f, lisakovsk.getStreet("Плеханова"));

        //calculate common street area int the particular city
        float area = getArea(cities.get("Рудный").getStreets());
        System.out.println(area);

        calculateDamage(lisakovsk.getStreets());
        System.out.println(calculateDamage(lisakovsk.getStreets()));

        //System.out.println("damaged area on the streets in the all cities " + calculateStreetDamageInCities()+ " square meters.");
    }
}
