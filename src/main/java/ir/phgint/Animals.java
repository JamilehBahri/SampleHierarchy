package ir.phgint;

public class Animals  extends Mammals{

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

    private Animals(Profile p, Animals animals) {
        super(p);
        this.animalBehavior = animals.animalBehavior;
        this.isQuadruped = animals.isQuadruped;
    }

    private Animals(Animals animals, AnimalBehavior animalBehavior, boolean isQuadruped) {
        super(animals);
        animals.animalBehavior = animalBehavior;
        animals.isQuadruped = isQuadruped;
    }

    private Animals(Animals animals) {
        super(animals);
        this.animalBehavior = animals.animalBehavior;
        this.isQuadruped = animals.isQuadruped;
    }
    private Animals() {
        super();
    }

    public static Animals getAnimalsInstance(Profile profile, Animals animals) {
        return new Animals(profile, animals);
    }

    public static Animals getAnimalsInstance(Profile profile) {
        return new Animals(profile);
    }

    public static Animals getAnimalsInstance(Animals animals) {
        return new Animals(animals);
    }
    public static Animals getAnimalsInstance() {
        return new Animals();
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
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Animals{");
        sb.append("animalBehavior=").append(animalBehavior);
        sb.append(", isQuadruped=").append(isQuadruped);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Animals animals) {
        if (animals == this)
            return true;
        if (animals == null)
            return false;
        return super.equals(animals) && (this.animalBehavior == animals.animalBehavior) && (this.isQuadruped == animals.isQuadruped);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.animalBehavior != null ? this.animalBehavior.hashCode() : 0);
        hash = 31 * hash + (this.isQuadruped == true ? 1 : 0);
        return hash;
    }

    public Animals clone() throws CloneNotSupportedException {
        Animals aa = (Animals) super.clone();
        aa.animalBehavior = animalBehavior;
        aa.isQuadruped = isQuadruped;
        return aa;
    }

    public void deepCopyFrom(Animals animals) {
        super.deepCopyFrom(animals);
        this.animalBehavior = animals.animalBehavior;
        this.isQuadruped = animals.isQuadruped;
    }

    public Animals deepCopy() {
        Animals animals = (Animals) super.deepCopy();
        animals.animalBehavior = this.animalBehavior;
        animals.isQuadruped = this.isQuadruped;
        return animals;
    }

    public void shallowCopyFrom(Animals animals) {
        super.shallowCopyFrom(animals);
        this.animalBehavior = animals.animalBehavior;
        this.isQuadruped = animals.isQuadruped;
    }

    public Animals shallowCopy() {

        Animals a = (Animals) super.shallowCopy();
        a.animalBehavior = this.animalBehavior;
        a.isQuadruped = this.isQuadruped;
        return a;
    }


    public int compareTo(Animals o) {

        int res = super.compareTo(o);
        if (res == 0) {
            if (animalBehavior != null)
                if (animalBehavior.compareTo(o.animalBehavior) > 0)
                    return 1;
                else if (animalBehavior.compareTo(o.animalBehavior) < 0)
                    return -1;
                else {
                    if (Boolean.valueOf(isQuadruped).compareTo(Boolean.valueOf(o.isQuadruped)) > 0)
                        return 1;
                    else if (Boolean.valueOf(isQuadruped).compareTo(Boolean.valueOf(o.isQuadruped)) < 0)
                        return -1;
                    else return 0;
                }
        }
        return res;
    }


}
