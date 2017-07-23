package ir.phgint;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Janevaran.Profile.*;
import ir.phgint.Janevaran.*;

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

    private Profile profileAnimal;
    private Profile profileHumans;
    private Profile profileBirds;


    @Before
    public void initObjectJanevaran() {

        profileAnimal= Profile.getProfileInstance("Dog", Foods.Carnivorous, "Hop Hop", Habitats.Beach, Pregnant.Viviparous);
        profileAnimal = ProfileBuilder.getProfileInstance(profileAnimal).build();
        animals = AnimalsBuilder.getAnimalsInstance(profileAnimal).build();

        profileHumans= Profile.getProfileInstance("Mina", Foods.Vegetarian, "Voice", Habitats.Beach, Pregnant.Viviparous);
        profileHumans = ProfileBuilder.getProfileInstance(profileHumans).build();
        humans = HumansBuilder.getHumansInstance(profileHumans).build();

        profileBirds= Profile.getProfileInstance("Ordak", Foods.Carnivorous, "Voice", Habitats.Beach, Pregnant.Viviparous);
        profileBirds = ProfileBuilder.getProfileInstance(profileBirds).build();
        birds = BirdsBuilder.getBirdsInstance(profileBirds).build();


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
