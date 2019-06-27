package com.greekk.damaged.cities;

import java.util.Objects;

public class Damage extends EntitySize {

    public Damage(EntitySize entity){
        while(true){
            this.length = Math.round(Math.random()*100);
            this.width = Math.round(Math.random()*100);
            if((this.length <= (entity.length-2)&& this.length > 0)
                    && (this.width <= (entity.width-2) && this.width > 0))
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Damage damage = (Damage) o;
        return Float.compare(damage.length, length) == 0 &&
                Float.compare(damage.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}
