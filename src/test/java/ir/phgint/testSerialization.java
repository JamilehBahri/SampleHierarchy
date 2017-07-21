package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Serializable;
import java.util.PrimitiveIterator;

public class testSerialization {

    private Animals animalNew;
    private Humans humanNew ;
    private Birds birdNew;

    private Animals animals;
    private Humans humans;
    private Birds birds;

    @Before
    public void initObjectJanevaran() {
        animals =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        humans =  Humans.getHumansInstance("Mina", Gender.Female, Ages.Teenager, Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous, false, true);
        birds =  Birds.getBirdsInstance("Eagle", true, true, Foods.Carnivorous, "Ji ... Ji", Habitats.Mountain, Pregnant.Oviparous);
    }

    @Test
    public void testSerializeAnimals() {
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
    public void testSerializeHumans() {
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
    public void testSerializeBirds() {
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
