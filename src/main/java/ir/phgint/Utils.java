package ir.phgint;


import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Utils {

    public static void serializ(String filename, List<Humans> humansList) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(humansList);
            System.out.println("Data successfully written to a file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Humans> deSerializ(String filename) {
        try {
            List<Humans> humansList = new ArrayList<Humans>();
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            humansList = (List<Humans>) ois.readObject();
            ois.close();
            fis.close();
            return humansList;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}
