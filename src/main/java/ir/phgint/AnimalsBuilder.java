package ir.phgint;

import ir.phgint.Janevaran.*;

public class AnimalsBuilder {

    private Profile profile;
    private Animals animals;

    public static AnimalsBuilder getAnimalsInstance(Animals animals) {
        return new AnimalsBuilder(animals);
    }

    public static AnimalsBuilder getAnimalsInstance(Profile profile) {
        return new AnimalsBuilder(profile);
    }

    public static AnimalsBuilder getAnimalsInstance(Animals animals, Profile profile) {
        return new AnimalsBuilder(animals, profile);
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
        a.setProfile(profile);
        return a;
    }

    private AnimalsBuilder(Animals animal, Profile pb) {

        animals.setAnimalBehavior(animal.getAnimalBehavior());
        animals.setIsQuadruped(animal.getIsQuadruped());
        profile = pb;
    }
    private AnimalsBuilder(Animals animal) {

        animals.setAnimalBehavior(animal.getAnimalBehavior());
        animals.setIsQuadruped(animal.getIsQuadruped());

    }
    private AnimalsBuilder(Profile pb) {

        profile = pb;
    }

}
