package ir.phgint;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Janevaran.Profile.*;
import ir.phgint.Janevaran.*;

public class TestDeepCopy {

  /*  private Animals animals1, animals2;
    private Humans humans1, humans2, humans3, humans4;
    private Birds birds1, birds2, birds3, birds4;

    @Before
    public void initObjectJanevaran() {

        ProfileBuilder profileBuilderAnimal1 = new ProfileBuilder().name("Dog").foodType(Foods.Carnivorous).talk("Hop Hop")
                .habitats(Habitats.Beach).birthType(Pregnant.Oviparous);
        ProfileBuilder profileBuilderAnimal2 = new ProfileBuilder().name("Cat").foodType(Foods.Carnivorous).talk("MIO")
                .habitats(Habitats.Beach).birthType(Pregnant.Oviparous);

        animals1 = Animals.getAnimalsInstance(profileBuilderAnimal1.build());
        animals1.setAnimalBehavior(AnimalBehavior.Domestic);
        animals1.setHasBackbone(true);
        animals2 = Animals.getAnimalsInstance(profileBuilderAnimal2.build());
        animals2.setAnimalBehavior(AnimalBehavior.Domestic);
        animals2.setHasBackbone(true);


        ProfileBuilder profileBuilderHumans1 = new ProfileBuilder().name("Mina").foodType(Foods.Vegetarian).talk("Voice")
                .habitats(Habitats.Beach).birthType(Pregnant.Viviparous);
        ProfileBuilder profileBuilderHumans2 = new ProfileBuilder().name("Ali").foodType(Foods.Carnivorous).talk("Voice")
                .habitats(Habitats.Beach).birthType(Pregnant.Viviparous);
        humans1 = Humans.getHumansInstance(profileBuilderHumans1.build());
        humans1.setGender(Gender.Male);
        humans2 = Humans.getHumansInstance(profileBuilderHumans2.build());
        humans2.setGender(Gender.Male);

        ProfileBuilder profileBuilderBirds1 = new ProfileBuilder().name("ordak").foodType(Foods.Vegetarian).talk(" JI JI")
                .habitats(Habitats.Beach).birthType(Pregnant.Viviparous);
        ProfileBuilder profileBuilderBirds2 = new ProfileBuilder().name("Eugle").foodType(Foods.Vegetarian).talk("Voice")
                .habitats(Habitats.Beach).birthType(Pregnant.Oviparous);

        birds1 = Birds.getBirdsInstance(profileBuilderBirds1.build());
        birds1.setCanFly(true);
        birds2 = Birds.getBirdsInstance(profileBuilderBirds2.build());
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

*/

}

