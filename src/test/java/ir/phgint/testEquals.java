package ir.phgint;

import ir.phgint.Enum.*;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Jamile on 11/06/2017.
 */
public class testEquals {

    static Animals a1,a2, a3,a4;

    @BeforeClass
    public static void initObjectJanevaran(){
        a1 = new Animals("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        a2 = new Animals("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        a3 = new Animals("Lion", AnimalBehavior.Wild, true, Foods.Carnivorous, "Kh Kh", Habitats.Jungle, Pregnant.Viviparous, true, true);
    }

    @Test
    public  void  testReflexiveEquals() {
        Assert.assertEquals("Reflexive a1",true,a1.equals(a1));
        Assert.assertEquals("Reflexive a2", true, a2.equals(a2));
        Assert.assertEquals("Reflexive a3",true,a3.equals(a3));
    }
    @Test
    public  void  testSymmetricEquals() {
        Assert.assertEquals("Symmetric a1,a2",a1.equals(a2),a2.equals(a1));
        Assert.assertEquals("Symmetric a1,a3",a1.equals(a3),a3.equals(a1));
        Assert.assertEquals("Symmetric a2,a3",a2.equals(a3),a3.equals(a2));
    }
    @Test
    public  void  testTransitiveEquals() {

        Assert.assertEquals("Transitive a1,a2,a3",a1.equals(a2),a2.equals(a3));
        Assert.assertEquals("Transitive a1,a3", false, a1.equals(a3));
    }
    @Test
    public  void  testConsistentEquals() {

        Assert.assertEquals("Consistent a1,a2",false,a1.equals(a2));
        Assert.assertEquals("Consistent a1,a3",false,a1.equals(a3));
        Assert.assertEquals("Consistent a2,a3",false,a2.equals(a3));
    }
    @Test
    public void testNotNullEquals(){
        Assert.assertNotNull(a1);
        Assert.assertNotNull(a2);
        Assert.assertNotNull(a3);

    }
    @Test
    public void testNullEquals(){
        Assert.assertNull(a4);
    }



}
