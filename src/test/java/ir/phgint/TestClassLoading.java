package ir.phgint;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jamile on 9/28/2017.
 */
public class TestClassLoading {

    @Test
    public void animalsLoaderClass() {
        try {
            String className = Animals.class.getName();
            ClassLoader loader = Animals.class.getClassLoader();
            Class<Animals> c = (Class<Animals>) loader.loadClass(className);
            // Exception : can not assign becuase c and animals loaded with diffrent Class loader
            Animals animals = c.newInstance();

            Assert.assertNotEquals(c,animals);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }

}
