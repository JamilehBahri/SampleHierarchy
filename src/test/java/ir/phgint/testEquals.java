package ir.phgint;

import ir.phgint.Enum.*;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class testEquals {

    private Animals animals1,animals2,a4;
    private Humans humans1,humans2,humans3;
    private Birds birds1,birds2;

    @Before
    public  void initObjectJanevaran(){
//        a1 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
//        a2 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
//        a3 =  Animals.getAnimalsInstance("Lion", AnimalBehavior.Wild, true, Foods.Carnivorous, "Kh Kh", Habitats.Jungle, Pregnant.Viviparous, true, true);
        Profile profileAnimals1= Profile.getProfileInstance("Dog", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileAnimals2= Profile.getProfileInstance("Cat", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);

        animals1 =  Animals.getAnimalsInstance(profileAnimals1);
       animals2 =  Animals.getAnimalsInstance(profileAnimals2);

        Profile profileHumans1 = Profile.getProfileInstance("Mina", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans2 = Profile.getProfileInstance("Ali", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        humans1 =  Humans.getHumansInstance(profileHumans1);
        humans2 = Humans.getHumansInstance(profileHumans2);

        Profile profileBirds1 = Profile.getProfileInstance("Eugle", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileBirds2 = Profile.getProfileInstance("ordak", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        birds1 = Birds.getBirdsInstance(profileBirds1);
        birds2 = Birds.getBirdsInstance(profileBirds2);

    }

    @Test
    public  void  testEqualsAnimals() {
        Assert.assertTrue(animals1.equals(animals1));
        Assert.assertTrue(animals1.equals(animals2));
    }
    @Test
    public  void  testEqualsHummans() {
        Assert.assertTrue(humans1.equals(humans1));
        Assert.assertTrue(humans1.equals(humans2));
    }
    @Test
    public  void  testEqualsBirds() {
        Assert.assertTrue(birds1.equals(birds1));
        Assert.assertTrue(birds1.equals(birds2));
    }

    @Test
    public void testNotNullEqualsAnimals(){
        Assert.assertNotNull(animals1);
        Assert.assertNotNull(animals2);

    }
    @Test
    public void testNullEqualsAnimals(){
        Assert.assertNull(a4);
    }


}
