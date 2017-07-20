package ir.phgint;

import ir.phgint.Enum.*;
import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;


public class testPrintInfo {

    static ArrayList<Janevaran> objects;

    @BeforeClass
    public static void initObjectJanevaran(){
        objects = new ArrayList<Janevaran>();
        objects.add(new Animals("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true));
        objects.add(new Humans("Ali", Gender.Male, Ages.Middleage, Foods.Carnivorous, "Voice", Habitats.Dry, Pregnant.Viviparous, false, true));
        objects.add(new Birds("Eagle", true, true, Foods.Carnivorous, "Ji ... Ji", Habitats.Mountain, Pregnant.Oviparous));

    }

    @Test
    public  void  testPrintJanevaranInfo() {

        Iterator objectsIterator = objects.iterator();
        while (objectsIterator.hasNext()) {
            Janevaran janevaran = (Janevaran) objectsIterator.next();
            System.out.println(janevaran); //invoke toString()
            System.out.println("********************************************");

        }


    }

    }
