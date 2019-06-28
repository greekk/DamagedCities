package com.greekk.damaged.cities;

import java.util.Objects;

public class Park extends EntitySize implements Damagable{

    private final String name;
    private Damage damage;
    private Street street;

    public Park(String name, float length, float width, Street street){
        this.name = name;
        this.length = length;
        this.width = width;
        this.street = street;
    }

    @Override
    public void setDamage(Damage damage){
        this.damage = damage;
    }

    @Override
    public float getDamage() {
        return this.damage.getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Park park = (Park) o;
        return name.equals(park.name) && this.street.equals(park.street) && this.length == park.length && this.width == park.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.length, this.width);
    }
}
