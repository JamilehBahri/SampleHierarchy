package ir.phgint;

import ir.phgint.Classes.AnimalsBuilder;
import ir.phgint.Classes.Janevaran;
import ir.phgint.Classes.ProfileBuilder;
import ir.phgint.Copyables.DeepCopyable;
import ir.phgint.Copyables.ShallowCopyable;
import org.junit.Before;
import org.junit.Test;
import ir.phgint.Classes.Janevaran.*;

import java.lang.reflect.Proxy;

/**
 * Created by Jamile on 10/4/2017.
 */
public class TestDynamicProxy {
    private Profile profileAnimal;

    @Before
    public void createObject() {
        profileAnimal = ProfileBuilder.getProfileInstance().name("Dog").foodType(Janevaran.Foods.Carnivorous).talk("Hop").habitats(Janevaran.Habitats.Dry)
                .birthType(Janevaran.Pregnant.Viviparous).build();
    }

    @Test
    public void testDynamicProxy_DeepCopy() {
        try {
            DeepCopyable deepCopyable = AnimalsBuilder.getAnimalsInstance(profileAnimal).animalBehavior(Janevaran.AnimalBehavior.Domestic).isQuadruped(true).build();
            MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
            myInvocationHandler.setTarget(deepCopyable);

            Object proxyObject =  Proxy.newProxyInstance(DeepCopyable.class.getClassLoader(),
                    new Class[]{DeepCopyable.class, ShallowCopyable.class},
                    myInvocationHandler);
            ((DeepCopyable)proxyObject).deepCopy();
            ((ShallowCopyable)proxyObject).shallowCopy();
            //Illegal Exception because Animal not implement Coding Strategy ( in newProxyInstance adding CodingStrategy.class)
//            ((CodingStrategy)proxyObject).serialize("");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

  }
