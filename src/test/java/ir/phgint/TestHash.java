package ir.phgint;

import ir.phgint.Classes.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Classes.Janevaran.*;

public class TestHash {
    Animals animals;
    Humans humans;
    Birds birds;

    private Profile profileAnimal;
    private Profile profileHumans;
    private Profile profileBirds;

    @Before
    public void initObjectJanevaran() {

        profileAnimal = ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals = AnimalsBuilder.getAnimalsInstance(profileAnimal).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileBirds = ProfileBuilder.getProfileInstance().name("Ordak").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        birds = BirdsBuilder.getBirdsInstance(profileBirds).canFly(true).hasFeather(true).build();

        profileHumans = ProfileBuilder.getProfileInstance().name("Mina").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        humans = HumansBuilder.getHumansInstance(profileHumans).age(Ages.Baby).gender(Gender.Female).build();

    }

    @Test
    public void getHashAnimalsTest() {

        int hash = animals.hashCode();
        Assert.assertEquals(hash, animals.hashCode());
    }

    @Test
    public void getHashHumansTest() {
        int hash = humans.hashCode();
        Assert.assertEquals(hash, humans.hashCode());
    }

    @Test
    public void getHashBirdsTest() {

        int hash = birds.hashCode();
        Assert.assertEquals(hash, birds.hashCode());

    }


}
