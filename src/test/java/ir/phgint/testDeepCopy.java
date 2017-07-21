package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDeepCopy {

    private Animals animals1, animals2;
    private Humans humans1, humans2, humans3, humans4;
    private Birds birds1, birds2, birds3, birds4;

    @Before
    public void initObjectJanevaran() {
        Profile profileAnimals1 = Profile.getProfileInstance("Dog", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileAnimals2 = Profile.getProfileInstance("Cat", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        animals1 = Animals.getAnimalsInstance(profileAnimals1);
        animals1.setAnimalBehavior(AnimalBehavior.Domestic);
        animals1.setHasBackbone(true);
        animals2 = Animals.getAnimalsInstance(profileAnimals2);
        animals2.setAnimalBehavior(AnimalBehavior.Domestic);
        animals2.setHasBackbone(true);


        Profile profileHumans1 = Profile.getProfileInstance("Mina", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans2 = Profile.getProfileInstance("Ali", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        humans1 = Humans.getHumansInstance(profileHumans1);
        humans1.setGender(Gender.Male);
        humans2 = Humans.getHumansInstance(profileHumans2);
        humans2.setGender(Gender.Male);

        Profile profileBirds1 = Profile.getProfileInstance("Eugle", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileBirds2 = Profile.getProfileInstance("ordak", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        birds1 = Birds.getBirdsInstance(profileBirds1);
        birds1.setCanFly(true);
        birds2 = Birds.getBirdsInstance(profileBirds2);
        birds2.setCanFly(true);

    }

    //////////Animals
    @Test
    public void deepCopyAnimalsCheckRefTest() {
        Assert.assertNotEquals(animals1, animals1.deepCopy());
    }
    @Test
    public void deepCopyAnimalsCheckRefProfileTest() {
       // edit
        Assert.assertEquals(animals1.getProfile(), animals1.deepCopy().getProfile());
    }
    @Test
    public void deepCopyAnimalsCheckValueTest() {
        Animals j1 = animals1.deepCopy();
        Assert.assertEquals(animals1.getAnimalBehavior(), j1.getAnimalBehavior());

    }
    @Test
    public void deepCopyAnimalsCheckValueProfileTest() {
        //edit
        Animals j1 = animals1.deepCopy();
        Assert.assertEquals(animals1.getProfile(), j1.getProfile());
    }
    @Test
    public void deepCopyFromAnimalsCheckRefTest() {

        animals1.deepCopyFrom(animals2);
        Assert.assertNotEquals(animals1, animals2);
    }
    @Test
    public void deepCopyFromAnimalsCheckRefProfileTest() {

        animals1.deepCopyFrom(animals2);
        Assert.assertNotEquals(animals1.getProfile(), animals2.getProfile());
    }
    @Test
    public void deepCopyFromAnimalsCheckValueTest() {

        animals1.deepCopyFrom(animals2);
        Assert.assertEquals(animals1.getAnimalBehavior(), animals2.getAnimalBehavior());
    }
    @Test
    public void deepCopyFromAnimalsCheckValueProfileTest() {

        animals1.deepCopyFrom(animals2);
        Assert.assertNotEquals(animals1.getProfile(), animals2.getProfile());
    }

    //////////////Humans
    @Test
    public void deepCopyHumansCheckRefTest() {
        Assert.assertNotEquals(humans1, humans1.deepCopy());
    }
    @Test
    public void deepCopyHumansCheckRefProfileTest() {
        //edit
        Assert.assertEquals(humans1.getProfile(), humans1.deepCopy().getProfile());
    }
    @Test
    public void deepCopyHumansCheckValueTest() {
        Humans j1 = humans1.deepCopy();
        Assert.assertEquals(humans1.getGender(), j1.getGender());

    }
    @Test
    public void deepCopyHumansCheckValueProfileTest() {
        //edit
        Humans j1 = humans1.deepCopy();
        Assert.assertEquals(humans1.getProfile(), j1.getProfile());
    }
    @Test
    public void deepCopyFromHumansCheckRefTest() {

        humans1.deepCopyFrom(humans2);
        Assert.assertNotEquals(humans1, humans2);
    }
    @Test
    public void deepCopyFromHumansCheckRefProfileTest() {

        humans1.deepCopyFrom(humans2);
        Assert.assertNotEquals(humans1.getProfile(), humans2.getProfile());
    }
    @Test
    public void deepCopyFromHumansCheckValueTest() {

        humans1.deepCopyFrom(humans2);
        Assert.assertEquals(humans1.getGender(), humans2.getGender());
    }
    @Test
    public void deepCopyFromHumansCheckValueProfileTest() {

        humans1.deepCopyFrom(humans2);
        Assert.assertNotEquals(humans1.getProfile(), humans2.getProfile());
    }
////////////Birds
@Test
    public void deepCopyBirdsCheckRefTest() {
    Assert.assertNotEquals(birds1, birds1.deepCopy());
}
    @Test
    public void deepCopyBirdsCheckRefProfileTest() {
        //edit
        Assert.assertEquals(birds1.getProfile(), birds1.deepCopy().getProfile());
    }
    @Test
    public void deepCopyBirdsCheckValueTest() {
        Birds j1 = birds1.deepCopy();
        Assert.assertEquals(birds1.getCanFly(), j1.getCanFly());

    }
    @Test
    public void deepCopyBirdsCheckValueProfileTest() {
        //edit
        Birds j1 = birds1.deepCopy();
        Assert.assertEquals(birds1.getProfile(), j1.getProfile());
    }
    @Test
    public void deepCopyFromBirdsCheckRefTest() {

        birds1.deepCopyFrom(birds2);
        Assert.assertNotEquals(birds1, birds2);
    }
    @Test
    public void deepCopyFromBirdsCheckRefProfileTest() {

        birds1.deepCopyFrom(birds2);
        Assert.assertNotEquals(birds1.getProfile(), birds2.getProfile());
    }
    @Test
    public void deepCopyFromBirdsCheckValueTest() {

        birds1.deepCopyFrom(birds2);
        Assert.assertEquals(birds1.getCanFly(), birds2.getCanFly());
    }
    @Test
    public void deepCopyFromBirdsCheckValueProfileTest() {

        birds1.deepCopyFrom(birds2);
        Assert.assertNotEquals(birds1.getProfile(), birds2.getProfile());
    }



}

