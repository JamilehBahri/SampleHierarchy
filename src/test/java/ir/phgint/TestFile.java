package ir.phgint;


import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class TestFile {
    private Animals animals1, animals2;
    private Humans humans1, humans2;
    private Birds birds1, birds2;
    private Janevaran.Profile profileAnimal1, profileAnimal2;
    private Janevaran.Profile profileHumans1, profileHumans2;
    private Janevaran.Profile profileBirds1, profileBirds2;

    @Before
    public void initObjectJanevaran() {

        profileAnimal1 = ProfileBuilder.getProfileInstance().name("Dog").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        animals1 = AnimalsBuilder.getAnimalsInstance(profileAnimal1).animalBehavior(Janevaran.AnimalBehavior.Domestic).isQuadruped(true).build();


        profileAnimal2 = ProfileBuilder.getProfileInstance().name("Cat").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        animals2 = AnimalsBuilder.getAnimalsInstance(profileAnimal2).animalBehavior(Janevaran.AnimalBehavior.Domestic).isQuadruped(true).build();

        profileHumans1 = ProfileBuilder.getProfileInstance().name("Mina").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        humans1 = HumansBuilder.getHumansInstance(profileHumans1).age(Janevaran.Ages.Baby).gender(Janevaran.Gender.Female).build();

        profileHumans2 = ProfileBuilder.getProfileInstance().name("Ali").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        humans2 = HumansBuilder.getHumansInstance(profileHumans2).age(Janevaran.Ages.Baby).gender(Janevaran.Gender.Female).build();

        profileBirds1 = ProfileBuilder.getProfileInstance().name("Ordak").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        birds1 = BirdsBuilder.getBirdsInstance(profileBirds1).canFly(true).hasFeather(true).build();

        profileBirds2 = ProfileBuilder.getProfileInstance().name("Eugle").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        birds2 = BirdsBuilder.getBirdsInstance(profileBirds2).canFly(false).hasFeather(true).build();

    }

    ////////////////////////Animals
    @Test
    public void writeTextToAnimalFile() {
        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("T-animal.txt"), "utf-8"));
            writer.write(animals1.toString());
            writer.write("-----------------------------------");
            writer.write(animals2.toString());
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readTextFromAnimalFile() {
        try {
            Reader reader = new InputStreamReader(new FileInputStream("T-animal.txt"), "UTF-8");
            Integer c;
            while ((c = reader.read()) != -1) {
                System.out.print(c);
            }
            reader.close();
//            BufferedReader reader = new BufferedReader(new FileReader("Tanimal.txt"));
//            StringBuffer fileData = new StringBuffer();
//            char[] buf = new char[1024];
//            int numRead=0;
//            while((numRead=reader.read(buf)) != -1){
//                String readData = String.valueOf(buf, 0, numRead);
//                fileData.append(readData);
//            }
//            reader.close();
//            System.out.println(fileData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void writeBinaryToAnimalFile() {
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("B-animal.txt")));
            out.writeUTF(animals1.toString());
            System.out.println();
            out.writeUTF(animals2.toString());
            out.flush();
            System.out.println("Data successfully written to a file");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @Test
    public void readBinaryFromAnimalFile() {

        try {
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("B-animal.txt")));
            while (in.available() > 0) {
                System.out.println(in.readUTF());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ////////////////////////Human
    @Test
    public void writeTextToHumanFile() {
        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("T-Human.txt"), "utf-8"));
            writer.write(humans1.toString());
            writer.write("-----------------------------------");
            writer.write(humans2.toString());
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readTextFromHumanFile() {
        try {
            Reader reader = new InputStreamReader(new FileInputStream("T-Human.txt"), "UTF-8");
            Integer c;
            while ((c = reader.read()) != -1) {
                System.out.print(c);
            }
            reader.close();
//            BufferedReader reader = new BufferedReader(new FileReader("Tanimal.txt"));
//            StringBuffer fileData = new StringBuffer();
//            char[] buf = new char[1024];
//            int numRead=0;
//            while((numRead=reader.read(buf)) != -1){
//                String readData = String.valueOf(buf, 0, numRead);
//                fileData.append(readData);
//            }
//            reader.close();
//            System.out.println(fileData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void writeBinaryToHumanFile() {
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("B-Human.txt")));
            out.writeUTF(humans1.toString());
            System.out.println();
            out.writeUTF(humans2.toString());
            out.flush();
            System.out.println("Data successfully written to a file");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @Test
    public void readBinaryFromHumanFile() {

        try {
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("B-Human.txt")));
            while (in.available() > 0) {
                System.out.println(in.readUTF());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ////////////////////////Bird
    @Test
    public void writeTextToBirdFile() {
        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("T-Bird.txt"), "utf-8"));
            writer.write(birds1.toString());
            writer.write("-----------------------------------");
            writer.write(birds2.toString());
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readTextFromBirdFile() {
        try {
            Reader reader = new InputStreamReader(new FileInputStream("T-Bird.txt"), "UTF-8");
            Integer c;
            while ((c = reader.read()) != -1) {
                System.out.print(c);
            }
            reader.close();
//            BufferedReader reader = new BufferedReader(new FileReader("Tanimal.txt"));
//            StringBuffer fileData = new StringBuffer();
//            char[] buf = new char[1024];
//            int numRead=0;
//            while((numRead=reader.read(buf)) != -1){
//                String readData = String.valueOf(buf, 0, numRead);
//                fileData.append(readData);
//            }
//            reader.close();
//            System.out.println(fileData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void writeBinaryToBirdFile() {
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("B-Bird.txt")));
            out.writeUTF(humans1.toString());
            System.out.println();
            out.writeUTF(humans2.toString());
            out.flush();
            System.out.println("Data successfully written to a file");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @Test
    public void readBinaryFromBirdFile() {

        try {
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("B-Bird.txt")));
            while (in.available() > 0) {
                System.out.println(in.readUTF());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
