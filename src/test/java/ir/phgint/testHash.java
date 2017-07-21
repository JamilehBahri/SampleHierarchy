package ir.phgint;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Janevaran.Profile.*;
import ir.phgint.Janevaran.*;

/**
 * Created by Jamile on 11/06/2017.
 */
public class TestHash {
    Animals animals;
    Humans humans;
    Birds birds;

    @Before
    public void initObjectJanevaran() {

        ProfileBuilder profileBuilderAnimal = new ProfileBuilder().name("Dog").foodType(F.Foods.Carnivorous).talk("Hop Hop")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);
        ProfileBuilder profileBuilderHumans = new ProfileBuilder().name("Mina").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);
        ProfileBuilder profileBuilderBirds = new ProfileBuilder().name("Canary").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);

        animals =  Animals.getAnimalsInstance(profileBuilderAnimal.build());
        humans = Humans.getHumansInstance(profileBuilderHumans.build());
        birds = Birds.getBirdsInstance(profileBuilderBirds.build());
    }

    @Test
    public void getHashAnimalsTest() {

        int hash = animals.hashCode();
        Assert.assertEquals(hash,animals.hashCode());
    }

    @Test
    public void getHashHumansTest() {
        int hash = humans.hashCode();
        Assert.assertEquals(hash, humans.hashCode());
    }

    @Test
    public void getHashBirdsTest() {

        int hash = birds.hashCode();
        Assert.assertEquals(hash, birds.hashCode());

    }


}
