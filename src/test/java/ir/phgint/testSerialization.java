package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Serializable;
import java.util.PrimitiveIterator;

public class TestSerialization {

    private Animals animalNew;
    private Humans humanNew ;
    private Birds birdNew;

    private Animals animals;
    private Humans humans;
    private Birds birds;

    @Before
    public void initObjectJanevaran() {
        Profile profileAnimals= Profile.getProfileInstance("Dog", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans= Profile.getProfileInstance("Dog", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileBirds= Profile.getProfileInstance("Dog", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        animals =  Animals.getAnimalsInstance(profileAnimals);
        humans = Humans.getHumansInstance(profileHumans);
        birds = Birds.getBirdsInstance(profileBirds);
    }

    @Test
    public void serializeAnimalsTest() {
        try {
            Serialization.serialize(animals, "animals.ser");
            animalNew = (Animals) Serialization.deserialize("animals.ser");
            Assert.assertTrue(animals.equals(animalNew));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void serializeHumansTest() {
        try {
            Serialization.serialize(humans, "humans.ser");
            humanNew=(Humans) Serialization.deserialize("humans.ser");
            Assert.assertTrue(humans.equals(humanNew));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void serializeBirdsTest() {
        try {
            Serialization.serialize(birds, "birds.ser");
            birdNew=(Birds)Serialization.deserialize("birds.ser");
            Assert.assertTrue(birds.equals(birdNew));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
