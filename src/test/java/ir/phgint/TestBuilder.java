package ir.phgint;

import ir.phgint.Classes.*;
import ir.phgint.Classes.Janevaran.*;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

public class TestBuilder {

    private Profile profileCorrectInfo, profileInCorrectName, profileInCorrectTalk,
            profileNameNull, profileFoodTypeNull, profileTalkNull, profileHabitatsNull, profileBirthTypeNull;

    private Animals animalsCorrectInfo, animalsBehaviorNull;
    private Birds birdsCorrectInfo, birdsInCorrectInfo;
    private Humans humansCorrectInfo, humansAgeNull, humansGenderNull;

    @Before
    public void initObjectJanevaran() {


    }


    /////////////ProfileBuilder
    @Test
    public void ProfileBuilderHappyPathTest() {
        profileCorrectInfo = ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();

    }

    @Test(expected = StringLengthException.class)
    public void ProfileBuilderStringLengthExceptionNameTest() {
        profileInCorrectName = ProfileBuilder.getProfileInstance().name("Doggggggggggggggdddddddgggggggggggg").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();

    }

    @Test(expected = StringLengthException.class)
    public void ProfileBuilderStringLengthExceptionTalkTest() {
        profileInCorrectTalk = ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("HopHopHopHopHopHopHopHopHopHop").habitats(Habitats.Dry)
                .birthType(Pregnant.Viviparous).build();


    }

    @Test(expected = NullPointerException.class)
    public void ProfileBuilderNameNullTest() {
        profileNameNull = ProfileBuilder.getProfileInstance().foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry).birthType(Pregnant.Viviparous).build();

    }

    @Test(expected = NullPointerException.class)
    public void ProfileBuilderFoodTypeNullTest() {
        profileFoodTypeNull = ProfileBuilder.getProfileInstance().name("Dog").talk("Hop").habitats(Habitats.Dry).birthType(Pregnant.Viviparous).build();
    }

    @Test(expected = NullPointerException.class)
    public void ProfileBuilderTalkNullTest() {
        profileTalkNull = ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).habitats(Habitats.Dry).birthType(Pregnant.Viviparous).build();
    }

    @Test(expected = NullPointerException.class)
    public void ProfileBuilderHabitatsNullTest() {
        profileHabitatsNull = ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").birthType(Pregnant.Viviparous).build();
    }

    @Test(expected = NullPointerException.class)
    public void ProfileBuilderBirthTypeNullTest() {
        profileBirthTypeNull = ProfileBuilder.getProfileInstance().name("Dog").foodType(Foods.Carnivorous).talk("Hop").habitats(Habitats.Dry).build();
    }

    //////////////AnimalsBuilder
    @Test
    public void AnimalsBuilderHappyPathTest() {
        animalsCorrectInfo = AnimalsBuilder.getAnimalsInstance().animalBehavior(AnimalBehavior.Domestic).isQuadruped(true).build();

    }

    @Test(expected = NullPointerException.class)
    public void AnimalsBuilderAnimalBehaviorNullTest() {
        animalsBehaviorNull = AnimalsBuilder.getAnimalsInstance().isQuadruped(true).build();
    }

    //////////////BirdsBuilder
    @Test
    public void BirdsBuilderHappyPathTest() {
        birdsCorrectInfo = BirdsBuilder.getBirdsInstance().canFly(true).hasFeather(true).build();

    }

    @Test(expected = InvalidParameterException.class)
    public void BirdsBuilderExcpPathNullTest() {
        birdsInCorrectInfo = BirdsBuilder.getBirdsInstance().canFly(true).hasFeather(false).build();
    }

    //////////////HumansBuilder
    @Test
    public void HumansBuilderHappyPathTest() {
        humansCorrectInfo = HumansBuilder.getHumansInstance().age(Ages.Baby).gender(Gender.Female).build();

    }

    @Test(expected = NullPointerException.class)
    public void HumansBuilderAgeNullTest() {
        humansAgeNull = HumansBuilder.getHumansInstance().gender(Gender.Female).build();
    }

    @Test(expected = NullPointerException.class)
    public void HumansBuilderGenderNullTest() {
        humansGenderNull = HumansBuilder.getHumansInstance().age(Ages.Baby).build();
    }

}
