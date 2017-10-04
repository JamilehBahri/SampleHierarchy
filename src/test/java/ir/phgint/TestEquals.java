package ir.phgint;


import ir.phgint.Classes.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Classes.Janevaran.*;


public class TestEquals {

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
        birds2 = BirdsBuilder.getBirdsInstance(profileBirds2).canFly(false).hasFeather(true).build();

    }


    @Test
    public void equalsAnimalsRefTest() {
        Assert.assertNotEquals(animals1, animals2);
    }

    @Test
    public void equalsAnimalsValueTest() {
        Assert.assertFalse(animals1.getProfile().equals(animals2.getProfile()));
    }

    @Test
    public void equalsHummansRefTest() {
        Assert.assertNotEquals(humans1, humans2);

    }

    @Test
    public void equalsHummansvalueTest() {
        Assert.assertFalse(humans1.getProfile().equals(humans2.getProfile()));
    }

    @Test
    public void equalsBirdsRefTest() {
        Assert.assertNotEquals(birds1, birds2);

    }

    @Test
    public void equalsBirdsValueTest() {
        Assert.assertFalse(birds1.getProfile().equals(birds2.getProfile()));

    }


}
