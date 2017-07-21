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
        animals = Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        humans = Humans.getHumansInstance("Mina", Gender.Female, Ages.Teenager, Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous, false, true);
        birds = Birds.getBirdsInstance("Eagle", true, true, Foods.Carnivorous, "Ji ... Ji", Habitats.Mountain, Pregnant.Oviparous);
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
