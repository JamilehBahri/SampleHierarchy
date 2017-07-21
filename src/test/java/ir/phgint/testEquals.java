package ir.phgint;

import ir.phgint.Enum.*;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class testEquals {

    private Animals animals1, animals2, a4;
    private Humans humans1, humans2;
    private Birds birds1, birds2;

    @Before
    public void initObjectJanevaran() {
        Profile profileAnimals1 = Profile.getProfileInstance("Dog", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileAnimals2 = Profile.getProfileInstance("Cat", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);

        animals1 = Animals.getAnimalsInstance(profileAnimals1);
        animals2 = Animals.getAnimalsInstance(profileAnimals2);

        Profile profileHumans1 = Profile.getProfileInstance("Mina", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans2 = Profile.getProfileInstance("Ali", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        humans1 = Humans.getHumansInstance(profileHumans1);
        humans2 = Humans.getHumansInstance(profileHumans2);

        Profile profileBirds1 = Profile.getProfileInstance("Eugle", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileBirds2 = Profile.getProfileInstance("ordak", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        birds1 = Birds.getBirdsInstance(profileBirds1);
        birds2 = Birds.getBirdsInstance(profileBirds2);

    }

    @Test
    public void testEqualsAnimalsRef() {
        Assert.assertTrue(animals1.equals(animals2));
    }

    @Test
    public void testEqualsAnimalsValue() {
        Assert.assertFalse(animals1.getProfile().equals(animals2.getProfile()));
    }

    @Test
    public void testEqualsHummansRef() {
        Assert.assertTrue(humans1.equals(humans2));
    }

    @Test
    public void testEqualsHummansvalue() {
        Assert.assertFalse(humans1.getProfile().equals(humans2.getProfile()));
    }

    @Test
    public void testEqualsBirdsRef() {
        Assert.assertTrue(birds1.equals(birds2));
    }

    @Test
    public void testEqualsBirdsValue() {
        Assert.assertFalse(birds1.getProfile().equals(birds2.getProfile()));

    }

    @Test
    public void testNotNullEqualsAnimals() {
        Assert.assertNotNull(animals1);
    }

    @Test
    public void testNullEqualsAnimals() {
        Assert.assertNull(a4);
    }


}
