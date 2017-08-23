package ir.phgint;


import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestFile {

    private Humans humans1, humans2, humans3;
    private Janevaran.Profile profileHumans1, profileHumans2, profileHumans3;

    @Before
    public void initObjectJanevaran() {

        profileHumans1 = ProfileBuilder.getProfileInstance().name("Mina").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        humans1 = HumansBuilder.getHumansInstance(profileHumans1).age(Janevaran.Ages.Baby).gender(Janevaran.Gender.Female).build();

        profileHumans2 = ProfileBuilder.getProfileInstance().name("Ali").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        humans2 = HumansBuilder.getHumansInstance(profileHumans2).age(Janevaran.Ages.Baby).gender(Janevaran.Gender.Female).build();

        profileHumans3 = ProfileBuilder.getProfileInstance().name("sina").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        humans3 = HumansBuilder.getHumansInstance(profileHumans3).age(Janevaran.Ages.Baby).gender(Janevaran.Gender.Female).build();

    }

    @Test
    public void writeBinaryToHumanFile() {

        List<Humans> objectsHuman = new ArrayList<Humans>();
        objectsHuman.add(humans1);
        objectsHuman.add(humans2);
        objectsHuman.add(humans3);
        Utils.serialize("human.ser", objectsHuman);
    }

    @Test
    public void readBinaryFromHumanFile() {

        System.out.println(Utils.deSerialize("human.ser"));
    }


    @Test
    public void writeBinaryToHumanFile2() {

        List<Humans> objectsHuman = new ArrayList<Humans>();
        objectsHuman.add(humans1);
        objectsHuman.add(humans2);
        objectsHuman.add(humans3);
        Utils.serialize2("s.ser",objectsHuman);

    }

    @Test
    public void readBinaryFromHumanFile2() {
        System.out.println(Utils.deSerialize2("s.ser"));
    }

}
