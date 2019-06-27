package com.greekk.damaged.cities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Street extends EntitySize implements Damagable {


    private String name;
    private final int hash;
    private Damage damage;

    //constructor
    public Street(String name, float length, float width){
        this.name = name;
        this.length = length;
        this.width = width;
        this.hash = Objects.hash(name);
    }

    @Override
    public void setDamage(Damage damage){
        this.damage = damage;
    }

    @Override
    public float getDamage() {
        return this.damage.getArea();
    }

    public String getName(){
        return this.name;
    }

    public float getLength(){
        return this.length;
    }

    public float getWidth(){
        return this.width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return length == street.length &&
                width == street.width &&
                damage.equals(street.damage) &&
                name.equals(street.name);
    }

    @Override
    public int hashCode() {
        return this.hash;
    }
}
