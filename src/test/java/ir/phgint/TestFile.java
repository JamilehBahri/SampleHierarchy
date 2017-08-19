package ir.phgint;


import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class TestFile {

    private Humans humans1, humans2;
    private Janevaran.Profile profileHumans1, profileHumans2;

    @Before
    public void initObjectJanevaran() {

        profileHumans1 = ProfileBuilder.getProfileInstance().name("Mina").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        humans1 = HumansBuilder.getHumansInstance(profileHumans1).age(Janevaran.Ages.Baby).gender(Janevaran.Gender.Female).build();

        profileHumans2 = ProfileBuilder.getProfileInstance().name("Ali").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        humans2 = HumansBuilder.getHumansInstance(profileHumans2).age(Janevaran.Ages.Baby).gender(Janevaran.Gender.Female).build();

    }



    @Test
    public void writeBinaryToHumanFile() {

        Object [] objectsHuman = new Object[2];
        objectsHuman[0] = humans1;
        objectsHuman[1] = humans2;
        Utils.serializ("human.data", objectsHuman);
    }
    @Test
    public void readBinaryFromHumanFile() {


        Utils.dSerializ("human.data");

    }


}
