package ir.phgint;

import java.io.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Jamile on 09/06/2017.
 */
public class Serialization {

    public static void serialize(Janevaran obj, String fileName) throws IOException {

        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();
        fos.close();
    }

    public static Janevaran deserialize(String fileName) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Janevaran obj = (Janevaran) ois.readObject();
        ois.close();
        fis.close();
        return obj;
    }

}
