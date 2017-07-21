package ir.phgint;

import ir.phgint.Enum.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 *  For Debug ToString()
 */
public class TestTostring {

    private Animals animals;
    private Humans humans;
    private Birds birds;

    @Before
    public void initObjectJanevaran(){
        Profile profileAnimals= Profile.getProfileInstance("Dog", Foods.Vegetarian, "Hop Hop", Habitats.Dry, Pregnant.Viviparous);
        Profile profileHumans= Profile.getProfileInstance("Dog", Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous);
        Profile profileBirds= Profile.getProfileInstance("Eugle", Foods.Vegetarian, "ji ji", Habitats.Dry, Pregnant.Viviparous);

        animals =  Animals.getAnimalsInstance(profileAnimals);
        animals.setAnimalBehavior(AnimalBehavior.Domestic);
        animals.setHasHair(true);
        humans = Humans.getHumansInstance(profileHumans);
        birds = Birds.getBirdsInstance(profileBirds);
    }

    @Test
    public void toStringAnimalsTest()
    {
       String string = animals.toString();
    }
    @Test
    public void toStringHumansTest()
    {
        String string = humans.toString();
    }
    @Test
    public void toStringBirdsTest()
    {
        String string = birds.toString();
    }
}
