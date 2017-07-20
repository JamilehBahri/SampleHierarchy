package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;

/**
 * Created by Jamile on 09/06/2017.
 */
public class Animals extends Mammals  implements Cloneable,Serializable, Comparable<Janevaran>{
    private AnimalBehavior animalBehavior;
    private boolean isQuadruped;


    public Animals(String name, AnimalBehavior animalBehavior, boolean isQuadruped, Foods foods, String t,
                   Habitats habitats, Pregnant pregnant, boolean hasHair, boolean hasBackbone) {
        super(name, foods, t, habitats, pregnant, hasHair, hasBackbone);
        this.animalBehavior = animalBehavior;
        this.isQuadruped = isQuadruped;

    }

    //Copy Constractor
    public Animals(Animals animals) {
        super(animals.getProfile().getName(), animals.getProfile().getFoodType(), animals.getProfile().getTalk(), animals.getProfile().getHabitats(),
                animals.getProfile().getPregnant(), animals.getHasHair(), animals.getHasBackbone());
        animalBehavior = animals.animalBehavior;
        isQuadruped = animals.isQuadruped;

    }




    public void setIsQuadruped(boolean value) {
        this.isQuadruped = value;
    }

    public boolean getIsQuadruped() {
        return isQuadruped;
    }

    public void setAnimalBehavior(AnimalBehavior value) {
        this.animalBehavior = value;
    }

    public AnimalBehavior getAnimalBehavior() {
        return animalBehavior;
    }


    public Foods eat(Foods food) {
        if (food.equals(Foods.Carnivorous))
            return Foods.Carnivorous;
        else if (food.equals(Foods.Herbivorous))
            return Foods.Herbivorous;
        else
            return Foods.Unknown;
    }

    @Override
    public String toString() {
        return "Animal name :" + getProfile().getName() + "\n" +
                "Animal behavior: " + getAnimalBehavior() + "\n" +
                "Animal quadruped :" + getIsQuadruped() + "\n" +
                "Animal eat :" + getProfile().getFoodType() + "\n" +
                "Animal talk:" + getProfile().getTalk() + "\n" +
                "Animal Habitats:" + getProfile().getHabitats() + "\n" +
                "Animal Birth:" + getProfile().getPregnant() + "\n" +
                "Animal hasHair:" + getHasHair() + "\n" +
                "Animal hasBackbone :" + getHasBackbone() + "\n";

    }

    public boolean equals(Animals animals) {
        if ( animals== this)
            return true;
        if(  (animals==null)||
                !( animals instanceof Animals ) )
            return false;

        return super.equals(animals) && (this.animalBehavior != animals.animalBehavior) && (this.isQuadruped != animals.isQuadruped) ;
    }

    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.animalBehavior!= null ? this.animalBehavior.hashCode() : 0);
        hash = 31 * hash + (this.isQuadruped == true ? 1 : 0);
        return hash;
    }

    public Animals clone() throws CloneNotSupportedException {
        return (Animals) super.clone();
    }

    @Override
    public int compareTo(Janevaran o) {

        return super.compareTo(o);

    }
}
