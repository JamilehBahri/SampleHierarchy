package ir.phgint;


import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Utils {

    public static void serialize(String filename, List<Humans> humansList) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(humansList);
            System.out.println("Data successfully written to a file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Humans> deSerialize(String filename) {
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

    public static void serialize2(String filename, List<Humans> humansList) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutput out = new ObjectOutputStream(bos);
            FileOutputStream fos = new FileOutputStream(filename);
            for (Humans humans : humansList) {
                out.writeObject(humans);
                out.flush();
                byte[] humansBytes = bos.toByteArray();
                byte[] a = intToByteArray(humansBytes.length);
                fos.write(a);
                fos.write(humansBytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Humans> deSerialize2(String filename) {
        List<Humans> humansList = new ArrayList<Humans>();
        try {
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
//            byte[] buffer = new byte[(int) file.length()];
//            fis.read(buffer, 0, buffer.length);
            byte[] headobj = new byte[4];
            fis.read(headobj, 0, 3);
            int head = getInt(headobj);

            byte[] buffer = new byte[head];
            fis.read(buffer, 4, (buffer.length) - 1);

            ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
            ObjectInput in = new ObjectInputStream(bis);
            Humans humans = (Humans) in.readObject();

            System.out.println(humans);


//            for (int X : buffer) {
//                System.out.print((char) X);
//            }
//            int head = java.nio.ByteBuffer.wrap(headobj).order(java.nio.ByteOrder.LITTLE_ENDIAN).getInt();
//            ByteArrayOutputStream  bis = new ByteArrayOutputStream ();
//            int read = 0;
//            while ((read = fis.read(buffer)) != -1) {
//                bis.write(buffer, 0, read);
//            }
//            byte[] a=   bis.toByteArray();
//            System.out.println(a);
//            ObjectInput in = new ObjectInputStream(bis);
//            Humans humans= (Humans) in.readObject();
//            System.out.println(fis);
//            ByteArrayInputStream bis = new ByteArrayInputStream(b);
//            ObjectInput in = new ObjectInputStream(bis);
//              Humans humans= (Humans) ois.readObject();
//            ByteArrayInputStream bis = new ByteArrayInputStream(b);
//            ObjectInput in = new ObjectInputStream(bis);
//            humansList = (List<Humans>) in;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int getInt(byte[] array) {
        return
                ((array[0] & 0xff) << 24) |
                        ((array[1] & 0xff) << 16) |
                        ((array[2] & 0xff) << 8) |
                        (array[3] & 0xff);
    }

    public static final byte[] intToByteArray(int value) {
        return new byte[]{
                (byte) (value >>> 24),
                (byte) (value >>> 16),
                (byte) (value >>> 8),
                (byte) value};
    }
}

