package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;

/**
 * Created by Jamile on 09/06/2017.
 */
public class Birds extends Janevaran  implements Cloneable,Serializable, Comparable<Janevaran> {
    private boolean canFly;
    private boolean hasFeather;


    public Birds(String name, boolean canFly, boolean hasFeather, Foods foods, String t, Habitats habitats, Pregnant pregnant) {
        super(name, foods, t, habitats, pregnant);
        this.canFly = canFly;
        this.hasFeather = hasFeather;

    }

    //Copy Constractor
    public Birds(Birds birds) {
        super(birds.getProfile().getName(), birds.getProfile().getFoodType(), birds.getProfile().getTalk(),
                birds.getProfile().getHabitats(), birds.getProfile().getPregnant());
        canFly = birds.canFly;
        hasFeather = birds.hasFeather;

    }


    public void setCanFly(boolean value) {
        this.canFly = value;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setHasFeather(boolean value) {
        this.hasFeather = value;
    }

    public boolean getHasFeather() {
        return hasFeather;
    }


    public Foods eat(Foods food) {
        if (food.equals(Foods.Carnivorous))
            return Foods.Carnivorous;
        else if (food.equals(Foods.Vegetarian))
            return Foods.Vegetarian;
        else
            return Foods.Unknown;


    }

    public String toString() {
        return "Birds name :" + getProfile().getName() + "\n" +
                "Birds CanFly :" + getCanFly() + "\n" +
                "Birds HasFeather :" + getHasFeather() + "\n" +
                "Birds eat :" + getProfile().getFoodType() + "\n" +
                "Birds talk:" + getProfile().getTalk() + "\n" +
                "Birds Habitats:" + getProfile().getHabitats() + "\n" +
                "Birds Birth:" + getProfile().getPregnant() + "\n";

    }

    public boolean equals(Birds birds) {

        if ( birds== this)
            return true;
        if(  (birds==null)||
                !( birds instanceof Birds ) )
            return false;

        return super.equals(birds)&&  (this.canFly != birds.canFly)&& (this.hasFeather != birds.hasFeather);
    }

    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.canFly == true ? 1 : 0);
        hash = 31 * hash + (this.hasFeather == true ? 1 : 0);
        return hash;
    }

    public Birds clone() throws CloneNotSupportedException {
        return (Birds) super.clone();
    }

    public int compareTo(Janevaran o) {

        return super.compareTo(o);

    }
}
