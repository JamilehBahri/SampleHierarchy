package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jamile on 11/06/2017.
 */
public class testHash {
    Animals animals;
    Humans humans;
    Birds birds;

    @Before
    public void initObjectJanevaran() {

//        animals =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
//        humans =  Humans.getHumansInstance("Mina", Gender.Female, Ages.Teenager, Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous, false, true);
//        birds =  Birds.getBirdsInstance("Eagle", true, true, Foods.Carnivorous, "Ji ... Ji", Habitats.Mountain, Pregnant.Oviparous);
        Profile profileAnimals= Profile.getProfileInstance("Dog", Foods.Vegetarian, "Hop Hop", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans= Profile.getProfileInstance("Dog", Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous);
        Profile profileBirds= Profile.getProfileInstance("Eugle", Foods.Vegetarian, "ji ji", Habitats.Dry, Pregnant.Viviparous);

        animals =  Animals.getAnimalsInstance(profileAnimals);
        humans = Humans.getHumansInstance(profileHumans);
        birds = Birds.getBirdsInstance(profileBirds);
    }

    @Test
    public void getHashAnimals() {

        int hash = animals.hashCode();
        Assert.assertEquals(hash,animals.hashCode());
    }

    @Test
    public void getHashHumans() {
        int hash = humans.hashCode();
        Assert.assertEquals(hash, humans.hashCode());
    }

    @Test
    public void getHashBirds() {

        int hash = birds.hashCode();
        Assert.assertEquals(hash, birds.hashCode());

    }


}
