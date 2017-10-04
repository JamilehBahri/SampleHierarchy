package ir.phgint;

import ir.phgint.Classes.*;
import ir.phgint.CodingStrategys.CodingStrategy;
import ir.phgint.CodingStrategys.StrategyCodingFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.*;


public class TestCodingStrategy {

    private Animals animals;
    private Humans humans;
    private Birds birds;

    private Janevaran.Profile profileAnimal;
    private Janevaran.Profile profileHumans;
    private Janevaran.Profile profileBirds;



    @Before
    public void initObjectJanevaran() {

        profileAnimal = ProfileBuilder.getProfileInstance().name("Dog").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        animals = AnimalsBuilder.getAnimalsInstance(profileAnimal).animalBehavior(Janevaran.AnimalBehavior.Domestic).isQuadruped(true).build();

        profileBirds = ProfileBuilder.getProfileInstance().name("Ordak").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        birds = BirdsBuilder.getBirdsInstance(profileBirds).canFly(true).hasFeather(true).build();

        profileHumans = ProfileBuilder.getProfileInstance().name("Mina").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
        humans = HumansBuilder.getHumansInstance(profileHumans).age(Janevaran.Ages.Baby).gender(Janevaran.Gender.Female).build();

    }

    @Test
    public void serializeXmlTest() {

        CodingStrategy<String> codingStrategy;
        codingStrategy = StrategyCodingFactory.codingStrategyFactory(StrategyCodingFactory.CodingStrategyType.xml);
        String res = codingStrategy.serialize(humans);
        saveFileText(res, "XmlFile", ".xml");
    }

    @Test
    public void deserializeXmlTest() {
        CodingStrategy<String> codingStrategy;
        codingStrategy = StrategyCodingFactory.codingStrategyFactory(StrategyCodingFactory.CodingStrategyType.xml);
        String data = readFileTextWithFileReader("XmlFile", ".xml");
        Humans res = (Humans) codingStrategy.deserialize(data);
        System.out.println(res);
    }

    @Test
    public void serializGsonTest() {
        CodingStrategy<String> codingStrategy;
        codingStrategy = StrategyCodingFactory.codingStrategyFactory(StrategyCodingFactory.CodingStrategyType.gson);
        String res = codingStrategy.serialize(humans);
        saveFileText(res, "GsonFile", ".txt");
    }

    @Test
    public void deserializeGsonTest() {
        CodingStrategy<String> codingStrategy;
        codingStrategy = StrategyCodingFactory.codingStrategyFactory(StrategyCodingFactory.CodingStrategyType.gson);
        String data = readFileTextWithFileReader("GsonFile", ".txt");
        Humans res = (Humans)codingStrategy.deserialize(data);
        System.out.println(res);
    }

    @Test
    public void serializBinaryTest() {
        CodingStrategy<byte[]> codingStrategy;
        codingStrategy = StrategyCodingFactory.codingStrategyFactory(StrategyCodingFactory.CodingStrategyType.binary);
        byte[] res = codingStrategy.serialize(humans);
        saveFileBinary(res, "BinaryFile", ".bin");
    }

    @Test
    public void deserializeBinaryTest() {
        CodingStrategy<byte[]> codingStrategy;
        codingStrategy = StrategyCodingFactory.codingStrategyFactory(StrategyCodingFactory.CodingStrategyType.binary);
        byte[] data =  readFileBinary("BinaryFile", ".bin");
        Humans res = (Humans) codingStrategy.deserialize(data);
        System.out.println(res);
    }

    @Test
    public void readFilesTest() {
        String data1 = readFileTextWithFileReader("XmlFile", ".xml");
        System.out.println(data1);
        String data2 = readFileTextWithBufferReader("XmlFile", ".xml");
        System.out.println(data2);
        String data3 = readFileTextWithFile("XmlFile", ".xml");
        System.out.println(data3);
    }
    @Test
    public void FactoryTest() {
        CodingStrategy codingStrategy;
        codingStrategy = StrategyCodingFactory.codingStrategyFactory(StrategyCodingFactory.CodingStrategyType.xml);

    }
    private byte[] readFileBinary(String filename, String type) {
        try {
            FileInputStream fis = new FileInputStream(filename + type);
            byte[] res = new byte[1024];
            fis.read(res, 0, 1024);
            return res;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String readFileTextWithFileReader(String filename, String type) {
        try {
            FileReader fr = new FileReader(filename + type);
            StringBuilder stringBuilder = new StringBuilder();
            char[] buffer = new char[32];
            int count;
            while ((count = fr.read(buffer, 0, 32)) != -1) {
                stringBuilder.append(buffer, 0, count);
            }
            return stringBuilder.toString();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String readFileTextWithBufferReader(String filename, String type) {
        try {
            FileReader fr = new FileReader(filename + type);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder stringBuilder = new StringBuilder();
            String contentLine;
            while ((contentLine = br.readLine()) != null) {
                stringBuilder.append(contentLine);
            }
            return stringBuilder.toString();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String readFileTextWithFile(String filename, String type) {
        try {
            File file = new File(filename + type);
            FileReader fr = new FileReader(file);
            int len = (int) file.length();
            char[] buffer = new char[len];
            fr.read(buffer, 0, len);
            String str = new String(buffer);
            return str;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void saveFileBinary(byte[] data, String filename, String type) {
        try {
            OutputStream fos = new FileOutputStream(filename + type);
            fos.write(data);
            fos.flush();
            System.out.println("Data successfully written to a file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveFileText(String data, String filename, String type) {
        try {
            FileWriter fos = new FileWriter(filename + type);
            fos.write(data);
            fos.flush();
            System.out.println("Data successfully written to a file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
