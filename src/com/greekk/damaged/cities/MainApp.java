package com.greekk.damaged.cities;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    static Map<String, City> cities = new HashMap<String, City>();

    public static void main(String[] args) {
        //adding of citiess
        addCity("Рудный");
        addCity("Костанай");
        addCity("Лисаковск");
        //adding streets to the cities
        addStreet("Рудный", "Ленина", 500f, 8f);
        addStreet("Рудный", "Свердлова", 600f, 4.5f);
        addStreet("Рудный", "Тарана", 400f, 9.5f);
        addStreet("Костанай", "Василевского", 900f, 8.5f);
        addStreet("Костанай", "Жукова", 500.56f, 7.6f);
        addStreet("Костанай", "Победы", 800f, 8f);
        addStreet("Лисаковск", "Бородина", 500f, 9f);
        addStreet("Лисаковск", "Плеханова", 300f, 7f);
        addStreet("Лисаковск", "Чайковского", 1000f, 5f);
        addStreet("Los Anglelos", "Чайковского", 1000f, 5f);
        //adding parks on the streets of cities
        addPark("Рудный", "Ленина", "Центарльный",500f, 600f);
        addPark("Костанай", "Василевского","Центральный", 900f, 700f);
        addPark("Костанай", "Жукова", "Победы",500.56f, 300f);
        addPark("Лисаковск", "Плеханова","Горняцкий" ,300f, 200f);

        //calculate common street area int the particular city
        float area = getStreetsArea(cities.get("Рудный").streets);
        System.out.println(area);

        System.out.println("damaged area on the streets in the all cities " + calculateStreetDamageInCities()+ " square meters.");
    }
}
