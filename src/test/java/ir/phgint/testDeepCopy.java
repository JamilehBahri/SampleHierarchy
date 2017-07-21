package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testDeepCopy {

    private Animals animals1,animals2;
    private Humans humans1,humans2;
    private Birds birds1,birds2;

    @Before
    public void initObjectJanevaran(){
//        janvar1 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
//        janvar2 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        Profile profileAnimals1 = Profile.getProfileInstance("Dog", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileAnimals2 = Profile.getProfileInstance("Cat", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        animals1 =  Animals.getAnimalsInstance(profileAnimals1);
        animals2 = Animals.getAnimalsInstance(profileAnimals2);

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
    public void testDeepCopyCheckRefAnimals()throws CloneNotSupportedException{
      Assert.assertNotEquals(animals1,animals1.deepCopy());
    }
    @Test
    public void testDeepCopyCheckEqulityAnimals() throws CloneNotSupportedException {
        Animals j1=animals1.deepCopy();
        Animals j2=animals2.deepCopy();
        Assert.assertTrue(j1.equals(j2));

    }
    @Test
    public void testDeepCopyFromCheckRefAnimals() throws CloneNotSupportedException {

        animals1.deepCopyFrom(animals2);
        Assert.assertNotEquals(animals1, animals2);
    }
    @Test
    public void testDeepCopyFromCheckEqulityAnimals() throws CloneNotSupportedException {

        animals1.deepCopyFrom(animals2);
        animals2.deepCopyFrom(animals1);
        Assert.assertTrue(animals1.equals(animals2));
    }

//////////////
    @Test
    public void testDeepCopyCheckRefHumans()throws CloneNotSupportedException{
    Assert.assertNotEquals(humans1,humans1.deepCopy());
}
    @Test
    public void testDeepCopyCheckEqulityHumans() throws CloneNotSupportedException {
        Humans j1=humans1.deepCopy();
        Humans j2=humans2.deepCopy();
        Assert.assertTrue(j1.equals(j2));

    }
    @Test
    public void testDeepCopyFromCheckRefHumans() throws CloneNotSupportedException {

        humans1.deepCopyFrom(humans2);
        Assert.assertNotEquals(humans1, humans2);
    }
    @Test
    public void testDeepCopyFromCheckEqulityHumans() throws CloneNotSupportedException {

        humans1.deepCopyFrom(humans2);
        humans2.deepCopyFrom(humans1);
        Assert.assertTrue(humans1.equals(humans2));
    }
////////////////////
@Test
public void testDeepCopyCheckRefBirds()throws CloneNotSupportedException{
    Assert.assertNotEquals(birds1,birds1.deepCopy());
}
    @Test
    public void testDeepCopyCheckEqulityBirds() throws CloneNotSupportedException {
        Birds j1=birds1.deepCopy();
        Birds j2=birds2.deepCopy();
        Assert.assertTrue(j1.equals(j2));

    }
    @Test
    public void testDeepCopyFromCheckRefBirds() throws CloneNotSupportedException {

        birds1.deepCopyFrom(birds2);
        Assert.assertNotEquals(birds1, birds2);
    }
    @Test
    public void testDeepCopyFromCheckEqulityBirds() throws CloneNotSupportedException {

        birds1.deepCopyFrom(birds2);
        birds2.deepCopyFrom(birds1);
        Assert.assertTrue(birds1.equals(birds2));
    }

}

