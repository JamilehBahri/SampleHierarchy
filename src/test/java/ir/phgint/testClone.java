package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestClone {

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
    public void animalsCloneValueTest(){
        try {
            Animals cloneAnimal = (Animals) animals.clone();
            Assert.assertTrue("animals  and cloneAnimal  is equal", (animals.equals(cloneAnimal)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void animalsCloneRefTest(){
        try {
            Animals cloneAnimal = (Animals) animals.clone();
            Assert.assertNotEquals(animals, cloneAnimal);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void animalsCloneRefProfileTest(){
        try {
            Animals cloneAnimal = (Animals) animals.clone();
            Assert.assertEquals(animals.getProfile(), cloneAnimal.getProfile());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void humansCloneValueTest(){
        try {
            Humans cloneHumans = (Humans) humans.clone();
            Assert.assertTrue("humans  and cloneHumans  is equal", (humans.equals(cloneHumans)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void humansCloneRefTest(){
        try {
            Humans cloneHumans = (Humans) humans.clone();
            Assert.assertNotEquals(humans, cloneHumans);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void humansCloneRefProfileTest(){
        try {
            Humans cloneHumans = (Humans) humans.clone();
            Assert.assertEquals(humans.getProfile(), cloneHumans.getProfile());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void birdsCloneValueTest(){
        try {
            Birds cloneBirds = (Birds) birds.clone();
            Assert.assertTrue("birds  and cloneBirds  is equal", (birds.equals(cloneBirds)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void birdsCloneRefTest(){
        try {
            Birds cloneBirds = (Birds) birds.clone();
            Assert.assertNotEquals(birds,cloneBirds);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void birdsCloneRefProfileTest(){
        try {
            Birds cloneBirds = (Birds) birds.clone();
            Assert.assertEquals(birds.getProfile(),cloneBirds.getProfile());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
