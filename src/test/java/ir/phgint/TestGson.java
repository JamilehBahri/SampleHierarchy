package ir.phgint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import ir.phgint.Classes.Humans;
import ir.phgint.Classes.HumansBuilder;
import ir.phgint.Classes.Janevaran;
import ir.phgint.Classes.ProfileBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestGson {

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
    public void GsonWriteObjectToStream() {
        List<Humans> humansList = new ArrayList<Humans>();
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().setPrettyPrinting().create();
        humansList.add(humans1);
        humansList.add(humans2);
        humansList.add(humans3);
        String s = gson.toJson(humansList);
        System.out.println(s);

    }

    @Test
    public void GsonFromStream() {

        try {
            if (createFile("GsonHum.txt")) {
                InputStream in = new FileInputStream("GsonHum.txt");
                InputStreamReader isr = new InputStreamReader(in);
                JsonReader jsonReader = new JsonReader(isr);
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                Humans res = gson.fromJson(jsonReader, Humans.class);
                System.out.println("Name:" + res.getProfile().getName());

            } else {
                System.out.println("File Not Exist");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private boolean createFile(String filename) {

        try {
            List<Humans> humansList = new ArrayList<Humans>();
            Gson gson = new GsonBuilder().enableComplexMapKeySerialization().setPrettyPrinting().create();
            humansList.add(humans1);
            humansList.add(humans2);
            humansList.add(humans3);
            String s = gson.toJson(humansList);
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
