package ir.phgint.CodingStrategys;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ir.phgint.Classes.Humans;

public class GsonCodingStrategy implements CodingStrategy<String> {

    @Override
    public String serialize(Object obj) {
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization().setPrettyPrinting().create();
        String res = gson.toJson(obj);
        return res;
    }

    @Override
    public Object deserialize(String data) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Object res = gson.fromJson(data,Humans.class);
        return res;
    }
}
