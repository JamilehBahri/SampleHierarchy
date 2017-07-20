package ir.phgint;

import java.io.*;

/**
 * Created by Jamile on 09/06/2017.
 */
public class Serialization {

    public static void serialize(Object obj, String fileName)throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        fos.close();
    }

    public static Object deserialize(String fileName) throws IOException,ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }
}
