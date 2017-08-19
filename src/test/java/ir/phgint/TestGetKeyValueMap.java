package ir.phgint;

import org.junit.Test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class TestGetKeyValueMap {

    @Test
    public void hashTableTest()
    {
        Map<String,String> hashTable = new Hashtable<String, String>();

        hashTable.put("Dog1","Dog11" );
        hashTable.put("Dog2", "Dog22");
        hashTable.put("Cat1", "Cat11");
        hashTable.put("Cat2","Cat22");

        for (Map.Entry<String, String> entry : hashTable.entrySet())
        {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }


    }

}
