package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestShallowCopy {

    private Animals animals1,animals2;
    private Humans humans1,humans2;
    private Birds birds1,birds2;

    @Before
    public void initObjectJanevaran() {

        Profile profileAnimals1 = Profile.getProfileInstance("Dog", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileAnimals2 = Profile.getProfileInstance("cat", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        animals1 =  Animals.getAnimalsInstance(profileAnimals1);
        animals1.setAnimalBehavior(AnimalBehavior.Domestic);
        animals2 = Animals.getAnimalsInstance(profileAnimals2);
        animals2.setAnimalBehavior(AnimalBehavior.Domestic);



        Profile profileHumans1 = Profile.getProfileInstance("Mina", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans2 = Profile.getProfileInstance("Ali", Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous);
        humans1 =  Humans.getHumansInstance(profileHumans1);
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
    @Test
    public void shallowCopyAnimalsCheckRefTest() {

        Assert.assertNotEquals(animals1, animals1.shallowCopy());
    }
    @Test
    public void shallowCopyAnimalsCheckRefProfileTest() {

        Assert.assertEquals(animals1.getProfile(), animals1.shallowCopy().getProfile());
    }

    @Test
    public void shallowCopyAnimalsCheckValueTest(){
        Animals j1=animals1.shallowCopy();
        Assert.assertEquals(j1.getAnimalBehavior(), animals1.getAnimalBehavior());
    }
    @Test
    public void shallowCopyAnimalsCheckValueProfileTest(){
        Animals j1=animals1.shallowCopy();
        Assert.assertEquals(j1.getProfile(), animals1.getProfile());
    }
    @Test
    public void shallowCopyFromAnimalsCheckRefTest(){
        animals1.shallowCopyFrom(animals2);
        Assert.assertNotEquals(animals1, animals2);
    }
    @Test
    public void shallowCopyFromAnimalsCheckRefProfileTest(){
        animals1.shallowCopyFrom(animals2);
        Assert.assertEquals(animals1.getProfile(), animals2.getProfile());
    }
    @Test
    public void shallowCopyFromAnimalsCheckValueTest(){

        animals1.shallowCopyFrom(animals2);
        Assert.assertEquals(animals1.getAnimalBehavior(),animals2.getAnimalBehavior());
    }
    @Test
    public void shallowCopyFromAnimalsCheckValueProfileTest(){
        animals1.shallowCopyFrom(animals2);
        Assert.assertEquals(animals1.getProfile(), animals2.getProfile());
    }
////////////////// Humans

    @Test
    public void shallowCopyHumansCheckRefTest() {

        Assert.assertNotEquals(humans1, humans1.shallowCopy());
    }
    @Test
    public void shallowCopyHumansCheckRefProfileTest() {

        Assert.assertEquals(humans1.getProfile(), humans1.shallowCopy().getProfile());
    }
    @Test
    public void shallowCopyHumansCheckValueTest(){
        Humans j1=humans1.shallowCopy();
        Assert.assertEquals(j1.getGender(), humans1.getGender());
    }
    @Test
    public void shallowCopyHumansCheckValueProfileTest(){
        Humans j1=humans1.shallowCopy();
        Assert.assertEquals(j1.getProfile(), humans1.getProfile());
    }
    @Test
    public void shallowCopyFromHumansCheckRefTest(){
        humans1.shallowCopyFrom(humans2);
        Assert.assertNotEquals(humans1, humans2);
    }
    @Test
    public void shallowCopyFromHumansCheckRefProfileTest(){
        humans1.shallowCopyFrom(humans2);
        Assert.assertEquals(humans1.getProfile(), humans2.getProfile());
    }
    @Test
    public void shallowCopyFromHumansCheckValueTest(){

        humans1.shallowCopyFrom(humans2);
        Assert.assertEquals(humans1.getGender(), humans2.getGender());
    }
    @Test
    public void shallowCopyFromHumansCheckValueProfileTest(){
        humans1.shallowCopyFrom(humans2);
        Assert.assertEquals(humans1.getProfile(), humans2.getProfile());
    }
//////////////////Birds
@Test
public void shallowCopyBirdsCheckRefTest() {

    Assert.assertNotEquals(birds1, birds1.shallowCopy());
}
    @Test
    public void shallowCopyBirdsCheckRefProfileTest() {

        Assert.assertEquals(birds1.getProfile(), birds1.shallowCopy().getProfile());
    }
    @Test
    public void shallowCopyBirdsCheckValueTest(){
        Birds j1=birds1.shallowCopy();
        Assert.assertEquals(j1.getCanFly(), birds1.getCanFly());
    }
    @Test
    public void shallowCopyBirdsCheckValueProfileTest(){
        Birds j1=birds1.shallowCopy();
        Assert.assertEquals(j1.getProfile(), birds1.getProfile());
    }
    @Test
    public void shallowCopyFromBirdsCheckRefTest(){
        birds1.shallowCopyFrom(birds2);
        Assert.assertNotEquals(birds1, birds2);
    }
    @Test
    public void shallowCopyFromBirdsCheckRefProfileTest(){
        birds1.shallowCopyFrom(birds2);
        Assert.assertEquals(birds1.getProfile(), birds2.getProfile());
    }
    @Test
    public void shallowCopyFromBirdsCheckValueTest(){

        birds1.shallowCopyFrom(birds2);
        Assert.assertEquals(birds1.getCanFly(),birds2.getCanFly());
    }
    @Test
    public void shallowCopyFromBirdsCheckValueProfileTest(){
        birds1.shallowCopyFrom(birds2);
        Assert.assertEquals(birds1.getProfile(),birds2.getProfile());
    }

}


