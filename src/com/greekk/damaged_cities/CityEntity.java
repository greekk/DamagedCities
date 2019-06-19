package com.greekk.damaged_cities;

public class CityEntity extends EntitySize{
    protected String name;
    protected Damage damage;

    private Damage makeDamage(){
        float damageLength, damageWidth;
        while(true){
            damageLength = Math.round(Math.random()*100);
            damageWidth = Math.round(Math.random()*100);
            if((damageLength <= (this.length-2)&& damageLength > 0) && (damageWidth <= (this.width-2) && damageWidth > 0))
                break;
        }
        return new Damage(damageLength, damageWidth);
    }

    public CityEntity(String name, float length, float width){
        this.name = name;
        this.length = length;
        this.width = width;
        this.damage = makeDamage();
    }
    //returns damaged area
    public float getDamageArea(){
        return this.damage.getArea();
    }

}
