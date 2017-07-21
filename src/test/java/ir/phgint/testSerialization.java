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

    @Before
    public void initObjectJanevaran() {

        ProfileBuilder profileBuilderAnimal = new ProfileBuilder().name("Dog").foodType(F.Foods.Carnivorous).talk("Hop Hop")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);
        ProfileBuilder profileBuilderHumans = new ProfileBuilder().name("Mina").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);
        ProfileBuilder profileBuilderBirds = new ProfileBuilder().name("Canary").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);

        animals =  Animals.getAnimalsInstance(profileBuilderAnimal.build());
        humans = Humans.getHumansInstance(profileBuilderHumans.build());
        birds = Birds.getBirdsInstance(profileBuilderBirds.build());
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
