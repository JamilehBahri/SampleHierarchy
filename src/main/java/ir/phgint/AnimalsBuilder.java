package ir.phgint;

import ir.phgint.Janevaran.*;

public class AnimalsBuilder {

    private Profile profile;
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
        Animals a = Animals.getAnimalsInstance(profile);
        if (a == null) throw new NullPointerException("Profile Is Null");
        a.setProfile(profile);
        return a;
    }

    private AnimalsBuilder(Animals animal, Profile pb) {

        if (animal != null) {
            animals.setAnimalBehavior(animal.getAnimalBehavior());
            animals.setIsQuadruped(animal.getIsQuadruped());
        } else if (pb != null)
            profile = pb;
        else {
            animalBehavior(animal.getAnimalBehavior());
            isQuadruped(animal.getIsQuadruped());

        }
    }

}
