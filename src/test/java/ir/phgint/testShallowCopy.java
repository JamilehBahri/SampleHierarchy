package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testShallowCopy {

    private Animals animals1,animals2;
    private Humans humans1,humans2;
    private Birds birds1,birds2;

    @Before
    public void initObjectJanevaran() {

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
    public void testShallowCopyCheckRefAnimals() throws CloneNotSupportedException {

        Assert.assertTrue(animals1.equals(animals1.shallowCopy()));
    }
    @Test
    public void testShallowCopyCheckEqulityAnimals() throws CloneNotSupportedException {
        Animals j1=animals1.shallowCopy();
        Animals j2=animals2.shallowCopy();
        Assert.assertTrue(j1.equals(j2));
    }
    @Test
    public void testShallowCopyFromCheckRefAnimals(){
        animals1.shallowCopyFrom(animals2);
        Assert.assertNotEquals(animals1, animals2);
    }
    @Test
    public void testShallowCopyFromCheckEqulityAnimals(){

        animals1.shallowCopyFrom(animals2);
        animals2.shallowCopyFrom(animals1);
        Assert.assertTrue(animals1.equals(animals2));
    }
//////////////////
@Test
public void testShallowCopyCheckRefHumans() throws CloneNotSupportedException {

    Assert.assertTrue(humans1.equals(humans1.shallowCopy()));
}
    @Test
    public void testShallowCopyCheckEqulityHumans() throws CloneNotSupportedException {
        Humans j1=humans1.shallowCopy();
        Humans j2=humans2.shallowCopy();
        Assert.assertTrue(j1.equals(j2));
    }
    @Test
    public void testShallowCopyFromCheckRefHumans(){
        humans1.shallowCopyFrom(humans2);
        Assert.assertNotEquals(humans1, humans2);
    }
    @Test
    public void testShallowCopyFromCheckEqulityHumans(){

        humans1.shallowCopyFrom(humans2);
        humans2.shallowCopyFrom(humans1);
        Assert.assertTrue(humans1.equals(humans2));
    }

    //////////////////////
    @Test
    public void testShallowCopyCheckRefBirds() throws CloneNotSupportedException {

        Assert.assertTrue(birds1.equals(birds1.shallowCopy()));
    }
    @Test
    public void testShallowCopyCheckEqulityBirds() throws CloneNotSupportedException {
        Birds j1=birds1.shallowCopy();
        Birds j2=birds2.shallowCopy();
        Assert.assertTrue(j1.equals(j2));
    }
    @Test
    public void testShallowCopyFromCheckRefBirds(){
        birds1.shallowCopyFrom(birds2);
        Assert.assertNotEquals(birds1, birds2);
    }
    @Test
    public void testShallowCopyFromCheckEqulityBirds(){

        birds1.shallowCopyFrom(birds2);
        birds2.shallowCopyFrom(birds1);
        Assert.assertTrue(birds1.equals(birds2));
    }


}


