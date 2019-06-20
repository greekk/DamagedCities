package com.greekk.damaged.cities;

public class EntitySize implements Measurable{
    protected float length;
    protected float width;

    private EntitySize(){
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public float getArea() {
        return this.width * this.length;
    }
}
