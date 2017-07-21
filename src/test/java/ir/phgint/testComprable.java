package ir.phgint;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Janevaran.Profile.*;
import ir.phgint.Janevaran.*;

public class TestComprable {

    private Animals animals1, animals2, animals3, animals4;
    private Humans humans1, humans2, humans3, humans4;
    private Birds birds1, birds2, birds3, birds4;

    @Before
    public void initObjectJanevaran() {

        ProfileBuilder profileBuilderAnimal1 = new ProfileBuilder().name("Dog").foodType(F.Foods.Carnivorous).talk("Hop Hop")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);
        ProfileBuilder profileBuilderAnimal2 = new ProfileBuilder().name("Dog").foodType(F.Foods.Carnivorous).talk("Hop Hop")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);
        ProfileBuilder profileBuilderAnimal3 = new ProfileBuilder().name("Cat").foodType(F.Foods.Carnivorous).talk("MIO")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);
        ProfileBuilder profileBuilderAnimal4 = new ProfileBuilder().name("Lion").foodType(F.Foods.Carnivorous).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);


        ProfileBuilder profileBuilderHumans1 = new ProfileBuilder().name("Mina").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);
        ProfileBuilder profileBuilderHumans2 = new ProfileBuilder().name("Mina").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);
        ProfileBuilder profileBuilderHumans3 = new ProfileBuilder().name("Ali").foodType(F.Foods.Carnivorous).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);
        ProfileBuilder profileBuilderHumans4 = new ProfileBuilder().name("Reza").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);


        ProfileBuilder profileBuilderBirds1 = new ProfileBuilder().name("ordak").foodType(F.Foods.Vegetarian).talk(" JI JI")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);
        ProfileBuilder profileBuilderBirds2 = new ProfileBuilder().name("ordak").foodType(F.Foods.Vegetarian).talk(" JI JI")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);
        ProfileBuilder profileBuilderBirds3 = new ProfileBuilder().name("Eugle").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);
        ProfileBuilder profileBuilderBirds4 = new ProfileBuilder().name("ordak").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);


        animals1 = Animals.getAnimalsInstance(profileBuilderAnimal1.build());
        animals2 = Animals.getAnimalsInstance(profileBuilderAnimal2.build());
        animals3 = Animals.getAnimalsInstance(profileBuilderAnimal3.build());
        animals4 = Animals.getAnimalsInstance(profileBuilderAnimal4.build());

        humans1 = Humans.getHumansInstance(profileBuilderHumans1.build());
        humans1.setGender(G.Gender.Female);
        humans2 = Humans.getHumansInstance(profileBuilderHumans2.build());
        humans2.setGender(G.Gender.Female);
        humans3 = Humans.getHumansInstance(profileBuilderHumans3.build());
        humans4 = Humans.getHumansInstance(profileBuilderHumans4.build());

        birds1 = Birds.getBirdsInstance(profileBuilderBirds1.build());
        birds2 = Birds.getBirdsInstance(profileBuilderBirds2.build());
        birds3 = Birds.getBirdsInstance(profileBuilderBirds3.build());
        birds4 = Birds.getBirdsInstance(profileBuilderBirds4.build());
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
