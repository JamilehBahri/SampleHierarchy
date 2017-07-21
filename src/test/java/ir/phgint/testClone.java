package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testClone {

    private Animals animals;
    private Humans humans;
    private Birds birds;

    @Before
    public void initObjectJanevaran(){
        Profile profileAnimals= Profile.getProfileInstance("Dog", Foods.Vegetarian, "Hop Hop", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans= Profile.getProfileInstance("Dog", Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous);
        Profile profileBirds= Profile.getProfileInstance("Eugle", Foods.Vegetarian, "ji ji", Habitats.Dry, Pregnant.Viviparous);

        animals =  Animals.getAnimalsInstance(profileAnimals);
        animals.setAnimalBehavior(AnimalBehavior.Domestic);
        animals.setHasHair(true);
        humans = Humans.getHumansInstance(profileHumans);
        birds = Birds.getBirdsInstance(profileBirds);
    }

    @Test
    public void testAnimalsClone(){
        try {
            Animals cloneAnimal = (Animals) animals.clone();
            Assert.assertTrue("animals  and cloneAnimal  is equal", (animals.equals(cloneAnimal)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testHumansClone(){
        try {
            Humans cloneHumans = (Humans) humans.clone();
            Assert.assertTrue("humans  and cloneHumans  is equal", (humans.equals(cloneHumans)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testBirdsClone(){
        try {
            Birds cloneBirds = (Birds) birds.clone();
            Assert.assertTrue("birds  and cloneBirds  is equal", (birds.equals(cloneBirds)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
