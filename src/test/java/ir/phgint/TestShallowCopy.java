package ir.phgint;

import ir.phgint.Classes.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Classes.Janevaran.*;

public class TestShallowCopy {

    private Animals animals1, animals2;
    private Humans humans1, humans2;
    private Birds birds1, birds2;
    private Profile profileAnimal1,profileAnimal2;
    private Profile profileHumans1,profileHumans2;
    private Profile profileBirds1,profileBirds2;
    @Before
    public void initObjectJanevaran() {

        profileAnimal1 =  ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals1 = AnimalsBuilder.getAnimalsInstance(profileAnimal1).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileAnimal2 =  ProfileBuilder.getProfileInstance().name("Cat").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals2 = AnimalsBuilder.getAnimalsInstance(profileAnimal2).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileHumans1 =  ProfileBuilder.getProfileInstance().name("Mina").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        humans1 = HumansBuilder.getHumansInstance(profileHumans1).age(Ages.Baby).gender(Gender.Female).build();

        profileHumans2 =  ProfileBuilder.getProfileInstance().name("Ali").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        humans2 = HumansBuilder.getHumansInstance(profileHumans2).age(Ages.Baby).gender(Gender.Female).build();

        profileBirds1 =  ProfileBuilder.getProfileInstance().name("Ordak").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        birds1 = BirdsBuilder.getBirdsInstance(profileBirds1).canFly(true).hasFeather(true).build();

        profileBirds2 =  ProfileBuilder.getProfileInstance().name("Eugle").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        birds2 = BirdsBuilder.getBirdsInstance(profileBirds2).canFly(true).hasFeather(true).build();

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


