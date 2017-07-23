package ir.phgint;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Janevaran.*;


public class TestClone {

    private Animals animals;
    private Humans humans;
    private Birds birds;

    private Profile profileAnimal;
    private Profile profileHumans;
    private Profile profileBirds;


    @Before
    public void initObjectJanevaran() {

        profileAnimal =  ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        animals = AnimalsBuilder.getAnimalsInstance(profileAnimal).animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

        profileBirds =  ProfileBuilder.getProfileInstance().name("Ordak").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        birds = BirdsBuilder.getBirdsInstance(profileBirds).canFly(true).hasFeather(true).build();

        profileHumans=  ProfileBuilder.getProfileInstance().name("Mina").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();
        humans = HumansBuilder.getHumansInstance(profileHumans).age(Ages.Baby).gender(Gender.Female).build();

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
