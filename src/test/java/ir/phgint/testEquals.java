package ir.phgint;

import ir.phgint.Enum.*;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class testEquals {

    private Animals a1,a2, a3,a4;

    @Before
    public  void initObjectJanevaran(){
        a1 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        a2 =  Animals.getAnimalsInstance("Dog", AnimalBehavior.Domestic, true, Foods.Carnivorous, "Hop Hop", Habitats.Dry, Pregnant.Viviparous, true, true);
        a3 =  Animals.getAnimalsInstance("Lion", AnimalBehavior.Wild, true, Foods.Carnivorous, "Kh Kh", Habitats.Jungle, Pregnant.Viviparous, true, true);

    }

    @Test
    public  void  testReflexiveEqualsAnimals() {
        Assert.assertEquals("Reflexive a1",true,a1.equals(a1));
        Assert.assertEquals("Reflexive a2", true, a2.equals(a2));
        Assert.assertEquals("Reflexive a3",true,a3.equals(a3));
    }
    @Test
    public  void  testSymmetricEqualsAnimals() {
        Assert.assertEquals("Symmetric a1,a2",a1.equals(a2),a2.equals(a1));
        Assert.assertEquals("Symmetric a1,a3",a1.equals(a3),a3.equals(a1));
        Assert.assertEquals("Symmetric a2,a3",a2.equals(a3),a3.equals(a2));
    }
    @Test
    public  void  testTransitiveEqualsAnimals() {
        Assert.assertTrue("Transitive a1,a2,a3",a1.equals(a2));
        Assert.assertFalse("Transitive a1,a2,a3", a2.equals(a3));
        Assert.assertFalse("Transitive a1,a3", a1.equals(a3));
    }
    @Test
    public  void  testConsistentEqualsAnimals() {

        Assert.assertTrue("Consistent a1,a2",a1.equals(a2));
        Assert.assertFalse("Consistent a1,a3",a1.equals(a3));
        Assert.assertFalse("Consistent a2,a3",a2.equals(a3));
    }
    @Test
    public void testNotNullEqualsAnimals(){
        Assert.assertNotNull(a1);
        Assert.assertNotNull(a2);
        Assert.assertNotNull(a3);
    }
    @Test
    public void testNullEqualsAnimals(){
        Assert.assertNull(a4);
    }


}
