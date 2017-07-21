package ir.phgint;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Janevaran.Profile.*;
import ir.phgint.Janevaran.*;


public class TestClone {

    private Animals animals;
    private Humans humans;
    private Birds birds;

    @Before
    public void initObjectJanevaran(){
        ProfileBuilder profileBuilderAnimal = new ProfileBuilder().name("Dog").foodType(F.Foods.Carnivorous).talk("Hop Hop")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);
        ProfileBuilder profileBuilderHumans = new ProfileBuilder().name("Mina").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Viviparous);
        ProfileBuilder profileBuilderBirds = new ProfileBuilder().name("Canary").foodType(F.Foods.Vegetarian).talk("Voice")
                .habitats(H.Habitats.Beach).birthType(P.Pregnant.Oviparous);

        animals =  Animals.getAnimalsInstance(profileBuilderAnimal.build());
        animals.setAnimalBehavior(AB.AnimalBehavior.Domestic);
        animals.setHasHair(true);
        humans = Humans.getHumansInstance(profileBuilderHumans.build());
        birds = Birds.getBirdsInstance(profileBuilderBirds.build());



    }

    @Test
    public void animalsCloneValueTest(){
        try {
            Animals cloneAnimal = (Animals) animals.clone();
            Assert.assertTrue("animals  and cloneAnimal  is equal", (animals.equals(cloneAnimal)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void animalsCloneRefTest(){
        try {
            Animals cloneAnimal = (Animals) animals.clone();
            Assert.assertNotEquals(animals, cloneAnimal);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void animalsCloneRefProfileTest(){
        try {
            Animals cloneAnimal = (Animals) animals.clone();
            Assert.assertEquals(animals.getProfile(), cloneAnimal.getProfile());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void humansCloneValueTest(){
        try {
            Humans cloneHumans = (Humans) humans.clone();
            Assert.assertTrue("humans  and cloneHumans  is equal", (humans.equals(cloneHumans)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void humansCloneRefTest(){
        try {
            Humans cloneHumans = (Humans) humans.clone();
            Assert.assertNotEquals(humans, cloneHumans);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void humansCloneRefProfileTest(){
        try {
            Humans cloneHumans = (Humans) humans.clone();
            Assert.assertEquals(humans.getProfile(), cloneHumans.getProfile());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void birdsCloneValueTest(){
        try {
            Birds cloneBirds = (Birds) birds.clone();
            Assert.assertTrue("birds  and cloneBirds  is equal", (birds.equals(cloneBirds)));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void birdsCloneRefTest(){
        try {
            Birds cloneBirds = (Birds) birds.clone();
            Assert.assertNotEquals(birds,cloneBirds);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void birdsCloneRefProfileTest(){
        try {
            Birds cloneBirds = (Birds) birds.clone();
            Assert.assertEquals(birds.getProfile(),cloneBirds.getProfile());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
