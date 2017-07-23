package ir.phgint;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Janevaran.*;

import java.io.IOException;

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

        profileAnimal =  ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals = AnimalsBuilder.getAnimalsInstance(profileAnimal).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileBirds =  ProfileBuilder.getProfileInstance().name("Ordak").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        birds = BirdsBuilder.getBirdsInstance(profileBirds).canFly(true).hasFeather(true).build();

        profileHumans=  ProfileBuilder.getProfileInstance().name("Mina").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        humans = HumansBuilder.getHumansInstance(profileHumans).age(Ages.Baby).gender(Gender.Female).build();

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
