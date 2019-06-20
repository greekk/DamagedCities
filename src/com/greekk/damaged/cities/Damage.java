package com.greekk.damaged.cities;

public class Damage extends EntitySize{

    Damage(){

    }

    private void setDamage(EntitySize entity){
        while(true){
            this.length = Math.round(Math.random()*100);
            this.width = Math.round(Math.random()*100);
            if((this.length <= (entity.length-2)&& this.length > 0)
                    && (this.width <= (entity.width-2) && this.width > 0))
                break;
        }
    }

}
