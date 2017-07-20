package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Jamile on 11/06/2017.
 */
public class testHash {
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
    public void getHashAnimals (){

         System.out.println(animals.hashCode());
    }
    @Test
    public void getHashHumans (){

        System.out.println(humans.hashCode());
    }
    @Test
    public void getHashBirds (){

        System.out.println(birds.hashCode());
    }



}
