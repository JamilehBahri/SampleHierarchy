package ir.phgint.CodingStrategys;


import java.io.*;

public class BinaryCodingStrategy implements CodingStrategy<byte[]> {
    @Override
    public byte[] serialize(Object obj) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutput out = new ObjectOutputStream(bos);
            out.writeObject(obj);
            out.flush();
            byte[] Bytes = bos.toByteArray();
            return Bytes;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object deserialize(byte[] obj) {
        try {

            ByteArrayInputStream bis = new ByteArrayInputStream(obj);
            ObjectInput in = new ObjectInputStream(bis);
            Object res = in.readObject();
            return res;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }



}
