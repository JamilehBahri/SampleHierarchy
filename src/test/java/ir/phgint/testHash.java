package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jamile on 11/06/2017.
 */
public class TestHash {
    Animals animals;
    Humans humans;
    Birds birds;

    @Before
    public void initObjectJanevaran() {

        Profile profileAnimals= Profile.getProfileInstance("Dog", Foods.Vegetarian, "Hop Hop", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans= Profile.getProfileInstance("Dog", Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous);
        Profile profileBirds= Profile.getProfileInstance("Eugle", Foods.Vegetarian, "ji ji", Habitats.Dry, Pregnant.Viviparous);

        animals =  Animals.getAnimalsInstance(profileAnimals);
        humans = Humans.getHumansInstance(profileHumans);
        birds = Birds.getBirdsInstance(profileBirds);
    }

    @Test
    public void getHashAnimalsTest() {

        int hash = animals.hashCode();
        Assert.assertEquals(hash,animals.hashCode());
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
