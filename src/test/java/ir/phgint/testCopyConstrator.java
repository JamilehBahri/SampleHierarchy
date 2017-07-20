package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Jamile on 11/06/2017.
 */
public class testCopyConstrator {

    static Animals animals;
    static Humans humans;
    static Birds birds;

    @BeforeClass
    public static void initObjectJanevaran(){
        animals = new Animals("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        humans = new Humans("Mina", Gender.Female, Ages.Teenager, Foods.Vegetarian, "Voice", Habitats.Dry, Pregnant.Viviparous, false, true);
        birds = new Birds("Eagle", true, true, Foods.Carnivorous, "Ji ... Ji", Habitats.Mountain, Pregnant.Oviparous);

    }

    @Test
    public void testAnimalsCopyCons(){

        Animals animals1=new Animals(animals);
        System.out.println("CopyCons Animals.........." + animals1.getProfile().getName());
    }

    @Test
    public void testHumansCopyCons(){
        Humans humans1=new Humans(humans);
        System.out.println("CopyCons Humans.........." + humans1.getProfile().getName());

    }

    @Test
    public void testBirdsCopyCons(){
        Birds birds1=new Birds(birds);
        System.out.println("CopyCons Birds.........." + birds1.getProfile().getName());

    }
}
