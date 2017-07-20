package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;

public class testSerialization {

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
    public void serializeAnimals (){
        try {
            Serialization.serialize(animals, "animals.ser");
            System.out.println(" Animal serialize  Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void serializeHumans (){
        try {
            Serialization.serialize(humans, "humans.ser");
            System.out.println(" humans serialize  Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void serializeBirds (){
        try {
            Serialization.serialize(birds, "birds.ser");
            System.out.println(" birds serialize  Success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deserializeAnimals () throws IOException {
        Animals animalNew = null;
        try {
            animalNew = (Animals) Serialization.deserialize("animals.ser");
            System.out.println(" animals deserialize  Success");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void deserializeHumans () throws IOException{
        Humans humanNew = null;
        try {
            humanNew = (Humans) Serialization.deserialize("humans.ser");
            System.out.println(" humans deserialize  Success");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void deserializeBirds ()throws IOException{
        Birds birdNew = null;
        try {
            birdNew = (Birds) Serialization.deserialize("birds.ser");
            System.out.println(" birds deserialize  Success");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
