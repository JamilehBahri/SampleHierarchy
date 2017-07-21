package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testComprable {

    private Animals animals1, animals2, animals3, animals4;
    private Humans humans1, humans2, humans3, humans4;
    private Birds birds1, birds2, birds3, birds4;

    @Before
    public void initObjectJanevaran() {
        animals1 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        animals2 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        animals3 =  Animals.getAnimalsInstance("Cat", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        animals4 =  Animals.getAnimalsInstance("Lion", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);

        humans1 =  Humans.getHumansInstance("Mina", Gender.Female, Ages.Teenager, Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous, false, true);
        humans2 =  Humans.getHumansInstance("Mina", Gender.Female, Ages.Teenager, Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous, false, true);
        humans3 =  Humans.getHumansInstance("Eli", Gender.Female, Ages.Teenager, Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous, false, true);
        humans4 =  Humans.getHumansInstance("Ali", Gender.Male, Ages.Teenager, Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous, false, true);

        birds1 =  Birds.getBirdsInstance("Eagle", true, true, Foods.Carnivorous, "Ji ... Ji", Habitats.Mountain, Pregnant.Oviparous);
        birds2 =  Birds.getBirdsInstance("Eagle", true, true, Foods.Carnivorous, "Ji ... Ji", Habitats.Mountain, Pregnant.Oviparous);
        birds3 =  Birds.getBirdsInstance("Canary", true, true, Foods.Carnivorous, "Ji ... Ji", Habitats.Mountain, Pregnant.Oviparous);
        birds4 =  Birds.getBirdsInstance("Pigeon", true, true, Foods.Carnivorous, "Ji ... Ji", Habitats.Mountain, Pregnant.Oviparous);

    }

    @Test
    public void compareEqualsName() {

        Assert.assertEquals(animals1.compareTo(animals2), 0);
        Assert.assertEquals(humans1.compareTo(humans2), 0);
        Assert.assertEquals(birds1.compareTo(birds2), 0);

    }

    @Test
    public void compareGreaterName() {

        Assert.assertEquals(animals1.compareTo(animals3), 1);
        Assert.assertEquals(humans1.compareTo(humans3), 8);
        Assert.assertEquals(birds1.compareTo(birds3), 2);
    }

    @Test
    public void compareSmallerName() {

        Assert.assertEquals(animals1.compareTo(animals4), -8);
        Assert.assertEquals(humans4.compareTo(humans1), -12);
        Assert.assertEquals(birds1.compareTo(birds4), -11);
    }

}
