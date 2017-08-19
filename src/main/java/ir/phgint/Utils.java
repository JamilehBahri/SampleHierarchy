package ir.phgint;


import java.io.*;

public class Utils {

    public static void serializ(String filename,Object[] objects) {
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename)));

            for (Object obj : objects)
            {
                out.writeUTF(obj.toString());
            }
            out.flush();
            System.out.println("Data successfully written to a file");

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void dSerializ(String filename)
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuffer fileData = new StringBuffer();
            char[] buf = new char[1024];
            int numRead=0;
            while((numRead=reader.read(buf)) != -1){
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
            }
            reader.close();
            System.out.println(fileData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
