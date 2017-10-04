package ir.phgint.Classes;

import ir.phgint.Classes.Janevaran.*;

public class AnimalsBuilder {


    private Animals animals;

    public static AnimalsBuilder getAnimalsInstance(Animals animals) {
        return new AnimalsBuilder(animals, null);
    }

    public static AnimalsBuilder getAnimalsInstance(Profile profile) {
        return new AnimalsBuilder(null, profile);
    }

    public static AnimalsBuilder getAnimalsInstance(Animals animals, Profile profile) {
        return new AnimalsBuilder(animals, profile);
    }

    public static AnimalsBuilder getAnimalsInstance() {
        return new AnimalsBuilder(null, null);
    }

    public AnimalsBuilder animalBehavior(AnimalBehavior a) {
        animals.setAnimalBehavior(a);
        return this;
    }

    public AnimalsBuilder isQuadruped(boolean i) {
        animals.setIsQuadruped(i);
        return this;
    }

    public Animals build() {
        if (animals.getAnimalBehavior() == null) throw new NullPointerException("AnimalBehavior Is Null");
        return animals;
    }

    private AnimalsBuilder(Animals a, Profile pb) {

        if (a != null) {
            animals = Animals.getAnimalsInstance(a);
        } else if (pb != null)
            animals = Animals.getAnimalsInstance(pb);
        else if (a != null && pb != null){
            animals = Animals.getAnimalsInstance(pb, a);
        }
        else {
            animals = Animals.getAnimalsInstance();
        }

    }

}
