package ir.phgint;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Janevaran.*;

public class TestDeepCopy {

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

