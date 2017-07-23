package ir.phgint;

import org.junit.Assert;
import org.junit.Before;
import ir.phgint.Janevaran.*;
import org.junit.Test;

public class TestSingleTon {

    private SingleTonBirds birds1,birds2,birds3;
    private SingleTonAnimals animals1,animals2,animals3;

    @Before
    public void initObjectJanevaran() {
        birds1 = SingleTonBirds.getBirdsInstance(Profile.getProfileInstance("Name", Foods.Carnivorous, "Voice", Habitats.Beach, Pregnant.Oviparous));
        birds2 = SingleTonBirds.getBirdsInstance(birds1);
        birds3 = SingleTonBirds.getBirdsInstance(Profile.getProfileInstance("Namcse", Foods.Carnivorous, "Voice", Habitats.Beach, Pregnant.Oviparous));

        animals1 = SingleTonAnimals.getAnimalsInstance(Profile.getProfileInstance("Name", Foods.Carnivorous, "Voice", Habitats.Beach, Pregnant.Oviparous));
        animals2 = SingleTonAnimals.getAnimalsInstance(animals1);
        animals3 = SingleTonAnimals.getAnimalsInstance(Profile.getProfileInstance("Namcse", Foods.Carnivorous, "Voice", Habitats.Beach, Pregnant.Oviparous));

    }


    @Test
    public void Birds1CheckRefTest() {
        Assert.assertEquals(birds1,birds2);
    }
    @Test
    public void Birds2CheckRefTest() {
        Assert.assertEquals(birds2,birds3);
    }
    @Test
    public void Birds3CheckRefTest() {
        Assert.assertEquals(birds3,birds3);
    }
    @Test
    public void Animals1CheckRefTest() {
        Assert.assertEquals(animals1, animals2);
    }
    @Test
    public void Animals2CheckRefTest() {
        Assert.assertEquals(animals2, animals3);
    }
    @Test
    public void Animals3CheckRefTest() {
        Assert.assertEquals(animals3, animals3);
    }



}
