package ir.phgint;


import ir.phgint.Classes.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Classes.Janevaran.*;

public class TestComprable {

    private Animals animals1, animals2, animals3, animals4;
    private Humans humans1, humans2, humans3, humans4;
    private Birds birds1, birds2, birds3, birds4;

    private Profile profileAnimal1,profileAnimal2,profileAnimal3,profileAnimal4;
    private Profile profileHumans1,profileHumans2,profileHumans3,profileHumans4;
    private Profile profileBirds1,profileBirds2,profileBirds3,profileBirds4;

    @Before
    public void initObjectJanevaran() {

        profileAnimal1 =  ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals1 = AnimalsBuilder.getAnimalsInstance(profileAnimal1).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileAnimal2 =  ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals2 = AnimalsBuilder.getAnimalsInstance(profileAnimal2).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileAnimal3 =  ProfileBuilder.getProfileInstance().name("Cat").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals3 = AnimalsBuilder.getAnimalsInstance(profileAnimal3).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileAnimal4 =  ProfileBuilder.getProfileInstance().name("Lion").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals4 = AnimalsBuilder.getAnimalsInstance(profileAnimal4).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();



        profileHumans1 =  ProfileBuilder.getProfileInstance().name("Mina").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        humans1= HumansBuilder.getHumansInstance(profileHumans1).age(Ages.Baby).gender(Gender.Female).build();

        profileHumans2 =  ProfileBuilder.getProfileInstance().name("Mina").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        humans2 = HumansBuilder.getHumansInstance(profileHumans2).age(Ages.Baby).gender(Gender.Female).build();

        profileHumans3 =  ProfileBuilder.getProfileInstance().name("Ali").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        humans3 = HumansBuilder.getHumansInstance(profileHumans3).age(Ages.Baby).gender(Gender.Female).build();

        profileHumans4 =  ProfileBuilder.getProfileInstance().name("Reza").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        humans4= HumansBuilder.getHumansInstance(profileHumans4).age(Ages.Baby).gender(Gender.Female).build();



        profileBirds1 =  ProfileBuilder.getProfileInstance().name("Ordak").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        birds1 = BirdsBuilder.getBirdsInstance(profileBirds1).canFly(true).hasFeather(true).build();

        profileBirds2 =  ProfileBuilder.getProfileInstance().name("Ordak").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        birds2 = BirdsBuilder.getBirdsInstance(profileBirds2).canFly(true).hasFeather(true).build();

        profileBirds3 =  ProfileBuilder.getProfileInstance().name("Eugle").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        birds3 = BirdsBuilder.getBirdsInstance(profileBirds3).canFly(true).hasFeather(true).build();

        profileBirds4 =  ProfileBuilder.getProfileInstance().name("ordak").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        birds4 = BirdsBuilder.getBirdsInstance(profileBirds4).canFly(true).hasFeather(true).build();


    }

    @Test
    public void compareEqualsAnimalsTest() {

        Assert.assertEquals(animals1.compareTo(animals2), 0);
    }

    @Test
    public void compareGreaterAnimalsTest() {

        Assert.assertEquals(animals1.compareTo(animals3), 1);
    }

    @Test
    public void compareSmallerAnimalsTest() {

        Assert.assertEquals(animals1.compareTo(animals4), -1);
    }

    @Test
    public void compareEqualsHumansTest() {

        Assert.assertEquals(humans1.compareTo(humans2), 0);
    }

    @Test
    public void compareGreaterHumansTest() {

        Assert.assertEquals(humans1.compareTo(humans3), 1);
    }

    @Test
    public void compareSmallerHumansTest() {
        Assert.assertEquals(humans1.compareTo(humans4), -1);
    }

    @Test
    public void compareEqualsBirdsTest() {

        Assert.assertEquals(birds1.compareTo(birds2), 0);
    }

    @Test
    public void compareGreaterBirdsTest() {

        Assert.assertEquals(birds1.compareTo(birds3), 1);
    }

    @Test
    public void compareSmallerBirdsTest() {

        Assert.assertEquals(birds1.compareTo(birds4), -1);
    }

}
