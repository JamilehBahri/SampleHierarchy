package ir.phgint;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Janevaran.Profile.*;
import ir.phgint.Janevaran.*;

import java.util.ArrayList;


public class TestEquals {

    private Animals animals1, animals2;
    private Humans humans1, humans2;
    private Birds birds1, birds2;

    @Before
    public void initObjectJanevaran() {
        ProfileBuilder profileBuilderAnimal1 = new ProfileBuilder().name("Dog").foodType(F.Foods.Carnivorous).talk("Hop Hop")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);
        ProfileBuilder profileBuilderAnimal2 = new ProfileBuilder().name("Cat").foodType(F.Foods.Carnivorous).talk("MIO")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);

        animals1 = Animals.getAnimalsInstance(profileBuilderAnimal1.build());
        animals2 = Animals.getAnimalsInstance(profileBuilderAnimal2.build());


        ProfileBuilder profileBuilderHumans1 = new ProfileBuilder().name("Mina").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);
        ProfileBuilder profileBuilderHumans2 = new ProfileBuilder().name("Ali").foodType(F.Foods.Carnivorous).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);
        humans1 = Humans.getHumansInstance(profileBuilderHumans1.build());
        humans2 = Humans.getHumansInstance(profileBuilderHumans2.build());

        ProfileBuilder profileBuilderBirds1 = new ProfileBuilder().name("ordak").foodType(F.Foods.Vegetarian).talk(" JI JI")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);
        ProfileBuilder profileBuilderBirds2 = new ProfileBuilder().name("Eugle").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);

        birds1 = Birds.getBirdsInstance(profileBuilderBirds1.build());
        birds2 = Birds.getBirdsInstance(profileBuilderBirds2.build());


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
