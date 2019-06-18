package com.greekk.damaged_cities;

public class EntitySize implements Measurable{
    protected float length;
    protected float width;

    @Override
    public float getArea() {
        return this.width * this.length;
    }

}
