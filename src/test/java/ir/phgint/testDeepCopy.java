package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testDeepCopy {

    private Janevaran janvar1,janvar2;

    @Before
    public void initObjectJanevaran(){
        janvar1 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        janvar2 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
    }

    @Test
    public void testDeepCopyCheckRef(){
      Assert.assertNotEquals(janvar2,janvar1.deepCopy());
    }
    @Test
    public void testDeepCopyCheckEqulity(){
        Janevaran j1=janvar1.deepCopy();
        Janevaran j2=janvar2.deepCopy();
        Assert.assertTrue(j1.equals(j2));

    }
    @Test
    public void testDeepCopyFromCheckRef(){

        janvar1.deepCopyFrom(janvar2);
        Assert.assertNotEquals(janvar1, janvar2);
    }
    @Test
    public void testDeepCopyFromCheckEqulity(){

        janvar1.deepCopyFrom(janvar2);
        janvar2.deepCopyFrom(janvar1);
        Assert.assertTrue(janvar1.equals(janvar2));
    }

}

