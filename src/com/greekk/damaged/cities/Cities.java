package com.greekk.damaged.cities;

import java.util.*;

public final class Cities {

    private Cities(){ }

    static Map<String, City> cities = new HashMap<String, City>();

    //adding the city
    public static void addCity(String cityName){
        cities.put(cityName, new City());
    }

    //adding street to the sity
    public static void addStreet(String cityName, String streetName, float length, float width){
        try{
            cities.get(cityName).streets.add(new Street(streetName , length, width));
        }
        catch(NullPointerException ex){
            System.out.println("No such city!");
        }
    }

    //adding park on the street
    public static void addPark(String cityName, String streetName, String parkName, float length, float width){
        try{
            City city = cities.get(cityName);
            city.getStreet(streetName).parks.add(new Park(parkName, length, width));
        }
        catch(NullPointerException ex){
            System.out.println("No such city!");
        }
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
