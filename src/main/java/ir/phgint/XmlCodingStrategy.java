package ir.phgint;


import com.sun.xml.internal.ws.streaming.DOMStreamReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class XmlCodingStrategy implements CodingStrategy<String> {

    @Override
    public String serialize(Object obj) {
        try {

            StringWriter stringWriter = new StringWriter();
            JAXBContext jaxbContext = JAXBContext.newInstance(Humans.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(obj, stringWriter);
            return stringWriter.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object deserialize(String data) {
        try {
            StringReader stringReader = new StringReader(data) ;
            JAXBContext jaxbContext = JAXBContext.newInstance(Humans.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Object res = unmarshaller.unmarshal(stringReader);
            return res;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}


