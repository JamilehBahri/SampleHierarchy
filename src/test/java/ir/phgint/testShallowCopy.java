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
    public void testShallowCopyAnimalsCheckRef() {

        Assert.assertNotEquals(animals1, animals1.shallowCopy());
    }
    @Test
    public void testShallowCopyAnimalsCheckRefProfile() {

        Assert.assertEquals(animals1.getProfile(), animals1.shallowCopy().getProfile());
    }
    @Test
    public void testShallowCopyAnimalsCheckValue(){
        Animals j1=animals1.shallowCopy();
        Assert.assertEquals(j1.getAnimalBehavior(), animals1.getAnimalBehavior());
    }
    @Test
    public void testShallowCopyAnimalsCheckValueProfile(){
        Animals j1=animals1.shallowCopy();
        Assert.assertEquals(j1.getProfile(), animals1.getProfile());
    }
    @Test
    public void testShallowCopyFromAnimalsCheckRef(){
        animals1.shallowCopyFrom(animals2);
        Assert.assertNotEquals(animals1, animals2);
    }
    @Test
    public void testShallowCopyFromAnimalsCheckRefProfile(){
        animals1.shallowCopyFrom(animals2);
        Assert.assertEquals(animals1.getProfile(), animals2.getProfile());
    }
    @Test
    public void testShallowCopyFromAnimalsCheckValue(){

        animals1.shallowCopyFrom(animals2);
        Assert.assertEquals(animals1.getAnimalBehavior(),animals2.getAnimalBehavior());
    }
    @Test
    public void testShallowCopyFromAnimalsCheckValueProfile(){
        animals1.shallowCopyFrom(animals2);
        Assert.assertEquals(animals1.getProfile(), animals2.getProfile());
    }
////////////////// Humans

    @Test
    public void testShallowCopyHumansCheckRef() {

        Assert.assertNotEquals(humans1, humans1.shallowCopy());
    }
    @Test
    public void testShallowCopyHumansCheckRefProfile() {

        Assert.assertEquals(humans1.getProfile(), humans1.shallowCopy().getProfile());
    }
    @Test
    public void testShallowCopyHumansCheckValue(){
        Humans j1=humans1.shallowCopy();
        Assert.assertEquals(j1.getGender(), humans1.getGender());
    }
    @Test
    public void testShallowCopyHumansCheckValueProfile(){
        Humans j1=humans1.shallowCopy();
        Assert.assertEquals(j1.getProfile(), humans1.getProfile());
    }
    @Test
    public void testShallowCopyFromHumansCheckRef(){
        humans1.shallowCopyFrom(humans2);
        Assert.assertNotEquals(humans1, humans2);
    }
    @Test
    public void testShallowCopyFromHumansCheckRefProfile(){
        humans1.shallowCopyFrom(humans2);
        Assert.assertEquals(humans1.getProfile(), humans2.getProfile());
    }
    @Test
    public void testShallowCopyFromHumansCheckValue(){

        humans1.shallowCopyFrom(humans2);
        Assert.assertEquals(humans1.getGender(), humans2.getGender());
    }
    @Test
    public void testShallowCopyFromHumansCheckValueProfile(){
        humans1.shallowCopyFrom(humans2);
        Assert.assertEquals(humans1.getProfile(), humans2.getProfile());
    }
//////////////////Birds
@Test
public void testShallowCopyBirdsCheckRef() {

    Assert.assertNotEquals(birds1, birds1.shallowCopy());
}
    @Test
    public void testShallowCopyBirdsCheckRefProfile() {

        Assert.assertEquals(birds1.getProfile(), birds1.shallowCopy().getProfile());
    }
    @Test
    public void testShallowCopyBirdsCheckValue(){
        Birds j1=birds1.shallowCopy();
        Assert.assertEquals(j1.getCanFly(), birds1.getCanFly());
    }
    @Test
    public void testShallowCopyBirdsCheckValueProfile(){
        Birds j1=birds1.shallowCopy();
        Assert.assertEquals(j1.getProfile(), birds1.getProfile());
    }
    @Test
    public void testShallowCopyFromBirdsCheckRef(){
        birds1.shallowCopyFrom(birds2);
        Assert.assertNotEquals(birds1, birds2);
    }
    @Test
    public void testShallowCopyFromBirdsCheckRefProfile(){
        birds1.shallowCopyFrom(birds2);
        Assert.assertEquals(birds1.getProfile(), birds2.getProfile());
    }
    @Test
    public void testShallowCopyFromBirdsCheckValue(){

        birds1.shallowCopyFrom(birds2);
        Assert.assertEquals(birds1.getCanFly(),birds2.getCanFly());
    }
    @Test
    public void testShallowCopyFromBirdsCheckValueProfile(){
        birds1.shallowCopyFrom(birds2);
        Assert.assertEquals(birds1.getProfile(),birds2.getProfile());
    }

}


