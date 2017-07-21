package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestComprable {

    private Animals animals1, animals2, animals3, animals4;
    private Humans humans1, humans2, humans3, humans4;
    private Birds birds1, birds2, birds3, birds4;

    @Before
    public void initObjectJanevaran() {

        Profile profileAnimals1 = Profile.getProfileInstance("Dog", Foods.Vegetarian, "HOP HOP", Habitats.Dry, Pregnant.Viviparous);
        Profile profileAnimals2 = Profile.getProfileInstance("Dog", Foods.Vegetarian, "HOP HOP", Habitats.Dry, Pregnant.Viviparous);
        Profile profileAnimals3 = Profile.getProfileInstance("Cat", Foods.Vegetarian, "MIO", Habitats.Dry, Pregnant.Viviparous);
        Profile profileAnimals4 = Profile.getProfileInstance("Lion", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Marsupial);

        Profile profileHumans1 = Profile.getProfileInstance("Mina", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans2 = Profile.getProfileInstance("Mina", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans3 = Profile.getProfileInstance("Ali", Foods.Carnivorous, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans4 = Profile.getProfileInstance("Reza", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);


        Profile profileBirds1 = Profile.getProfileInstance("ordak", Foods.Vegetarian, " JI JI", Habitats.Dry, Pregnant.Viviparous);
        Profile profileBirds2 = Profile.getProfileInstance("ordak", Foods.Vegetarian, " JI JI", Habitats.Dry, Pregnant.Viviparous);
        Profile profileBirds3 = Profile.getProfileInstance("Eugle", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileBirds4 = Profile.getProfileInstance("ordak", Foods.Vegetarian, "Voice", Habitats.Lake, Pregnant.Viviparous);


        animals1 = Animals.getAnimalsInstance(profileAnimals1);
        animals2 = Animals.getAnimalsInstance(profileAnimals2);
        animals3 = Animals.getAnimalsInstance(profileAnimals3);
        animals4 = Animals.getAnimalsInstance(profileAnimals4);

        humans1 = Humans.getHumansInstance(profileHumans1);
        humans1.setGender(Gender.Female);
        humans2 = Humans.getHumansInstance(profileHumans2);
        humans2.setGender(Gender.Female);
        humans3 = Humans.getHumansInstance(profileHumans3);
        humans4 = Humans.getHumansInstance(profileHumans4);

        birds1 = Birds.getBirdsInstance(profileBirds1);
        birds2 = Birds.getBirdsInstance(profileBirds2);
        birds3 = Birds.getBirdsInstance(profileBirds3);
        birds4 = Birds.getBirdsInstance(profileBirds4);
    }

    @Test
    public void compareEqualsAnimalsTest() {

        Assert.assertEquals(animals1.compareTo(animals2), 0);
    }

    @Test
    public void compareGreaterAnimalsTest() {

        Assert.assertEquals(animals1.compareTo(animals3), 1);
    }

    @Test
    public void compareSmallerAnimalsTest() {

        Assert.assertEquals(animals1.compareTo(animals4), -1);
    }

    @Test
    public void compareEqualsHumansTest() {

        Assert.assertEquals(humans1.compareTo(humans2), 0);
    }

    @Test
    public void compareGreaterHumansTest() {

        Assert.assertEquals(humans1.compareTo(humans3), 1);
    }

    @Test
    public void compareSmallerHumansTest() {
        Assert.assertEquals(humans1.compareTo(humans4), -1);
    }

    @Test
    public void compareEqualsBirdsTest() {

        Assert.assertEquals(birds1.compareTo(birds2), 0);
    }

    @Test
    public void compareGreaterBirdsTest() {

        Assert.assertEquals(birds1.compareTo(birds3), 1);
    }

    @Test
    public void compareSmallerBirdsTest() {

        Assert.assertEquals(birds1.compareTo(birds4), -1);
    }

}
