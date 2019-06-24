package com.greekk.damaged.cities;

import java.util.Objects;

public class Park extends EntitySize{
    //added just for fun
    private int amountOfBenches;
    private String name;

    public Park(String name, float length, float width){
        this.name = name;
        this.length = length;
        this.width = width;
        this.amountOfBenches = 200;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Park park = (Park) o;
        return amountOfBenches == park.amountOfBenches &&
                name.equals(park.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfBenches, name);
    }
}
