package ir.phgint;

import ir.phgint.Enum.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testShallowCopy {

    private Janevaran janvar1,janvar2;

    @Before
    public void initObjectJanevaran() {
        janvar1 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        janvar2 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);

    }
    @Test
    public void testShallowCopyCheckRef(){

        Janevaran j=janvar1.shallowCopy();
        Assert.assertNotEquals(janvar2,j);

    }
    @Test
    public void testShallowCopyCheckEqulity(){
        Janevaran j1=janvar1.shallowCopy();
        Janevaran j2=janvar2.shallowCopy();
        Assert.assertTrue(j1.equals(j2));

    }
    @Test
    public void testShallowCopyFromCheckRef(){

        janvar1.shallowCopyFrom(janvar2);
        Assert.assertNotEquals(janvar1, janvar2);
    }
    @Test
    public void testShallowCopyFromCheckEqulity(){

        janvar1.shallowCopyFrom(janvar2);
        janvar2.shallowCopyFrom(janvar1);
        Assert.assertTrue(janvar1.equals(janvar2));
    }

}


