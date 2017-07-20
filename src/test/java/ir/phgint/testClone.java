package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class testClone {

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
    public void testAnimalsClone(){
        try {
            Animals cloneAnimal = (Animals) animals.clone();
            System.out.printf("animals  and cloneAnimal  have same class name: %s\n", animals.getClass() == cloneAnimal.getClass());
            System.out.printf("animals  and cloneAnimal  have different memory addresses: %s\n", (animals != cloneAnimal));
            System.out.printf("animals  and cloneAnimal  is equal: %s\n", (animals.equals(cloneAnimal)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testHumansClone(){
        try {
            Humans cloneHumans = (Humans) humans.clone();
            System.out.printf("humans  and cloneHumans  have same class name: %s\n", humans.getClass() == cloneHumans.getClass());
            System.out.printf("humans  and cloneHumans  have different memory addresses: %s\n", (humans != cloneHumans));
            System.out.printf("humans  and cloneHumans  is equal: %s\n", (humans.equals(cloneHumans)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testBirdsClone(){
        try {
            Birds cloneBirds = (Birds) birds.clone();
            System.out.printf("animals  and cloneBirds  have same class name: %s\n", birds.getClass() == cloneBirds.getClass());
            System.out.printf("animals  and cloneBirds  have different memory addresses: %s\n", (birds != cloneBirds));
            System.out.printf("animals  and cloneBirds  is equal: %s\n", (birds.equals(cloneBirds)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
