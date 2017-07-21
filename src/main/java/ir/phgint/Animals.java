package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;

public class Animals extends Mammals {
    private AnimalBehavior animalBehavior;
    private boolean isQuadruped;

    private Animals(Profile profile) {
        super(profile);
    }
    private Animals(String name, AnimalBehavior animalBehavior, boolean isQuadruped, Foods foods, String t,
                   Habitats habitats, Pregnant pregnant, boolean hasHair, boolean hasBackbone) {
        super(name, foods, t, habitats, pregnant, hasHair, hasBackbone);
        this.animalBehavior = animalBehavior;
        this.isQuadruped = isQuadruped;
    }
     private Animals(Animals animals) {
        super(animals);
        animalBehavior = animals.animalBehavior;
        isQuadruped = animals.isQuadruped;
    }


    protected static Animals getAnimalsInstance(Profile profile)  {
        return new Animals(profile);
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
        return "Animals{" +
                "animalBehavior=" + animalBehavior +
                ", isQuadruped=" + isQuadruped +
                '}';
    }

     public boolean equals(Animals animals) {
        if ( animals== this)
            return true;
        if (animals==null)
            return false;
        return super.equals(animals) && (this.animalBehavior == animals.animalBehavior) && (this.isQuadruped == animals.isQuadruped) ;
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

    public void deepCopyFrom(Animals animals)  {

       Animals animal=new Animals(animals);

    }

    public Animals deepCopy()  {

        return new Animals(this);
    }

    public void shallowCopyFrom(Animals animals) {

        this.animalBehavior =animals.animalBehavior;
        this.isQuadruped=animals.isQuadruped;
    }

    public Animals shallowCopy() {

        Animals j = new Animals(this);
        j.animalBehavior = this.animalBehavior;
        j.isQuadruped=this.isQuadruped;
        return j;
    }


    public int compareTo(Animals o) {

        int res= super.compareTo(o) ;
        if(res==0)
        {
            if (animalBehavior!=null)
                res=  animalBehavior.compareTo(o.animalBehavior);
        }
        return res;


    }
}
