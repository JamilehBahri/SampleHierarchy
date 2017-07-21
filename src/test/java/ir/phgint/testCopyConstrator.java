package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jamile on 11/06/2017.
 */
public class testCopyConstrator {

    private Animals animals;
    private Humans humans;
    private Birds birds;

    @Before
    public void initObjectJanevaran() {
        animals = Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        humans = Humans.getHumansInstance("Mina", Gender.Female, Ages.Teenager, Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous, false, true);
        birds = Birds.getBirdsInstance("Eagle", true, true, Foods.Carnivorous, "Ji ... Ji", Habitats.Mountain, Pregnant.Oviparous);

    }

    @Test
    public void testAnimalsCopyCons() {
        Animals animals1 =  Animals.getAnimalsInstance(animals);
        Assert.assertEquals("CopyCons Animals..........", "Dog", animals1.getProfile().getName());
    }

    @Test
    public void testHumansCopyCons() {
        Humans humans1 =  Humans.getHumansInstance(humans);
        Assert.assertEquals("CopyCons Humans..........", "Mina", humans1.getProfile().getName());
    }

    @Test
    public void testBirdsCopyCons() {
        Birds birds1 =  Birds.getBirdsInstance(birds);
        Assert.assertEquals("CopyCons Birds..........", "Eagle", birds1.getProfile().getName());

    }
}
