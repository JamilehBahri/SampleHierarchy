package ir.phgint;


public class StrategyCodingFactory {

    public static CodingStrategy codingStrategyFactory(CodingStrategyType type)
    {
        if (type.equals(CodingStrategyType.xml))
            return new XmlCodingStrategy();

        else if(type.equals(CodingStrategyType.gson))
            return  new GsonCodingStrategy();

        else if(type.equals(CodingStrategyType.binary))
            return new BinaryCodingStrategy();
        else
            return null;
    }

   public enum CodingStrategyType {
        xml,
        gson,
        binary
    }

}
