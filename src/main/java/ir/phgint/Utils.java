package ir.phgint;


import ir.phgint.Classes.Humans;

import java.io.*;
import java.util.*;

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
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            ObjectOutput out = new ObjectOutputStream(bos);
            FileOutputStream fos = new FileOutputStream(filename);
            for (Humans humans : humansList) {
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutput out = new ObjectOutputStream(bos);
                out.writeObject(humans);
                out.flush();

                byte[] humansBytes = bos.toByteArray();
                byte[] a = intToByteArray(humansBytes.length);
                out.close();
                bos.close();
                fos.write(a);
                fos.write(humansBytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Humans> deSerialize2(String filename) {
        try {
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);


            Map<Integer,FileInfo> fileInfoMap = new Hashtable<>(3);

            byte[] headobj = new byte[4];

            int offset =4;
            int headerLength = 4;
            int index = 0;
            while(fis.available() != 0) {
                fis.read(headobj, 0, headobj.length);
                int lenObject = getInt(headobj);
                FileInfo fileInfo = new FileInfo();
                fileInfo.item = index;
                fileInfo.len = lenObject;
                fileInfo.offset =offset;
                byte[] tmp = new byte[lenObject];
                fis.read(tmp, 0, lenObject);
                fileInfoMap.put(index, fileInfo);
                index++;
                offset += lenObject+headerLength;
            }
            fis.close();

            RandomAccessFile randomAccessFile = new RandomAccessFile(filename, "r");
            final List<Humans> humansList = new ArrayList<Humans>(index);


            fileInfoMap.forEach((idx, fileInfo) -> {
                try {
                    randomAccessFile.seek(fileInfo.offset);
                    byte[] buf = new byte[fileInfo.len];
                    randomAccessFile.read(buf, 0, fileInfo.len);
                    ByteArrayInputStream bis = new ByteArrayInputStream(buf);
                    ObjectInput in = new ObjectInputStream(bis);
                    Humans humans = (Humans) in.readObject();
                    humansList.add(humans);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });

            humansList.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
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

    private static class FileInfo {

        private int item ;
        private int offset ;
        private int len;


    }

}

